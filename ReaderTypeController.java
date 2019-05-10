package dt.library.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dt.library.entity.ReaderType;
import dt.library.service.IReaderTypeService;
import dt.library.util.ResponseResult;

/**
 * 用户类型控制器基类
 * @author ASUS
 *
 */
@RestController
@RequestMapping("library")
public class ReaderTypeController extends BaseController {
	
	@Autowired
	IReaderTypeService iReaderTypeService;
	
	@RequestMapping("readertypelist.do")
	public ResponseResult<List<ReaderType>> listReaderType(){
		List<ReaderType> list=iReaderTypeService.listReaderType();
		return new ResponseResult<>(SUCCESS,list);
		
	}
	
	@RequestMapping("UpdateReaderType.do")
	public ResponseResult<Void> changeReaderType(
			@Param("id") Integer id,@Param("name") String name,@Param("number") int number,HttpSession session){
		ReaderType readerType=new ReaderType();
		readerType.setId(id);
		readerType.setName(name);
		readerType.setNumber(number);
		String modifiedUser=session.getAttribute("username").toString();
		readerType.setModifiedUser(modifiedUser);
		readerType.setModifiedTime(new Date());
		iReaderTypeService.updateReaderType(readerType);
		ResponseResult<Void> rr=new ResponseResult<Void>(SUCCESS);
		rr.setMessage("修改成功");
		return rr;
	}
}
