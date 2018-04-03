package ArbreB;

public class noeud {
	
		int ordre;
	    public int nombrecle;     // nombre de noeuds       
	    public int cle[];    // nombre de valeurs que comporte le noeud en question                  
	    public noeud parent;
	    public noeud enfant[];       // le nombre d'enfant que peux avoir un noeud        
	    public boolean feuille;        // c'est pour savoir si le noeud est une feuille ou pas
	    
	    
	    public noeud() {
	    	this.ordre=2;
	    	cle = new int[ordre];          
	        enfant = new noeud[ordre + 1];       
	        feuille = true;
	        nombrecle = 0;
	    }
	    
	    public noeud(int ordre, noeud parent)
		{
			this.ordre = ordre;  
			this.parent = parent; 
			cle = new int[ordre];
			enfant = new noeud[ordre + 1]; 
			cle[0] = -1;
			cle[1] = -1;
		}
	    
	    public String toString() {
	    	return "["+cle[0]+","+cle[1]+"]";
	    }

}

