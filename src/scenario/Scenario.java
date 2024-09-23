package scenario;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import java.util.Random;


public class Scenario {

	public static void main(String[] args) {
		
		int number;
		Random random = new Random();
		number = random.nextInt(10);

		
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois obelix = new Gaulois("obelix", 20);
		Romain romain = new Romain("minus", 6);
		asterix.setEffetPotion(number);
		Druide panoramix = new Druide("Panoramix", number);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		if (number >=7 ) {
			panoramix.parler("J'ai pr�par� une super potion de force " + number);
		}
		else {
			panoramix.parler("Je n'ai pas trouv� tous les inngr�dients, ma potion est seulement de force " + number);
		}
		panoramix.parler("Non, Ob�lix !... Tu n'auras pas de potion magique!");
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		asterix.parler("Merci Druide, je sens que ma force est " + number + " fois d�cupl�e.");
		asterix.parler("Bonjour");
		romain.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(romain);
	}

}