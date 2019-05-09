package dt.library.entity;

public class Book extends BaseEntity{
	private static final long serialVersionUID = 8925154035970645194L;
	private Integer id;// '书本id',
	private String barcode; // '书本条形码',
	private String bookname; // '书本名称',
	private Integer typeId; // '书籍类型id',
	private String author; // '作者',
	private Integer publisherId; // '出版社编号',
	private Integer bookcaseId; // '书架id',
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}
	public Integer getBookcaseId() {
		return bookcaseId;
	}
	public void setBookcaseId(Integer bookcaseId) {
		this.bookcaseId = bookcaseId;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", barcode=" + barcode + ", bookname=" + bookname + ", typeId=" + typeId + ", author="
				+ author + ", publisherId=" + publisherId + ", bookcaseId=" + bookcaseId + "]";
	}
	
}
