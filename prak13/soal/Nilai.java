import java.io.*;
import java.util.Scanner;


public class Nilai{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		try {
			int Input;
			int choose;
			float rata;
							
			System.out.println("Masukkan Berapa banyak nilai yang akan dihitung : ");
			Input = input.nextInt();
			
			for(int i = 1; i <= Input; i++){
			System.out.println("Masukkan Nilai ke- "+ i +" : " );
            choose = input.nextInt();
			
			rata = ((choose)/3);
			
			System.out.println("Rata-rata dari nilai yang dimasukkan adalah : "+rata);
			if(rata<50){
			System.out.println("Grade dari nilai rata-rata tersebut adalah : E");
			}
			else if(rata>=50 && rata<60){
			System.out.println("Grade dari nilai rata-rata tersebut adalah : D");
			}
			else if(rata>=60 && rata<70){
			System.out.println("Grade dari nilai rata-rata tersebut adalah : C");
			}
			else if(rata>=70 && rata<80){
			System.out.println("Grade dari nilai rata-rata tersebut adalah : B");
			}
			else if(rata>=80 && rata<=100){
			System.out.println("Grade dari nilai rata-rata tersebut adalah : A");
			}
			else {
            throw new Exception("Grade Untuk Nilai Tidak Ditemui !");
			}
			}
		} catch (Exception e) {
        System.out.println(e.getMessage());
		}
	}
}