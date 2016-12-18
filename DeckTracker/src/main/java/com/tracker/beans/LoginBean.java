package com.tracker.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.tracker.TrackerSession;
import com.tracker.db.JPAService;
import com.tracker.db.entities.User;

@Named
@RequestScoped
public class LoginBean {
	@Inject
	TrackerSession session;
	@Inject
	JPAService db;
	private User user;

	@PostConstruct
	private void init() {
		this.user = new User();
	}

	public String login() {
		if (session.getUser() == null) {
			// do login
		}
		return "index";
	}

	public String signUp() {
		db.persist(user);
		session.setUser(user);
		return "index";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
