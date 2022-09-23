package hust.soict.ictglobal.aims.media;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("Book","1","titleB","cateB",100,"auth1");
		book.setContent("a b c a a b a");
		
		System.out.println("Information of current book:\n " + book.toString());
	}
}
