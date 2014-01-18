package tipedata;

import java.math.BigDecimal;

public class LatihanTypeData{
	//contoh tipe data primitif
	private static boolean cthBoolean = true;
	private static char cthChar = 'a';
	private static byte cthByte = 1;
	private static short cthShort = 2;
	private static int cthInt = 3;
	private static long cthLong = 4l;
	private static float cthFloat = 5f;
	private static double cthDouble = 6d;
	
	//contoh tipe data dengan wrapper class
	private static Boolean cBoolean = Boolean.FALSE;
	private static Integer cInteger = 7;
	private static Long cLong = 8l;
	private static Float cfloat = 9f;
	private static Double cDouble = 10d;
	private static BigDecimal cDecimal = new BigDecimal("1");
	private static String cString = "test 12";
	
	//contoh tipe data dengan reference value
	private static KelasLatihan cKelasLatihan = new KelasLatihan();
	
	public static void main(String[] args){
		System.out.println("Contoh Primitive value");
		System.out.println("cthBoolean : " + cthBoolean);
		System.out.println("cthChar : " + cthChar);
		System.out.println("cthByte : " + cthByte);
		System.out.println("cthShort : " + cthShort);
		System.out.println("cthInt : " + cthInt);
		System.out.println("cthLong : " + cthLong);
		System.out.println("cthFloat : " + cthFloat);
		System.out.println("cthDouble : " + cthDouble);
		
		System.out.println("Contoh menggunakan wrapper");
		System.out.println("cBoolean : " + cBoolean);
		System.out.println("cInteger : " + cInteger);
		System.out.println("nilai double dari c Integer : " + cInteger.doubleValue());
		System.out.println("cLong : " + cLong);
		System.out.println("cFloat : " + cfloat);
		System.out.println("cDouble : " + cDouble);
		System.out.println("cDecimal : " + cDecimal);
		System.out.println("cString : " + cString);
		System.out.println("fungsi Upper case (mengkapitalkan huruf) dari String cString : " + cString.toUpperCase());
		
		System.out.println("Contoh Menggunakan reference");
		System.out.println("bil 1 dari cKelasLatihan : " + cKelasLatihan.getBil1());
		System.out.println("bil 2 dari cKelasLatihan : " + cKelasLatihan.getBil2());
	}
}