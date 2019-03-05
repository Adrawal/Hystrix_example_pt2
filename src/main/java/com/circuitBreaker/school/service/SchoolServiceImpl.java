package com.circuitBreaker.school.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.circuitBreaker.school.view.Schooldata;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	@HystrixCommand(fallbackMethod = "getAllSchoolList")
	public ArrayList<Schooldata> getSchool() {
		ArrayList<Schooldata>schoolList = new ArrayList<>();
		Schooldata washingtonschool = new Schooldata();
		washingtonschool.setSchoolName("Washington Junior High School");
		washingtonschool.setSchooladdress("washingtod DC");
		washingtonschool.setSchoolPhoneNumber(123456789);
		schoolList.add(washingtonschool);
		
		Schooldata newYorkSchool = new Schooldata();
		newYorkSchool.setSchoolName("newYork senior High School");
		newYorkSchool.setSchooladdress("new York DC");
		newYorkSchool.setSchoolPhoneNumber(987654321);
		schoolList.add(newYorkSchool);
		
		Schooldata losAngelesSchool = new Schooldata();
		losAngelesSchool.setSchoolName("los angeles High School");
		losAngelesSchool.setSchooladdress("LOS Angels DC");
		losAngelesSchool.setSchoolPhoneNumber(13578642);
		schoolList.add(losAngelesSchool);
		
		return schoolList;
	}

	@Override
	public Schooldata schoolRecords(String schoolName) {
		Schooldata schoolInfo = null;
		switch(schoolName){
		
		case "Washington Junior High School":{
			 schoolInfo = new Schooldata();
			schoolInfo.setSchoolName("Washington Junior High School");
			schoolInfo.setSchooladdress("washingtod DC");
			schoolInfo.setSchoolPhoneNumber(123456789);
			
		}
		case "newYork senior High School":{
			 schoolInfo = new Schooldata();
			schoolInfo.setSchoolName("newYork senior High School");
			schoolInfo.setSchooladdress("new York DC");
			schoolInfo.setSchoolPhoneNumber(987654321);
		}case"los angeles High School":{
			 schoolInfo = new Schooldata();
			schoolInfo.setSchoolName("los angeles High School");
			schoolInfo.setSchooladdress("LOS Angels DC");
			schoolInfo.setSchoolPhoneNumber(13578642);
			
		}default:{
			 schoolInfo = new Schooldata();
			
		}
			
		}
				
		
		return schoolInfo;
	}
	
	public ArrayList<Schooldata> getAllSchoolList(){
		ArrayList<Schooldata>schoolList = new ArrayList<>();
		Schooldata washingtonschool = new Schooldata();
		washingtonschool.setSchoolName("Washington Junior High School");
		washingtonschool.setSchooladdress("washingtod DC");
		washingtonschool.setSchoolPhoneNumber(123456789);
		schoolList.add(washingtonschool);
		
		Schooldata newYorkSchool = new Schooldata();
		newYorkSchool.setSchoolName("newYork senior High School");
		newYorkSchool.setSchooladdress("new York DC");
		newYorkSchool.setSchoolPhoneNumber(987654321);
		schoolList.add(newYorkSchool);
		
		Schooldata losAngelesSchool = new Schooldata();
		losAngelesSchool.setSchoolName("los angeles High School");
		losAngelesSchool.setSchooladdress("LOS Angels DC");
		losAngelesSchool.setSchoolPhoneNumber(13578642);
		schoolList.add(losAngelesSchool);
		
		return schoolList;
		
	}
	
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
