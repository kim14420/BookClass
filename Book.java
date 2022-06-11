package exam9;

public class Book {

	private String bookName;
	private int bookPrice;	
	private double bookDiscountRate;
	
	
	public Book () {
		
		bookPrice = 0;
		bookDiscountRate = 0.0;
		
	}
	
	public Book (String bookName, int bookPrice, double bookDiscountRate) {
		
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
		
	}

	public void setBookPrice (int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	public int getBookPrice () {
		return bookPrice;
		
	}
	
	public double getDiscountBookPrice () {
		
		double Discount = bookDiscountRate * 0.01;
		double DiscountedMoney = bookPrice * Discount;
		double DiscountBookPrice = bookPrice - DiscountedMoney;
		return DiscountBookPrice;
		
	}

	@Override
	public String toString() {
		return bookName +  " " + bookPrice + "원 "  + (int)bookDiscountRate + "% ";
	}

	
	
	
	
}
