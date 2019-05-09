package dt.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dt.library.service.IBookVOService;
import dt.library.util.ResponseResult;
import dt.library.vo.BookVO;

@RestController
@RequestMapping("list")
public class BookVOController extends BaseController {
	
	@Autowired
	private IBookVOService service;
	
	@RequestMapping("book.do")
	public ResponseResult<List<BookVO>> sort(){
		List<BookVO> list=service.sort();
		return new ResponseResult<List<BookVO>>(SUCCESS,list);
	}
}
