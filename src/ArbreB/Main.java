package ArbreB;

public class Main {

	public static void main(String[] args) {
		arbre test = new arbre(2);
		test.racine.cle[0]=10;
		test.racine.cle[1]=20;
		test.racine.feuille=false;
		noeud zero = new noeud(2,test.racine);
		zero.cle[0]=5;
		zero.cle[1]=8;
		zero.feuille=false;
		noeud un = new noeud(2,test.racine);
		un.cle[0]=12;
		un.cle[1]=15;
		un.feuille=false;
		noeud deux = new noeud(2,test.racine);
		deux.cle[0]=22;
		deux.cle[1]=25;
		deux.feuille=false;
		noeud trois = new noeud(2,zero);
		trois.cle[0]=2;
		trois.cle[1]=4;
		noeud quatre = new noeud(2,zero);
		quatre.cle[0]=6;
		quatre.cle[1]=7;
		noeud cinq = new noeud(2,zero);
		cinq.cle[0]=9;
		noeud six = new noeud(2,un);
		six.cle[0]=11;
		noeud sept = new noeud(2,un);
		sept.cle[0]=13;
		noeud huit = new noeud(2,un);
		huit.cle[0]=17;
		noeud neuf = new noeud(2,deux);
		neuf.cle[0]=21;
		noeud dix = new noeud(2,deux);
		dix.cle[0]=24;
		noeud onze = new noeud(2,deux);
		onze.cle[0]=30;
				
		
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
		
		arbre testauto = new arbre(2,10,20);
		test.insertion(testauto.racine,5);
		test.insertion(testauto.racine, 7);
		test.insertion(testauto.racine, 6);
		System.out.println("Hello");
		//System.out.println(test.recherche(testauto.racine,6));
		System.out.println(testauto.toString());
		
	}
}
