
package garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis(); // static method of class System. khoang tgian
		String s=" ";
		for(int i=0;i<65536; i++) {
			s+= r.nextInt(2); // (0,1)
		}
	//	System.out.println("S= "+ System.currentTimeMillis()+ "\n Start = "+start);
		System.out.println(System.currentTimeMillis()-start); //This prints roughly 4500
		
		r= new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder(); // a mutable string. chuoi co the thay doi
		for(int i=0;i< 65536; i++){
			sb.append(r.nextInt(2)); // append: noi (r.nextInt(2)) vao cuoi chuoi
		}
		s= sb.toString();
		
		System.out.println(System.currentTimeMillis()- start);
	}
}
