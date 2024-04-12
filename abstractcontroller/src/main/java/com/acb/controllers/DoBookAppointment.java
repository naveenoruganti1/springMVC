package com.acb.controllers;

import java.security.SecureRandom;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class DoBookAppointment extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		AppointmentDto appointment = new AppointmentDto();
		appointment.setPatientName(request.getParameter("patientName"));
		appointment.setAppointmentId(new SecureRandom().nextInt(1000));
		appointment.setAppointmentDate(LocalDateTime.parse(request.getParameter("appointmentDate")));
		mav.addObject("appointment",appointment);
		mav.setViewName("appointment-details");
		return mav;
	}
}
