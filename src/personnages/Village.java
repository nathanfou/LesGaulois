package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum ) {
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	

	public String getNom() {
		return nom;
		
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
		
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		
	}
	
}
