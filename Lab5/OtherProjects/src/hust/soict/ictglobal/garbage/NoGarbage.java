package hust.soict.ictglobal.garbage;
import java.util.Random;
public class NoGarbage {
	public static void main(String[] args) {
		
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 65523840; i++)
			sb.append(r.nextInt(2));
		
		String s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);
	}

}