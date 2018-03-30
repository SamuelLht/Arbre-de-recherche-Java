package ArbreB;

public class arbre {

	noeud racine;
	static int ordre;
	
	public arbre(int ordre) {
		this.ordre = ordre;
		racine = new noeud(ordre,null);		
    }
	
	public noeud recherche(noeud racine, int c)
    {       
        int index = 0;
       
		while(index < racine.nombrecle && c > racine.cle[index])
		{
			index++;
		}
		if(index <= racine.nombrecle && c == racine.cle[index])
		{
			return racine;
		}
		return racine;		
    }

}