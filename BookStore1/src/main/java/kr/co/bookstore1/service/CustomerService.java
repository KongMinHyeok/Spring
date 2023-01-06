package kr.co.bookstore1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore1.dao.CustomerDAO;
import kr.co.bookstore1.vo.CustomerVO;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public void insertCustomer(CustomerVO vo) {
		dao.insertCustomer(vo);
	}
	
	public CustomerVO selectCustomer(String cusName) {
		return dao.selectCustomer(cusName);
	}
	
	public List<CustomerVO> selectCustomers() {
		return dao.selectCustomers();
	}
	
	public void updateCustomer(CustomerVO vo) {
		dao.updateCustomer(vo);
	}
	
	public void deleteCustomer(String cusName) {
		dao.deleteCustomer(cusName);
	}
	
}
