package Salarie;

public class Salarie {

	private int m_nMatricule, m_nCategorie, m_nService;
	private String m_strNom ;
	private double m_dSalaire;
	static int compteur = 0;
	
	public Salarie(String param, double m_dSalaire) {
	
	this.m_strNom = param;
	this.m_dSalaire = m_dSalaire;
	compteur = compteur + 1;
	System.out.println("J'ai été instancié " +compteur);
	
	}
	

	
	// Fonction calculSalaire()
	public  void  calculSalaire() {
		System.out.println("Le salaire de "+getM_strNom()+" est de "+getM_dSalaire());
	}
	//SETTER modificateur
	public void setM_strNom(String param){
		this.m_strNom = param;
	}
	
	public void setM_dSalaire(double param){
		this.m_dSalaire = param;
	}
	
	//GETTER accesseur 
	public String getM_strNom() {
		return this.m_strNom;
	}
	
	public double getM_dSalaire() {
		return this.m_dSalaire;
	}
}


