package interfece;

public class CrudPetugas implements Crud{

	@Override
	public void simpan(){
	System.out.println("method simpan dalam class crudPetugas");
	}
	
	@Override
	public void hapus(){
	System.out.println("method hapus dalam class crudPetugas");
	}
}