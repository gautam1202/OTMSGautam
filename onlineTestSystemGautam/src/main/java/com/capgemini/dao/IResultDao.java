	package com.capgemini.dao;

	import java.math.BigDecimal;
import java.math.BigInteger;
	import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

	@Repository
	public interface IResultDao 
	{
		
		public void saveTests(Tests test);
		public Tests getTests(Integer testId);
//		public List retrieve();
		List<Tests> getTestList();
		public Optional<Tests> findById(Integer testId);
	
		

	}
	
