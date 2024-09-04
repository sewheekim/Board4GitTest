package org.iclass.controller;

import org.iclass.dto.CommunityDTO;
import org.iclass.dto.PageReqDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/community")
public class CommunityController {
	
	@GetMapping("/list")
	public String list(int page, String columns, String keyword) {
		
		return "community/list";
	}
	
	@GetMapping("/write")
	public String write(int page) {
		
		return "community/list";
	}
	
	@PostMapping("/write")
	public String write(CommunityDTO dto) {
		
		return "redirect:list";
	}
	
	@GetMapping("/modify")
	public String modify(int page) {
		
		return "community/list";
	}
	
	@PostMapping("/modify")
	public String write(int page, CommunityDTO dto,Model model) {
		
//		return "redirect:list";
		return "redirect:modify";
	}
	
	
	@GetMapping("/read")
	public String read(int idx,int page, Model model) {
		
		return "community/read";
	}
	
	@PostMapping("/remove")
	public String remove(int idx, int page) {
		
		return "redirect:list";
	}
	
	
}
