package Salarie;

public class Application {

	public static void main(String[] args) {
		Salarie salarie = new Salarie("LOLO",200);
			
		salarie.setM_strNom("TOC");
		salarie.setM_dSalaire(300);
		salarie.calculSalaire();
		//System.out.println("Le salaire de "+salarie.getM_strNom()+" est de "+salarie.getM_dSalaire());
		Salarie salarie2 = new Salarie("salarie2",3000);
		
	}

}
