package ArbreB;

public class Main {

	public static void main(String[] args) {
		arbre test = new arbre(2);
		test.racine.cl�[0]=10;
		test.racine.cl�[1]=20;
		test.racine.feuille=false;
		noeud zero = new noeud(2,test.racine);
		zero.cl�[0]=5;
		zero.cl�[1]=8;
		zero.feuille=false;
		noeud un = new noeud(2,test.racine);
		un.cl�[0]=12;
		un.cl�[1]=15;
		un.feuille=false;
		noeud deux = new noeud(2,test.racine);
		deux.cl�[0]=22;
		deux.cl�[1]=25;
		deux.feuille=false;
		noeud trois = new noeud(2,zero);
		trois.cl�[0]=2;
		trois.cl�[1]=4;
		noeud quatre = new noeud(2,zero);
		quatre.cl�[0]=6;
		quatre.cl�[1]=7;
		noeud cinq = new noeud(2,zero);
		cinq.cl�[0]=9;
		noeud six = new noeud(2,un);
		six.cl�[0]=11;
		noeud sept = new noeud(2,un);
		sept.cl�[0]=13;
		noeud huit = new noeud(2,un);
		huit.cl�[0]=17;
		noeud neuf = new noeud(2,deux);
		neuf.cl�[0]=21;
		noeud dix = new noeud(2,deux);
		dix.cl�[0]=24;
		noeud onze = new noeud(2,deux);
		onze.cl�[0]=30;
				
		
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
		deux.enfant[1]=dix;
		deux.enfant[2]=onze;
		
		System.out.println("Hello");
		System.out.println(test.recherche(test.racine,23));
		
		
	}
}
