
public class Personne {
	
	String Nom;
	
	String Prenom;
	
	int Age;
	
	String Sexe;

	public Personne(String nom, String prenom, int age, String sexe) {
		super();
		this.Nom = nom;
		this.Prenom = prenom;
		this.Age = age;
		this.Sexe = sexe;
	}
	
	public Personne() {
		
	}

	public void parler() {
		
		System.out.println("Bonjour");
		
	}
	
	public String marcher(String destination) {
		
		return destination;
		
	}
	
	public void grandir(int valeur) {
		
		this.Age = this.Age + valeur; 
	}

	@Override
	public String toString() {
		return "Personne [Nom=" + Nom + ", Prenom=" + Prenom + ", Age=" + Age + ", Sexe=" + Sexe + "]";
	}
	
	
}
