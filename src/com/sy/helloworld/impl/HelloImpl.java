package com.sy.helloworld.impl;

import com.sy.helloworld.Hello;

public class HelloImpl implements Hello
{

	final String helloString;

	public HelloImpl(String helloString) {
		super();
		this.helloString = helloString;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
		System.out.println(this.helloString);
	}
	
	
	
}
