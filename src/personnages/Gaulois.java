package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public int getEffetPotion() {
		return effetPotion;
	}
	
	public String getNom( ) {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+ "<<" + texte + ">>");

	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
		
		
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("test gaulois");
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
}

