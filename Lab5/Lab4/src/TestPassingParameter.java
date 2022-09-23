
public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
		System.out.println("cinderella dvd title: "+ cinderellaDVD.getTitle());		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+ jungleDVD.getTitle());
	}
	public static void swap(Object ob1, Object ob2) {
		Object tmp=ob1;
		ob1=ob2;
		ob2=tmp;
	}	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle= dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
