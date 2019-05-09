package dt.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dt.library.entity.Library;
import dt.library.mapper.LibraryMapper;
import dt.library.service.ILibraryService;

@Service
public class LibraryServiceImpl implements ILibraryService {

	@Autowired
	private LibraryMapper libraryMapper;
	private Library find(){
		return libraryMapper.find();
	}
	public Library get(){
		return find();
	}

}
