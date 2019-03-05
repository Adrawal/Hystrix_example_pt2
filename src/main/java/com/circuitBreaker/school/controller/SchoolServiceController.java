package com.circuitBreaker.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuitBreaker.school.service.SchoolService;
import com.circuitBreaker.school.view.Schooldata;

@RestController
@RequestMapping("/schoolservice")
public class SchoolServiceController {
	@Autowired
	private SchoolService schoolService;
	
	
	@GetMapping("/getAllSchools")
	public List<Schooldata> getAllSchools(){
		return schoolService.getSchool();
		
	}
	
	@GetMapping("/getschoolinfo{schoolName}")
	public Schooldata getSchoolByName(@PathVariable String schoolName) {
		
		
		return schoolService.schoolRecords(schoolName);
		
	}

}



