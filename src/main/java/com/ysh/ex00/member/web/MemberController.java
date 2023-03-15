package com.ysh.ex00.member.web;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	//회원가입 화면을 제공하는 메서드
	@RequestMapping("/registerView")
	public String registerView() {
		return "member/registerView";
	}

	//회원가입을 진행하는 메소드
	@RequestMapping("/registerDo")
	@PostMapping
	public String registerDo(HttpServletRequest request) {
		
		
		//클라이언트 에서 넘어온 값이 한글이 깨질 경우 사용
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
		System.out.println("name = " + name);
		
		return "redirect:/";
		
		//get 방식 : 브라우저 주소창 or a태그의 href로도 데이터를 보낼 수 있는 방식
		//
		//
	}
	
}
