package inheritance;

//public class LatihanInheritance{
public class LatihanPolimorfism{
	
	public static void main(String[] args){
	AirMineral a = new AirMineral();
	System.out.println("nama minuman : " + a.getNama());
	System.out.println("rasa minuman : " + a.getRasa());
	System.out.println("warna minuman : " + a.getWarna());
	System.out.println("bersoda ? " + a.isBersoda());
	
	Kopi k = new Kopi();
	System.out.println("");
	System.out.println("nama minuman : " + k.getNama());
	System.out.println("rasa minuman : " + k.getRasa());
	System.out.println("warna minuman : " + k.getWarna());
	System.out.println("bersoda ? " + k.isBersoda());

	Susu s = new Susu();
	s.setBerkalsium(true);
	s.setBersoda(false);
	s.setWarna("putih");
	s.setRasa("Hambar");
	s.setNama("Susu Murni");
	
	System.out.println("");
	System.out.println("nama minuman : " + s.getNama());
	System.out.println("rasa minuman : " + s.getRasa());
	System.out.println("warna minuman : " + s.getWarna());
	System.out.println("bersoda ? " + k.isBersoda());
	}
}