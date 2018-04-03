package ArbreB;

public class noeud {
	
		int ordre;
	    public int nombreclé;     // nombre de noeuds       
	    public int clé[];    // nombre de valeurs que comporte le noeud en question                  
	    public noeud parent;
	    public noeud enfant[];       // le nombre d'enfant que peux avoir un noeud        
	    public boolean feuille;        // c'est pour savoir si le noeud est une feuille ou pas
	    
	    
	    public noeud() {
	    	this.ordre=2;
	    	clé = new int[ordre];          
	        enfant = new noeud[ordre + 1];       
	        feuille = true;
	        nombreclé = 0;
	    }
	    
	    public noeud(int ordre, noeud parent)
		{
			this.ordre = ordre;  
			this.parent = parent; 
			clé = new int[ordre];
			enfant = new noeud[ordre + 1]; 
			clé[0] = -1;
			clé[1] = -1;
		}

}

