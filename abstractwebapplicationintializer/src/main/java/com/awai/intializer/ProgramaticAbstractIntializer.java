package com.awai.intializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ProgramaticAbstractIntializer extends AbstractDispatcherServletInitializer{

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext applicationContext = null;
		applicationContext = new XmlWebApplicationContext();
		applicationContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		return applicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext webApplicationContext = null;
		webApplicationContext = new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("/WEB-INF/application-context.xml");
		return webApplicationContext;
	}
}
