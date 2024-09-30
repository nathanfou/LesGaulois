package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement;
	private int nbEquipement = 0;

	public Romain(String nom, int force, int nbEquipement) {
	this.nom = nom;
	this.force = force;
	this.nbEquipement = nbEquipement;
	assert force > 0;
	equipement = new Equipement[2];
	}
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
	return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int forcedebut;
		forcedebut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		}
		else {
			parler("J'abandonne...");
		}
		assert force < forcedebut;
	}
	
	public void sEquiper(Equipement equipement) {
		
		switch(nbEquipement) {
		case(2):
			System.out.println("Le soldat " + this.getNom()+ "est d�j� bien prot�g� !" );
			break;
		case(1):
			if(equipement == this.equipement[nbEquipement]) {
				System.out.println("Le soldat " + this.getNom() + "poss�de d�j� un " + equipement);
			}
			
			break;
			
		}
		this.equipement[nbEquipement] = equipement;
		nbEquipement ++;
		System.out.println("Le soldat " + this.getNom() + " s'�quipe avec un " + equipement );
		
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		
	}
}
