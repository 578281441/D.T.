package dt.library.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import dt.library.service.ex.InsertException;
import dt.library.service.ex.PasswordNotMatchException;
import dt.library.service.ex.ServiceException;
import dt.library.service.ex.UpdateException;
import dt.library.service.ex.UserNotFoundException;
import dt.library.service.ex.UsernameDuplicateException;
import dt.library.util.ResponseResult;

public abstract class BaseController {
	protected static final Integer SUCCESS=200;
	
	@ExceptionHandler(ServiceException.class)
	public ResponseResult<Void> handleException(Throwable e) {
		ResponseResult<Void> rr=new ResponseResult<>();
		rr.setMessage(e.getMessage());
		if(e instanceof UsernameDuplicateException) {
			//4000-尝试注册的用户名已经被占用
			rr.setState(4000);
		} else if (e instanceof UserNotFoundException) {
			//4000-用户未找到
			rr.setState(4001);
		}  else if (e instanceof PasswordNotMatchException) {
			//5000-密码不匹配
			rr.setState(4002);
		} else if (e instanceof InsertException) {
			//5000-插入数据异常
			rr.setState(5000);
		}  else if (e instanceof UpdateException) {
			//5000-插入数据异常
			rr.setState(5001);
		}  
		return rr;
	}
}
