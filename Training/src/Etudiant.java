
public class Etudiant extends Personne{
	
	String Matricule;

	public Etudiant(String nom, String prenom, int age, String sexe, String matricule) {
		super(nom, prenom, age, sexe);
		this.Matricule = matricule;
	}
	
	public void etudier() {
		
		System.out.println("il etudie");
	}

	
}
 