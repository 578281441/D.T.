package dt.library.service;

import dt.library.entity.User;
import dt.library.service.ex.InsertException;
import dt.library.service.ex.PasswordNotMatchException;
import dt.library.service.ex.UserNotFoundException;
import dt.library.service.ex.UsernameDuplicateException;

public interface IUserService {
	/**
	 * 添加用户
	 * @param user
	 * @throws UsernameDuplicateException
	 * @throws InsertException
	 */
	void create(User user) throws UsernameDuplicateException,InsertException;
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 * @throws UserNotFoundException
	 * @throws PasswordNotMatchException
	 */
	User login(String username,String password) throws UserNotFoundException,PasswordNotMatchException;
}
