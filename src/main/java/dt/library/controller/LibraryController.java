package dt.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dt.library.entity.Library;
import dt.library.service.ILibraryService;
import dt.library.util.ResponseResult;

@RestController
@RequestMapping("library")
public class LibraryController extends BaseController{
	
	@Autowired
	private ILibraryService libraryService;
	
	@RequestMapping("get.do")
	public ResponseResult<Library> get(){
		Library library=libraryService.get();
		return new ResponseResult<>(SUCCESS,library);
	}

}
