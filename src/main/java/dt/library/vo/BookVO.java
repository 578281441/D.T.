package dt.library.vo;

import java.io.Serializable;

public class BookVO implements Serializable{

	private static final long serialVersionUID = -1110248640403115470L;

	private String barcode;
	private String bookName;
	private String typeName;
	private String bookcaseName;
	private String publisher;
	private String author;
	private Integer borrowCount;
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getBookcaseName() {
		return bookcaseName;
	}
	public void setBookcaseName(String bookcaseName) {
		this.bookcaseName = bookcaseName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getBorrowCount() {
		return borrowCount;
	}
	public void setBorrowCount(Integer borrowCount) {
		this.borrowCount = borrowCount;
	}
	@Override
	public String toString() {
		return "BookVO [barcode=" + barcode + ", bookName=" + bookName + ", typeName=" + typeName + ", bookcaseName="
				+ bookcaseName + ", publisher=" + publisher + ", author=" + author + ", borrowCount=" + borrowCount
				+ "]";
	}
}
