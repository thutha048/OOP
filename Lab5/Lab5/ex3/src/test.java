
public class test {
	public static void main(String[] args) {
		String substr = "My World";

		String[] title = { "Hello World The", "Hi My " };

		substr = substr.toLowerCase();
		boolean ans = true;
		int check = 0, num = 0;

		String[] words = substr.split("\\s");
		for (String w : words) {
			num++;
		}
		System.out.println("Num = " + num);
		int exit[] = new int[num];
		// check su xuat hien cua tung word:
		for (int i = 0; i < num; i++) {
			exit[i] = 0;
		}

		for (int i = 0; i < title.length; i++) {
			title[i] = title[i].toLowerCase();
			String key[] = title[i].split("\\s");
			int j = 0;
			// j la so thu tu cua word cua substr
			for (String w : words) {
				for (String k : key) {
					if (w.equals(k)) {
						exit[j] = 1;
						// ans=true;
						break;
					}
					// System.out.println("exit "+ j+ " = "+exit[j]);
				}
				j++;
			}
		}

		for (int k = 0; k < num; k++) {
			if (exit[k] == 0) {
				ans = false;
				break;
			}
		}
		if (ans == true) {
			System.out.println("It exits!\n");
		} else {
			System.out.println("Not exit\n");
		}

	}
}
