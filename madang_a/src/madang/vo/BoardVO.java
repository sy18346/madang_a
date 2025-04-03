package madang.vo;

public class BoardVO {
	private int bookid;
	private String bookname;
	private int price;
	private String publisher;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public BoardVO(int bookid, String bookname, int price, String publisher) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.publisher = publisher;
	}
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
