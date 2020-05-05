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

	@Override
	public Double getResult(Integer testId) {
		Tests test = resultdao.getTests(testId);
		return test.getTestMarksScored();
	}

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

	@Override
	public List<Tests> getResultList() {
		return resultdao.getTestList();
	}

}

/*
 * if( User.isAdmin != true) { return dao.getResult(test); } else { throw new
 * NotStudentException("Only student can give the test");
 * 
 * } }
 * 
 * void validateUserId(long userId) { if (userId <= 0) { throw new
 * IncorrectIdException("User id is null"); } }
 * 
 * void validatetestId(BigInteger testId) { if ( testId.equals(null)) { throw
 * new IncorrectIdException("test id is null"); } } }
 * 
 * void validatequestionId(BigInteger questionId) { if (
 * questionId.equals(null)) { throw new
 * IncorrectIdException("question id is null"); } }
 */
