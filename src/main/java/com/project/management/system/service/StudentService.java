package com.project.management.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.management.system.config.ApplicationProperties;

@Service
public class StudentService {

	@Autowired
	private ApplicationProperties applicationProperties;

}
