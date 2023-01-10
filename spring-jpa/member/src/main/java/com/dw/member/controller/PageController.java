package com.dw.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller 페이지 이동
@Controller
public class PageController {

	@GetMapping("/member")
	public String loadPage() {
		return "member";
	}

	@GetMapping("/login")
	public String loadLoginPage() {
		return "login";
	}

	@GetMapping(value = { "/", "/home" })
	public String loadHomePage() {
		return "member";
	}

	@GetMapping("/upload") //파일 업로드
    public String loadUploadPage() {
        return "upload";
    }
}
