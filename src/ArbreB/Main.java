package ArbreB;

public class Main {

	public static void main(String[] args) {
		arbre test = new arbre(2);
		test.racine.clé[0]=10;
		test.racine.clé[1]=20;
		test.racine.feuille=false;
		noeud zero = new noeud(2,test.racine);
		zero.clé[0]=5;
		zero.clé[1]=8;
		zero.feuille=false;
		noeud un = new noeud(2,test.racine);
		un.clé[0]=12;
		un.clé[1]=15;
		un.feuille=false;
		noeud deux = new noeud(2,test.racine);
		deux.clé[0]=22;
		deux.clé[1]=25;
		deux.feuille=false;
		noeud trois = new noeud(2,zero);
		deux.clé[0]=2;
		deux.clé[1]=4;
		noeud quatre = new noeud(2,zero);
		deux.clé[0]=6;
		deux.clé[1]=7;
		noeud cinq = new noeud(2,zero);
		deux.clé[0]=9;
		noeud six = new noeud(2,un);
		deux.clé[0]=11;
		noeud sept = new noeud(2,un);
		deux.clé[0]=13;
		noeud huit = new noeud(2,un);
		deux.clé[0]=17;
		noeud neuf = new noeud(2,deux);
		deux.clé[0]=21;
		noeud dix = new noeud(2,deux);
		deux.clé[0]=24;
		noeud onze = new noeud(2,deux);
		deux.clé[0]=30;
				
		
		test.racine.enfant[0]=zero;
		test.racine.enfant[1]=un;
		test.racine.enfant[2]=deux;
		zero.enfant[0]=trois;
		zero.enfant[1]=quatre;
		zero.enfant[2]=cinq;
		un.enfant[0]=six;
		un.enfant[1]=sept;
		un.enfant[2]=huit;
		deux.enfant[0]=neuf;
		deux.enfant[0]=dix;
		deux.enfant[0]=onze;
		
		System.out.println("Hello");
		System.out.println(test.recherche(test.racine,13).clé[0]);
		
		
	}
}
