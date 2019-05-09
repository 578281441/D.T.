package dt.library.entity;

import java.util.Date;

public class Borrow extends BaseEntity {

	private static final long serialVersionUID = -9049132536692480201L;

	private Integer id ;// '借阅id',
	private Integer readerId ;// '读者id',
	private Integer bookId ;// '书本id',
	private Date borrowTime ;// '借阅日期',
	private Date backTime ;// '应还日期',
	private Date giveTime ;// '归还日期',
	private Integer isBack ;//'是否归还,0-未归还,1-已归还',
	private Integer isDelete ;// '是否删除',
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getReaderId() {
		return readerId;
	}
	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Date getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}
	public Date getBackTime() {
		return backTime;
	}
	public void setBackTime(Date backTime) {
		this.backTime = backTime;
	}
	public Date getGiveTime() {
		return giveTime;
	}
	public void setGiveTime(Date giveTime) {
		this.giveTime = giveTime;
	}
	public Integer getIsBack() {
		return isBack;
	}
	public void setIsBack(Integer isBack) {
		this.isBack = isBack;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	@Override
	public String toString() {
		return "Borrow [id=" + id + ", readerId=" + readerId + ", bookId=" + bookId + ", borrowTime=" + borrowTime
				+ ", backTime=" + backTime + ", giveTime=" + giveTime + ", isBack=" + isBack + ", isDelete=" + isDelete
				+ "]";
	}
	
}
