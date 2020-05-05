  
package com.capgemini.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;
import com.capgemini.services.ResultServiceImp;

@RestController
@CrossOrigin("*")


public class ResultController {
	@Autowired
	ResultServiceImp resultservice;
	
	public ResultController()
	{
		
	}
		
	@RequestMapping("/")
	public String check() {
		return "WORKING";
	}
	
	
	@GetMapping("/getresultlist")
	  public ResponseEntity<List<Tests>> fetchStudent()
	  {
		  List<Tests> testList=resultservice.getResultList();
		  return new ResponseEntity<List<Tests>>(testList,HttpStatus.OK);
	  }
	 
	@GetMapping("/getresult/{testId}")
	public ResponseEntity<Double> getResult(@PathVariable("testId") Integer testId)
	{
		Double marks=resultservice.getResult(testId);
		//getResult(test);
		return new ResponseEntity<Double>(marks,HttpStatus.OK);
	
	}

	
	@GetMapping("/calculate-marks/{testId}")
	public ResponseEntity<Double> calculateTotalMarks(@PathVariable("testId") Integer testId)
	{
		Double totalresult=resultservice.calculateTotalMarks(testId);
		return new ResponseEntity<Double>(totalresult,HttpStatus.OK);
	
	}
	  
  }