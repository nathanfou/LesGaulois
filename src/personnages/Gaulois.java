package personnages;

import java.lang.reflect.Method;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le gaulois" + nom + ":";
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<" + texte + ">>");
		
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "Envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
		
	}
		@Override
		public String toString() {
			return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
					+ effetPotion + "]";
		}
		public static void main(String[] args) {
			System.out.println("bonjour");
		}
	}










}