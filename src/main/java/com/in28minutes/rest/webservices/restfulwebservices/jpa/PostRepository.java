package com.in28minutes.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.user.Post;
import com.in28minutes.rest.webservices.restfulwebservices.user.User;

import jakarta.validation.Valid;

public interface PostRepository extends JpaRepository<User, Integer>{

	Post save(@Valid Post post);
	
}
