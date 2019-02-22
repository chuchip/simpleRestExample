package com.profesorp.restexample.service.impl;

import org.springframework.stereotype.Service;

import com.profesorp.restexample.service.ITestService;

@Service
public class TestService implements ITestService{
	int contador;
	
	public int callme()
	{
		return contador++;
	}
}
