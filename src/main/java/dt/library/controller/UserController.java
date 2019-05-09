package dt.library.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dt.library.entity.User;
import dt.library.service.IUserService;
import dt.library.util.ResponseResult;

@RestController
@RequestMapping("users")
public class UserController extends BaseController{
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("login.do")
	public ResponseResult<User> login(
			@RequestParam("username")String username,
			@RequestParam("password")String password,
			HttpSession session,HttpServletResponse response){
		//执行登录
		User user=userService.login(username, password);
		//设置登录session
		session.setAttribute("user", user);		
		return new ResponseResult<>(SUCCESS,user);
	}
}
