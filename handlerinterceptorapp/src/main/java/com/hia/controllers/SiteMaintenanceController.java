package com.hia.controllers;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class SiteMaintenanceController implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LocalDateTime time = LocalDateTime.now();
		if(time.getHour() >=0 && time.getHour() <=2 ) {
			response.sendRedirect("site-maintenance.jsp");
			return false;
		}
		return true;
	}
	
}
