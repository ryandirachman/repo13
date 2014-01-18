package interfece;

public class LatihanInterface{
	
	public static void main(String[] args){
		Crud crudBarang = new CrudBarang();
		crudBarang.simpan();
		crudBarang.hapus();
		System.out.println("===================================");
		Crud crudPetugas = new CrudPetugas();
		crudPetugas.simpan();
		crudPetugas.hapus();
	}
}