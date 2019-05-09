package dt.library.mapper;

import dt.library.entity.User;

public interface UserMapper {
	/**
	 * 添加用户
	 * @param 
	 * @return
	 */
	Integer addnew(User user);
	/**
	 * 根据用户名查找用户
	 * @param username
	 * @return
	 */
	User findByUsername(String username);
	User findById(Integer id);
}
