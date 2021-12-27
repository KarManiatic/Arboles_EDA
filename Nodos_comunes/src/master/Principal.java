package master;

import treesDSESIUCLM.*;

public class Principal {

	public static void main (String [] args) {
		BinTreeInterface<NodeElement<String, Integer>> t;
		t=new BinTree<NodeElement<String, Integer>>();
		crearArbol(t);
		
		BinTreeInterface<NodeElement<String, Integer>> r;
		r=new BinTree<NodeElement<String, Integer>>();
		crearArbol(r);
		
	}

	private static void crearArbol(BinTreeInterface<NodeElement<String, Integer>> t) {
		NodeElement<String, Integer> n1 = new NodeElement<String, Integer>("01", 1);
		NodeElement<String, Integer> n2 = new NodeElement<String, Integer>("02", 2);
		NodeElement<String, Integer> n3 = new NodeElement<String, Integer>("03", 3);
		NodeElement<String, Integer> n4 = new NodeElement<String, Integer>("04", 4);
		NodeElement<String, Integer> n5 = new NodeElement<String, Integer>("05", 5);
		NodeElement<String, Integer> n6 = new NodeElement<String, Integer>("06", 6);
		NodeElement<String, Integer> n7 = new NodeElement<String, Integer>("07", 7);
		
		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);
		t.addRight(n2, n5);
		t.addLeft(n3, n6);
		t.addRight(n3, n7);
		

		
	}
}
