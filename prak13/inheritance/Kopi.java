package inheritance;

public class Kopi extends Minuman{
	private boolean berKafein;
	
	public Kopi(){
		super.setNama("Kopi");
		super.setRasa("Pahit");
		super.setWarna("Hitam");
		super.setBersoda(false);
		this.berKafein = true;
	}
	
	public boolean isBerKafein(){
		return berKafein;
	}
	
	public void setBerKafein(boolean berKafein){
		this.berKafein = berKafein;
	}
}