import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	Personne pers = new Personne("TOTO","Tata",8,"Feminin");
	
	Personne pers2 = new Personne();
	
	pers2.Age = 2;
	
	pers2.Nom = "Noumedem";
	
	
	System.out.println(pers2);
	
	Etudiant etud = new Etudiant ("TOTO","Tata",8,"Feminin","10S14372");
			
	Personne pers1 = new Personne("Tonton","hers",43,"Masculin");
	
	pers.parler();
	
	pers.grandir(8);
	
	System.out.println(pers);
	
	System.out.println(pers1);
	
	etud.etudier();
	
	System.out.println(etud);
	
	
		
	}
		

}
