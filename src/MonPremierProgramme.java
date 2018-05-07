import java.util.Scanner;

public class MonPremierProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();*/
		
		
		
		
		// CALCUL DE LA REMISE
		//System.out.println(calculTaux(res));
		
		// POIDS
		//calculPoids(Byte.parseByte(res));
		
		// BOUCLE
		//boucleNombre(res);
		
		// FACTORIEL
		//calculFactoriel(Integer.parseInt(res));
		
		// NOMBRES PREMIERS
		//calculNombresPremiers(5);
		
		float [][] resultats = {new float[20], new float[10], new float[10]};
		
		int i = 0, j = 0;
		
		for(float []ligne : resultats) {
			switch(j) {
			case 0 :
				for(float col : ligne) {
					resultats[j][i] = i*i;
					i++;
				}
			break;
			case 1 :
				for(float col : ligne) {
					resultats[j][i] = (float) Math.sqrt(i);
					i++;
				}
			break;
			case 2 :
				
			break;
			default:
				System.out.println("Erreur");
			break;
			}
			j++;
			i = 0;
		}
		
		for(int k = 0; k < resultats.length; k++) {
			for(int l = 0; l < resultats[k].length; l++) {
				System.out.println("Ligne : " + k + ", Colonne : " + l + ", valeur : " + resultats[k][l]);
			}
		}
		
		
	}
	
	public static void calculNombresPremiers(int nombre) {
		for(int i = 1; i <= nombre; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j != 0)
					System.out.println(i + " T'es premier");
			}
		}
	}
	
	public static void calculFactoriel(int nombre) {
		int factoriel = 1;
		
		for(int i = 1; i <= nombre; i++) {
			factoriel *= i;
		}
		
		System.out.println(factoriel);
	}
	
	public static void boucleNombre(String res) {
		int nombre = Integer.parseInt(res);
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while(i < nombre);
	}
	
	public static void calculPoids(byte poids) {
		switch(poids) {
		case 1:
			System.out.println("Petit.");
		break;
		case 2:
			System.out.println("Moyen.");
		break;
		case 3:
			System.out.println("Grand.");
		break;
		default:
			System.out.println("Inconnu.");
		break;
		}
	}
	
	public static float calculTaux(String res) {
		
		float montant = 0, remise = 0;
		byte taux = 100;
		
		montant = Float.parseFloat(res);
		
		if(montant < 1000)
			taux = 0;
		else if(montant >= 1000 && montant < 2000)
			taux = 1;
		else if(montant >= 2000 && montant < 5000)
			taux = 3;
		else if(montant >= 5000)
			taux = 5;
		else
			System.out.println("erreur");
		
		remise = ((float) taux/100)*montant;
		
		return remise;
	}

}
