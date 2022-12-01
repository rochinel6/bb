package mecanique;
public class Robot {
    protected String nom;
    protected int nbrvie;
    
    
     public Robot() {
    	 nom="";
    	 nbrvie=0;
     }
     public Robot(String l, int p) {
    	 this.nom=l;
    	 this.nbrvie=p; 
    	 }
     public String getNom() {
    	 return nom;
     }
     public int getNbrvie() {
    	  return nbrvie;
     }
    	public void setNom(String nom) {
    		this.nom=nom;
    	}
    	public void setNbrvie1(int nbrvie) {
    		this.nbrvie=nbrvie;
    	}
    		public void affiche(String nom) {
    			System.out.println("Robot"+nom);
    		}
    		public void fire(Robot a, Robot b) {
    			a.nbrvie -=2;
    			System.out.println("Robot" + a.nom +"_a ete touche par" + b.nom);
    		}
    		public void isDead(Robot a) {
    		if(nbrvie == 0) {
    			System.out.println("GAME OVER !");
    		}
    		else {
    			System.out.println("encore vivant avec_"+a.nbrvie +"_vies");
    		}
			
				
			}
}
