package ArbreB;

public class arbre {

	noeud racine;
	static int ordre;

	public arbre(int ordre) {
		arbre.ordre = ordre;
		racine = new noeud(ordre, null);
	}
	
	public arbre(int ordre, int valeur) {
		arbre.ordre = ordre;
		racine = new noeud(ordre, null);
		racine.cle[0]=valeur;
	}
	
	public arbre(int ordre, int valeur1, int valeur2) {
		arbre.ordre = ordre;
		racine = new noeud(ordre, null);
		racine.cle[0]=valeur1;
		racine.cle[1]=valeur2;
	}

	public noeud recherche(noeud racine, int c) {
		if (racine.cle[0] == -1) { // si le noeud est null
			return null;
		} else if (racine.feuille == true) { // si c'est une feuille
			return racine;
		}

		else if (racine.cle[0] > c) { // si c est inférieur a la premiere valeur
			if (racine.enfant[0] == null || racine.enfant[0].cle[0] == -1) { // on tcheck si lenfant est null
				return racine;
			} else {
				return recherche(racine.enfant[0], c);
			}
		} else if (racine.cle[1] < c) { // si c est supérieur à la derniere valeur
			if (racine.enfant[2] == null || racine.enfant[2].cle[0] == -1) { // on tcheck si lenfant est null
				return racine;
			} else {
				return recherche(racine.enfant[2], c);
			}

		} else if (racine.cle[1] > c && racine.cle[0] < c) { // si c est compris entre les deux valeur
			if (racine.enfant[1] == null || racine.enfant[1].cle[0] == -1) { // on tcheck si lenfant est null
				return racine;
			} else {
				return recherche(racine.enfant[1], c); // on recursif avec l'enfant du milieu
			}
		} else { // sinon genre c est égale a une valeur du noeud
			return racine;
		}
	}

	public void insertion(noeud racine, int c) {
		racine = recherche(racine, c); // on recupere le noeud ou il doit etre inserer avec la fonction recherche
		
		if (c == racine.cle[0] || c == racine.cle[1]) { // si c est egale a une des deux valeur du noeud
			return;
		}
		
		if (racine.cle[1] == -1 && c > racine.cle[0]) { // si le noeud contient qu'une valeur et que c est supérieur
			racine.cle[1] = c;
		} else if (racine.cle[1] == -1 && c < racine.cle[0]) { // si le noeud contient une valeur et que c est
																	// inferieur a celle ci
			racine.cle[1] = racine.cle[0];
			racine.cle[0] = c;
		} else {
			if (c < racine.cle[0]) {
				noeud tmp = new noeud (2,racine);
				tmp.cle[0] = c;
				racine.enfant[0] = tmp;
				racine.feuille = false;
			} else if (c > racine.cle[1]) {
				noeud tmp = new noeud (2,racine);
				tmp.cle[0] = c;
				racine.enfant[2] = tmp;
				racine.feuille = false;					
			} else {
				noeud tmp = new noeud (2,racine);
				tmp.cle[0] = c;
				racine.enfant[1] = tmp;
				racine.feuille = false;					
			}
		}
	} 
}
