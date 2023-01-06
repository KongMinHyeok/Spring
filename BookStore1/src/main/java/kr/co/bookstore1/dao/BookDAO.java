package kr.co.bookstore1.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore1.vo.BookVO;

@Repository
public class BookDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public void insertBook(BookVO vo) {
		mybatis.insert("book.insertBook", vo);
	}
	
	public BookVO selectBook(String bookName) {
		return mybatis.selectOne("book.selectBook", bookName);
	}
	
	public List<BookVO> selectBooks() {
		return mybatis.selectList("book.selectBooks");
	}
	
	public void updateBook(BookVO vo) {
		mybatis.update("book.updateBook", vo);
	}
	
	public void deleteBook(String bookName) {
		mybatis.delete("book.deleteBook", bookName);
	}
	
}
