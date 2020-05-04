package com.capgemini.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		//Query q=em.createQuery("from TestTable test");
		//return q.getResultList();
				return em.find(Tests.class, testId);
		
	}

	}


	
	