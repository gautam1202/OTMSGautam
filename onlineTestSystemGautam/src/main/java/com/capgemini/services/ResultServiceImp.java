package com.capgemini.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import com.capgemini.dao.*;
import com.capgemini.entity.*;
import com.capgemini.exceptions.RecordNotFoundException;
import com.capgemini.exceptions.TestNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResultServiceImp implements IResultService {

	@Autowired
	IResultDao resultdao;
	
	
	
	/****************************************************************
	 * Method - getResult
	 * description - to get the result of the tests
	 * @param testId - Test's id
	 * @return - object of class Test
	 * @author - Gautam Anand
	 * created date - 17-APR-2020
	 ******************************************************************/

	@Override
	public Double getResult(Integer testId) {
		Tests test = resultdao.getTests(testId);
		return test.getTestMarksScored();
	}
	
	
	
	/****************************************************************
	 * Method - calculate total marks
	 * description - to calculate the result of the test
	 * @param testId - Test's id
	 * @return -  of class Test
	 * @author - Gautam Anand
	 * created date - 17-APR-2020
	 ******************************************************************/

	@Override
	public Double calculateTotalMarks(Integer testId) {
		Tests test = resultdao.getTests(testId);
		Set<Question> testQuestions = test.getTestQuestions();
		Iterator<Question> testQuestionIterator = testQuestions.iterator();
		Double testTotalMarks = new Double(0);
		while (testQuestionIterator.hasNext()) {
			Question question = testQuestionIterator.next();
			if (question.getChosenAnswer().equals(question.getQuestionAnswer())) {
				question.setMarksScored(question.getQuestionMarks());
				testTotalMarks += question.getMarksScored();
			}
		}
		test.setTestMarksScored(testTotalMarks);
		return testTotalMarks;
	}

	/****************************************************************
	 * Method - getAllTest
	 * description - get all the data from the table
	 * @return - all the object of class Test
	 * @author - Gautam Anand
	 * created date - 21-APR-2020
	 ******************************************************************/
	
	@Override
	public List<Tests> getResultList() {
		return resultdao.getTestList();
	}

}
