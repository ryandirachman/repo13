package operator;

public class LatihanOperator{
	
	public static void main(String[] args){
		int contoh1 = 10;
		int contoh2 = 20;
		
		int nilai = 80;
		int angka = 1;
		
		String a = "Pancasila";
		
		Operasi op = new Operasi();
		
		System.out.println("fungsi a++ : " + op.opTambah(contoh1));
		System.out.println("fungsi ++a : " + op.opTambah2(contoh1));
		System.out.println("fungsi a-- : " + op.opKurang(contoh1));
		System.out.println("fungsi --a : " + op.opKurang2(contoh1));
		
		System.out.println("fungsi apakah lebih besar nilai a dibanding b? : " + op.apakahLebihBesar(contoh1, contoh2));
		System.out.println("fungsi apakah lebih kecil nilai a dibanding b? : " + op.apakahLebihKecil(contoh1, contoh2));
		System.out.println("fungsi apakah sama antara nilai a dibanding b? : " + op.apakahSamaDengan(contoh1, contoh2));
		
		System.out.println("Membandingkan String tidak bisa menggunakan ==");
		System.out.println("Apakah nilai a sama dengan Pancasila ? " + a.equals("Pancasila"));
		System.out.println("Apakah nilai a sama dengan pancasila ? " + a.equals("pancasila"));
		
		System.out.println("");
		System.out.println("==Mengenal fungsi operator sebagai masukan dalm flow control==");
		if(nilai < 40){
			System.out.println("Grade Nilai : D");
		}else if(nilai >= 40 && nilai < 60){
			System.out.println("Grade Nilai : C");
		}else if(nilai >= 60 && nilai < 80){
			System.out.println("Grade Nilai : B");
		}else if(nilai >= 80 && nilai < 90){
			System.out.println("Grade Nilai : A");
		}else if(nilai >= 90 && nilai <= 100){
			System.out.println("Grade Nilai : A+");
		}else {
			System.out.println("Grade Nilai : tidak ada grade jika nilai diatas 100");
		}    
		
		System.out.println("");
		System.out.println("==Mengenal fungsi operator sebagai masukan dalam statement perulangan==");
		for(int i = 1; i <= 5; i++){
			System.out.println("iterasi ke-" + i);
		}
	}
}