package com.sy.helloworld;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.sy.helloworld.impl.HelloImpl;

//import org.osgi.framework.BundleActivator;

public class Activator implements BundleActivator{

	ServiceRegistration helloServiceRegistration;
	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("helloxiaoming registered...");
		Hello helloService = new HelloImpl("xiaoqiang");
		helloServiceRegistration=context.registerService(Hello.class.getName(),helloService,null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		helloServiceRegistration.unregister();
		System.out.println("woshixiaoming... unregister...");
		
	}

}
