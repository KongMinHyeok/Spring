package kr.co.bookstore1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore1.dao.BookDAO;
import kr.co.bookstore1.vo.BookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	
	public void insertBook(BookVO vo) {
		dao.insertBook(vo);
	}
	
	public BookVO selectBook(String bookName) {
		return dao.selectBook(bookName);
	}
	
	public List<BookVO> selectBooks() {
		return dao.selectBooks();
	}
	
	public void updateBook(BookVO vo) {
		dao.updateBook(vo);
	}
	
	public void deleteBook(String bookName) {
		dao.deleteBook(bookName);
	}
	
}
