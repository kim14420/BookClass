package exam9;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book bookArray [] = new Book [3];
		
		bookArray [0] = new Book ("SQL Plus", 50000, 5);
		bookArray [1] = new Book ("Jave 2.0", 40000, 3);
		bookArray [2] = new Book ("JSP Servlet", 60000, 6);
	
		for (int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray [i]);
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < bookArray.length; i++) {
			sum += bookArray[i].getBookPrice();
		}
		
		System.out.println("책 가격의 합: " + sum + "원");
		
		double discount = 0;
		for (int i = 0; i < bookArray.length; i++) {
			discount += bookArray[i].getDiscountBookPrice();
		}
		
		System.out.println("할인 된 책 가격의 합: " + discount + "원");
	}

}
