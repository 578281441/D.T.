package dt.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dt.library.entity.User;
import dt.library.mapper.UserMapper;
import dt.library.service.IUserService;
import dt.library.service.ex.InsertException;
import dt.library.service.ex.PasswordNotMatchException;
import dt.library.service.ex.UserNotFoundException;
import dt.library.service.ex.UsernameDuplicateException;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public void create(User user) throws UsernameDuplicateException, InsertException {
		User result = findByUsername(user.getUsername());
		if (result == null) {
			throw new UsernameDuplicateException("用户添加失败：用户名已存在");
		}
		Integer rows = addnew(user);
		if (rows != 1) {
			throw new InsertException("用户添加失败：未知错误");
		}
	}

	private Integer addnew(User user) {
		return userMapper.addnew(user);
	}

	@Override
	public User login(String username, String password) throws UserNotFoundException, PasswordNotMatchException {
		User result = findByUsername(username);
		if (result == null) {
			throw new UserNotFoundException("登录失败：用户名不存在");
		}
		if (!password.equals(result.getPassword())) {
			throw new PasswordNotMatchException("登录失败：密码不匹配");
		}

		return result;
	}

	private User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}

}
