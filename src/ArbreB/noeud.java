package ArbreB;

public class noeud {
	
		int ordre;
	    public int nombrecl�;     // nombre de noeuds       
	    public int cl�[];    // nombre de valeurs que comporte le noeud en question                  
	    public noeud parent;
	    public noeud enfant[];       // le nombre d'enfant que peux avoir un noeud        
	    public boolean feuille;        // c'est pour savoir si le noeud est une feuille ou pas
	    
	    
	    public noeud() {
	    	this.ordre=2;
	    	cl� = new int[ordre];          
	        enfant = new noeud[ordre + 1];       
	        feuille = true;
	        nombrecl� = 0;
	    }
	    
	    public noeud(int ordre, noeud parent)
		{
			this.ordre = ordre;  
			this.parent = parent; 
			cl� = new int[ordre];
			enfant = new noeud[ordre + 1]; 
			cl�[0] = -1;
			cl�[1] = -1;
		}

}

