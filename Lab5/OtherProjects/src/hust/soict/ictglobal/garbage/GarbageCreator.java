package hust.soict.ictglobal.garbage;

import java.util.Random;

public class GarbageCreator {
	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis(); // static method of class System. khoang tgian
		String s=" ";
		for(int i=0;i<655382689; i++) { //increase number of loops
			s+= r.nextInt(2); // (0,1)
		}
	
		System.out.println(System.currentTimeMillis()-start); //This prints roughly 4500
		
	}

}
