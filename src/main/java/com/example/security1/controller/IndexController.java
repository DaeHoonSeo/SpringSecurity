package com.example.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <pre>
 * com.example.security1.controller
 *
 * Modification Information
 *
 * Mod Date       Modifier    Description
 * -----------    --------    ---------------------------
 * 2023-05-18    kr601339    Generation
 * </pre>
 *
 * @author kr601339
 * @see
 */
@Controller
public class IndexController
{
	@GetMapping({"","/"})
	public String index(){
		// mustache 기본폴더 src/main/resources/
		// 뷰리졸버 설정: templates (prefix), .mustache(sufix) ==> application.yml (생략 가능)
		return "index";
	}

  @GetMapping("/user")
	public String user() {
		return "user";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@GetMapping("/manager")
	public String manager() {
		return "manager";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/join")
	public String join() {
		return "join";
	}

	@GetMapping("/joinProc")
	public @ResponseBody String joinProc() {
		return "회원가입 완료됨!!";
	}
}
