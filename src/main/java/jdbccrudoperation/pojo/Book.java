package jdbccrudoperation.pojo;

public class Book {
	private int bookId;
	private String subjectName;
	private String bookName;
	private String authorName;
	private float price;
	public Book() {
		
	}
	public Book(int bookId, String subjectName, String bookName, String authorName, float price) {
		this.bookId = bookId;
		this.subjectName = subjectName;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setPrice(float price ) {
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public String getBookName() {
		return bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public float getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", subjectName=" + subjectName + ", bookName=" + bookName + ", authorName="
				+ authorName + ", price=" + price + "]";
	}
}