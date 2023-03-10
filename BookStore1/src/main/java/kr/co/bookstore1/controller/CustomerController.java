package kr.co.bookstore1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore1.service.CustomerService;
import kr.co.bookstore1.vo.CustomerVO;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	

	@GetMapping("/customer/list")
	public String list(Model model) {
		
		List<CustomerVO> customers = service.selectCustomers();
		
		model.addAttribute("customers", customers);
		
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	
	@PostMapping("/customer/register")
	public String register(CustomerVO vo) {
		service.insertCustomer(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/modify")
	public String modify(Model model, String cusName) {
		
		CustomerVO customer = service.selectCustomer(cusName);
		model.addAttribute("customer", customer);
		
		return "/customer/modify";
	}
	
	
	@PostMapping("/customer/modify")
	public String modify(CustomerVO vo) {
		
		service.updateCustomer(vo);
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String delete(String cusName) {
		
		service.deleteCustomer(cusName);
		
		return "redirect:/customer/list";
	}
	
}
