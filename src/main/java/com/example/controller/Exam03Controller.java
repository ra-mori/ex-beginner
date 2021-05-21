package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Exam03;
import com.example.form.Exam03Form;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	@ModelAttribute
	public Exam03Form setUpForm() {
		return new Exam03Form();
	}

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/tax")
	public String result(Exam03Form form) {
		int free = form.getPro_1() + form.getPro_2() + form.getPro_3();
		int tax = (int) Math.round((form.getPro_1() + form.getPro_2() + form.getPro_3()) * 1.10);

		Exam03 product = new Exam03();
		product.setTax_free(free);
		product.setTax_in(tax);

		application.setAttribute("product", product);

		return "exam03-result";

	}
}
