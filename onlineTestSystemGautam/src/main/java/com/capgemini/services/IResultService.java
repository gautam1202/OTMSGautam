package com.capgemini.services;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.capgemini.entity.Tests;
import com.capgemini.exceptions.RecordNotFoundException;


public interface IResultService {
	public Double getResult(Integer testId);
	public Double calculateTotalMarks(Integer testId) throws RecordNotFoundException;
	List<Tests> getResultList();
	
	}
	
	
	

