package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Exam02;
import com.example.form.Exam02Form;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	@ModelAttribute
	public Exam02Form setUpForm() {
		return new Exam02Form();
	}

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("/result")
	public String calc(Exam02Form form) {
		int num1 = form.getSum1();
		int num2 = form.getSum2();

		Exam02 ex02 = new Exam02();
		ex02.setSum1(num1);
		ex02.setSum2(num2);
		ex02.setSumResult(num1 + num2);

		session.setAttribute("exam02", ex02);

		return "exam02-result";
	}

	@RequestMapping("/result2")
	public String toPage2() {
		return "exam02-result2";
	}

}
