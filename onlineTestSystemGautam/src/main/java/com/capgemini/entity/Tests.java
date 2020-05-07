package com.capgemini.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
/*****************************************************************************
 * it is useful with model classes to denote that this is the entity or table
 * @author Gautam
 ****************************************************************************/
@Table(name="test_table1")
public class Tests {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer testId;
	@Column(length=50)
	private String testTitle;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Question> testQuestions;
	@Column
	private Double testTotalMarks;
	@Column
	private Double testMarksScored;
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public Set<Question> getTestQuestions() {
		return testQuestions;
	}
	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}
	public Double getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(Double testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public Double getTestMarksScored() {
		return testMarksScored;
	}
	public void setTestMarksScored(Double testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public Integer getTestId() {
		return testId;
	}
	
}