package com.tracker.db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tracker.db.entities.User;

@Stateless
public class JPAService {

	@PersistenceContext 
	EntityManager em;
	
	
	public void persist(User user){
		this.em.persist(user);
	}
}
