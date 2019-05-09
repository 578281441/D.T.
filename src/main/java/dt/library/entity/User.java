package dt.library.entity;

public class User extends BaseEntity {

	private static final long serialVersionUID = 4979244288053022785L;

	private Integer id;// 管理员id
	private String username;// 名称
	private String salt;// 盐值
	private String password;// 密码
	private Integer sysSet;// 系统设置权限
	private Integer readerSet;// 读者管理权限
	private Integer bookSet;// 图书管理权限
	private Integer borrowbackSet;// 借阅管理权限
	private Integer querySet;// 系统查询权限
	private Integer isDelete;// 是否删除

	
	public User() {
		
	}
	public User(String username, String salt, String password, Integer sysSet, Integer readerSet, Integer bookSet,
			Integer borrowbackSet, Integer querySet) {
		super();
		this.username = username;
		this.salt = salt;
		this.password = password;
		this.sysSet = sysSet;
		this.readerSet = readerSet;
		this.bookSet = bookSet;
		this.borrowbackSet = borrowbackSet;
		this.querySet = querySet;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getSysSet() {
		return sysSet;
	}


	public void setSysSet(Integer sysSet) {
		this.sysSet = sysSet;
	}


	public Integer getReaderSet() {
		return readerSet;
	}


	public void setReaderSet(Integer readerSet) {
		this.readerSet = readerSet;
	}


	public Integer getBookSet() {
		return bookSet;
	}


	public void setBookSet(Integer bookSet) {
		this.bookSet = bookSet;
	}


	public Integer getBorrowbackSet() {
		return borrowbackSet;
	}


	public void setBorrowbackSet(Integer borrowbackSet) {
		this.borrowbackSet = borrowbackSet;
	}


	public Integer getQuerySet() {
		return querySet;
	}


	public void setQuerySet(Integer querySet) {
		this.querySet = querySet;
	}


	public Integer getIsDelete() {
		return isDelete;
	}


	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", salt=" + salt + ", password=" + password + ", sysSet="
				+ sysSet + ", readerSet=" + readerSet + ", bookSet=" + bookSet + ", borrowbackSet=" + borrowbackSet
				+ ", querySet=" + querySet + ", isDelete=" + isDelete + "]";
	}


}
