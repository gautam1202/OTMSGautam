package com.capgemini.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

@Repository

/*********************************************************************************
 @Repository annotation is used to indicate that the class provides the mechanism 
for storage, retrieval, search, update and delete operation on objects.
**********************************************************************************/

@Transactional
public class ResultDaoImp implements IResultDao{
	
	@PersistenceContext
	/*****************************************************************
	 The @PersistenceContext annotation in your code is being used 
	 to indicate that the EntityManager must be automatically injected.
	 *******************************************************************/
	
	EntityManager em;
	/*****************************************************************
	 entity manager can manage your entities. Entity Manager handles 
	   all interactions with the database.
	 *******************************************************************/


	@Override
	public void saveTests(Tests test) {
		
		em.persist(test);
		/*****************************************************************************************
		The persist method is intended for adding a new entity instance to the persistence context,
		*******************************************************************************************/
	
	}

	@Override
	public Tests getTests(Integer testId) {

		return em.find(Tests.class, testId);
		
	}
	
	
	/*************************************************************************************************
	  Method - getTestList 
      Description - To fetch all Test Details from the Test Table in database.
      @param from getTestList      - void.
	  @returns List<Tests>      - return List of Object where each object contains details of a particular Test.   
      Created By                   - Gautam Anand
      Created Date                 - 21-APR-2020                           
	 **************************************************************************************************/
	
	@Override
	public List<Tests> getTestList()
	{
		String qstr="SELECT test FROM Tests test";
		TypedQuery<Tests> query=em.createQuery(qstr, Tests.class);
		return query.getResultList();
	}
	
	
	@Override
	public Optional<Tests> findById(Integer testId)
	{
		return null;
	}
}
	
	