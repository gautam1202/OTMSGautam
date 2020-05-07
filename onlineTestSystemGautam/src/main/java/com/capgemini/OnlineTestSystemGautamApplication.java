package com.capgemini;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.capgemini.dao.IResultDao;

import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

@SpringBootApplication
public class OnlineTestSystemGautamApplication implements CommandLineRunner{
	@Autowired
	IResultDao resultdao;
	//IQuestionDao quesdao;

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestSystemGautamApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Tests t = new Tests();
		t.setTestTitle("SpringBoot");
		//t.setTestId(105);
		t.setTestTotalMarks(15.0);
		t.setTestMarksScored(0.0);
		
		Set<Question> question=new HashSet<>();
		Question ques=new Question();
		ques.setChosenAnswer(1);
		ques.setMarksScored(0.0);
		ques.setQuestionAnswer(2);
		ques.setQuestionMarks(5.0);
		ques.setOption1("opt1");
		ques.setOption2("opt2");
		ques.setOption3("opt3");
		ques.setOption4("opt4");
		ques.setQuestionTitle("questionTitle");
		question.add(ques);
		
		Question ques2=new Question();
		ques2.setChosenAnswer(2);
		ques2.setMarksScored(0.0);
		ques2.setQuestionAnswer(2);
		ques2.setQuestionMarks(5.0);
		ques2.setOption1("opt1");
		ques2.setOption2("opt2");
		ques2.setOption3("opt3");
		ques2.setOption4("opt4");
		ques2.setQuestionTitle("questionTitle");
		question.add(ques2);
		

		Question ques3=new Question();
		ques3.setChosenAnswer(2);
		ques3.setMarksScored(0.0);
		ques3.setQuestionAnswer(1);
		ques3.setQuestionMarks(5.0);
		ques3.setOption1("opt1");
		ques3.setOption2("opt2");
		ques3.setOption3("opt3");
		ques3.setOption4("opt4");
		ques3.setQuestionTitle("questionTitle");
		question.add(ques3);
		
		t.setTestQuestions(question);

		resultdao.saveTests(t);	
		
		
		
		Tests t2 = new Tests();
		t2.setTestTitle("Spring");
		//t.setTestId(105);
		t2.setTestTotalMarks(15.0);
		t2.setTestMarksScored(0.0);
		
		Set<Question> question2=new HashSet<>();
		Question ques4=new Question();
		ques4.setChosenAnswer(1);
		ques4.setMarksScored(0.0);
		ques4.setQuestionAnswer(2);
		ques4.setQuestionMarks(5.0);
		ques4.setOption1("opt1");
		ques4.setOption2("opt2");
		ques4.setOption3("opt3");
		ques4.setOption4("opt4");
		ques4.setQuestionTitle("questionTitle");
		question2.add(ques4);
		
		Question ques5=new Question();
		ques5.setChosenAnswer(2);
		ques5.setMarksScored(0.0);
		ques5.setQuestionAnswer(2);
		ques5.setQuestionMarks(5.0);
		ques5.setOption1("opt1");
		ques5.setOption2("opt2");
		ques5.setOption3("opt3");
		ques5.setOption4("opt4");
		ques5.setQuestionTitle("questionTitle");
		question2.add(ques5);
		

		Question ques6=new Question();
		ques6.setChosenAnswer(2);
		ques6.setMarksScored(0.0);
		ques6.setQuestionAnswer(2);
		ques6.setQuestionMarks(5.0);
		ques6.setOption1("opt1");
		ques6.setOption2("opt2");
		ques6.setOption3("opt3");
		ques6.setOption4("opt4");
		ques6.setQuestionTitle("questionTitle");
		question2.add(ques6);
		
		t2.setTestQuestions(question2);

		resultdao.saveTests(t2);	


		Tests t3 = new Tests();
		t3.setTestTitle("Java");
		t3.setTestTotalMarks(20.0);
		t3.setTestMarksScored(0.0);
		
		Set<Question> question3=new HashSet<>();
		Question ques7=new Question();
		ques7.setChosenAnswer(1);
		ques7.setMarksScored(0.0);
		ques7.setQuestionAnswer(2);
		ques7.setQuestionMarks(5.0);
		ques7.setOption1("opt1");
		ques7.setOption2("opt2");
		ques7.setOption3("opt3");
		ques7.setOption4("opt4");
		ques7.setQuestionTitle("questionTitle");
		question3.add(ques7);
		
		Question ques8=new Question();
		ques8.setChosenAnswer(2);
		ques8.setMarksScored(0.0);
		ques8.setQuestionAnswer(1);
		ques8.setQuestionMarks(5.0);
		ques8.setOption1("opt1");
		ques8.setOption2("opt2");
		ques8.setOption3("opt3");
		ques8.setOption4("opt4");
		ques8.setQuestionTitle("questionTitle");
		question3.add(ques8);
		

		Question ques9=new Question();
		ques9.setChosenAnswer(2);
		ques9.setMarksScored(0.0);
		ques9.setQuestionAnswer(1);
		ques9.setQuestionMarks(5.0);
		ques9.setOption1("opt1");
		ques9.setOption2("opt2");
		ques9.setOption3("opt3");
		ques9.setOption4("opt4");
		ques9.setQuestionTitle("questionTitle");
		question3.add(ques9);
		
		
		Question ques11=new Question();
		ques11.setChosenAnswer(2);
		ques11.setMarksScored(0.0);
		ques11.setQuestionAnswer(2);
		ques11.setQuestionMarks(5.0);
		ques11.setOption1("opt1");
		ques11.setOption2("opt2");
		ques11.setOption3("opt3");
		ques11.setOption4("opt4");
		ques11.setQuestionTitle("questionTitle");
		question3.add(ques11);
		
		t3.setTestQuestions(question3);

		resultdao.saveTests(t3);	

	}
}



