package clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	public static void setPragPunctaj(int pragPunctaj) {
		Aplicant.pragPunctaj = pragPunctaj;
	}

	private static int pragPunctaj;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareRezultat(){

		System.out.println("Aplicantul " + this.nume + " " +
				this.prenume + (this.punctaj<pragPunctaj? " nu " : " ")+"a fost acceptat.");

	}


	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNr_proiecte(int nr_proiecte, String[] denumireProiect) {
		this.nrProiecte = nr_proiecte;
		this.denumireProiect= new String[this.nrProiecte];
		for(int i = 0; i<this.nrProiecte; i++)
		{
			this.denumireProiect[i]=denumireProiect[i];
		}

	}
	
	
	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", unctaj=" + punctaj
				+ ", Numar Proiecte=" + nrProiecte + ", Denumire Proiect=" + Arrays.toString(denumireProiect) + "]";
	}

	public void  afisareSumaBani(int sumaFinantata) {
		System.out.println("Aplicantul "+getNume()+" "+getPrenume()+" primeste "+sumaFinantata+" Euro/zi in proiect.");
	}
	


}
