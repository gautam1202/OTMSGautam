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
@Transactional
public class ResultDaoImp implements IResultDao{
	
	@PersistenceContext
	EntityManager em;


	@Override
	public void saveTests(Tests test) {
		em.persist(test);
		
	}

	@Override
	public Tests getTests(Integer testId) {
		//TypedQuery q=(TypedQuery) em.createQuery("select test from Tests test");
		//TypedQuery<Tests> query = em.createQuery("SELECT test FROM Tests test",Tests.class);
		//return (Tests) query.getResultList();
		return em.find(Tests.class, testId);
		
	}
	
	@Override
	public List<Tests> getTestList()
	{
		String qstr="SELECT test FROM Tests test";
		TypedQuery<Tests> query=em.createQuery(qstr, Tests.class);
		return query.getResultList();
	}
	@Override
	public Optional<Tests> findById(Integer testId) {
		// TODO Auto-generated method stub
		return null;
	}

//	
//
//	@Override
//	public List retrieve() {
//		TypedQuery<Tests> query = em.createQuery("SELECT test FROM Tests test",Tests.class);
//		return query.getResultList();
//	}


	}


	
	