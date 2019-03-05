package com.circuitBreaker.school.service;

import java.util.ArrayList;

import com.circuitBreaker.school.view.Schooldata;

public interface SchoolService {
	
	public ArrayList<Schooldata> getSchool();
	
	public Schooldata schoolRecords(String schoolName);
	

	
}
