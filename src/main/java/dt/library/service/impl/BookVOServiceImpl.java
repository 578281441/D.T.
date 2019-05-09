package dt.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dt.library.mapper.BookVOMapper;
import dt.library.service.IBookVOService;
import dt.library.vo.BookVO;

@Service
public class BookVOServiceImpl implements IBookVOService {

	@Autowired
	private BookVOMapper mapper;
	
	@Override
	public List<BookVO> list() {
		return findAll();
	}
	
	private List<BookVO> findAll(){
		return mapper.findAll();
	}

}
