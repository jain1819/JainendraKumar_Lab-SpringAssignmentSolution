package com.gl.Lab6.StudentSecuritySpring.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.Lab6.StudentSecuritySpring.Entity.Student;
import com.gl.Lab6.StudentSecuritySpring.Service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	//add mapping for "/list"
	
	@RequestMapping("/list")
	public String listBooks(Model theModel) {
		
		//get Students from DB
		List<Student> theStudent = studentService.findAll();
		
		//add the spring model
		theModel.addAttribute("Students", theStudent);
		
		return "list-Students";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("Student", theStudent);
		return "Student-form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int theId, Model theModel) {
		Student theStudent = studentService.findById(theId);
		theModel.addAttribute("Student", theStudent);
		return "Student-form";
	}

	@PostMapping("/save")
	public String saveStudent(
		@RequestParam("id") int id,
		@RequestParam("name") String name,
		@RequestParam("country") String country,
		@RequestParam("department") String dept
	) {

		System.out.println(id);
		Student theStudent;
		if (id != 0) {
			theStudent = studentService.findById(id);
			theStudent.setName(name);
			theStudent.setCountry(country);
			theStudent.setDept(dept);
		} else
			theStudent = new Student(name, country, dept);

		studentService.save(theStudent);
		return "redirect:/students/list";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int theId) {
		studentService.deleteById(theId);
		return "redirect:/students/list";

	}

	@RequestMapping(value = "/403")
	public ModelAndView accesssDenied(Principal user) {
		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Hi " + user.getName() + ", you do not have permission to access this page!");
		} else {
			model.addObject("msg", "You do not have permission to access this page!");
		}

		model.setViewName("403");
		return model;
	}
	
}
