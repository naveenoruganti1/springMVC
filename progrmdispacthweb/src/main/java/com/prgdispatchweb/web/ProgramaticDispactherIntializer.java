package com.prgdispatchweb.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ProgramaticDispactherIntializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext contextRootContext = null;
		XmlWebApplicationContext dispacherContext = null;
		ContextLoaderListener contextLoaderListener = null;
		DispatcherServlet dispatcherServlet = null;
		
		contextRootContext = new XmlWebApplicationContext();
		contextRootContext.setConfigLocation("/WEB-INF/application-context.xml");
		contextLoaderListener = new ContextLoaderListener(contextRootContext);
		servletContext.addListener(contextLoaderListener);
		
		dispacherContext = new XmlWebApplicationContext();
		dispacherContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		dispatcherServlet = new DispatcherServlet(dispacherContext);
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcherServlet);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");
		
	}
}
