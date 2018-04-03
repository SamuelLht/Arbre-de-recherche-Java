package ArbreB;

public class arbre {

	noeud racine;
	static int ordre;

	public arbre(int ordre) {
		arbre.ordre = ordre;
		racine = new noeud(ordre, null);
	}

	public noeud recherche(noeud racine, int c) {
		if (racine.clé[0] == -1) { // si le noeud est null
			return null;
		} else if (racine.feuille == true) { // si c'est une feuille
			return racine;
		}

		else if (racine.clé[0] > c) { // si c est inférieur a la premiere valeur
			if (racine.enfant[0] == null || racine.enfant[0].clé[0] == -1) { // on tcheck si lenfant est null
				return racine;
			} else {
				return recherche(racine.enfant[0], c);
			}
		} else if (racine.clé[1] < c) { // si c est supérieur à la derniere valeur
			if (racine.enfant[2] == null || racine.enfant[2].clé[0] == -1) { // on tcheck si lenfant est null
				return racine;
			} else {
				return recherche(racine.enfant[2], c);
			}

		} else if (racine.clé[1] > c && racine.clé[0] < c) { // si c est compris entre les deux valeur
			if (racine.enfant[1] == null || racine.enfant[1].clé[0] == -1) { // on tcheck si lenfant est null
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
		if (racine.feuille == true) { // si le noeud est une feuille
			if (racine.clé[1] == -1 && c > racine.clé[0]) { // si le noeud contient qu'une valeur et que c est supérieur
															// a celle ci
				racine.clé[1] = c;
			} else if (racine.clé[1] == -1 && c < racine.clé[0]) { // si le noeud contient une valeur et que c est
																	// inferieur a celle ci
				racine.clé[1] = racine.clé[0];
				racine.clé[0] = c;
			} else {
				// si le noeud est full, c'est la que la fonction split intervient
			}
		} else {
			if (racine.clé[1] == -1 && c > racine.clé[0]) {
				racine.clé[1] = c;
			} else if (racine.clé[1] == -1 && c < racine.clé[0]) {
				racine.clé[1] = racine.clé[0];
				racine.clé[0] = c;
			} else {
				// si le noeud est full c'est la que la fonction split intervient
			}
		}

	}

}
