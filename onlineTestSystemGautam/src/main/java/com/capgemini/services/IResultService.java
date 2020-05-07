package com.capgemini.services;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.capgemini.entity.Tests;
 

public interface IResultService {
	public Double getResult(Integer testId);
	public Double calculateTotalMarks(Integer testId);
	List<Tests> getResultList();
	
	}
	
	
	

