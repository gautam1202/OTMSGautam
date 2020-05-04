package com.capgemini.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="QuestionsTable")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer questionId;
	//@Column
	//private String questionOptions[]=new String[3];
	@Column
	private String option1;
	@Column
	private String option2;
	@Column
	private String option3;
	@Column
	private String option4;
	@Column
	private String questionTitle;
	@Column
	private Integer questionAnswer;
	@Column
	private Double questionMarks;
	@Column
	private Integer chosenAnswer;
	@Column
	private Double marksScored;
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public Integer getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(Integer questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public Double getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(Double questionMarks) {
		this.questionMarks = questionMarks;
	}
	public Integer getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(Integer chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public Double getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(Double marksScored) {
		this.marksScored = marksScored;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	
	}
