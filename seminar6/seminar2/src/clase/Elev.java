package clase;



public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		return "Elev: " + super.toString() +  "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumireProiect, int clasa, String tutore) {

		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	
	
}
