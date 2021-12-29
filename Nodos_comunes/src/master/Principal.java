package master;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import treesDSESIUCLM.*;

public class Principal {

	public static void main(String[] args) {
		BinTreeInterface<NodeElement<String, Integer>> arbol1;
		arbol1 = new BinTree<NodeElement<String, Integer>>();
		crearArbol(arbol1);

		BinTreeInterface<NodeElement<String, Integer>> arbol2;
		arbol2 = new BinTree<NodeElement<String, Integer>>();
		crearArbol(arbol2);

		Queue<NodeBinTree> nodosArbol1 = recorrerArbol(arbol1);
		Queue<NodeBinTree> nodosArbol2 = recorrerArbol(arbol2);

		int numNodos = compararArboles(nodosArbol1, nodosArbol2);
		System.out.println("El numero de nodos iguales es: " + numNodos);

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

	private static Queue recorrerArbol(BinTreeInterface<NodeElement<String, Integer>> arbol) {
		Queue<NodeBinTree> cola = new LinkedBlockingQueue<NodeBinTree>();
		Queue<NodeBinTree> nodosArbol = new LinkedBlockingQueue<NodeBinTree>();

		NodeBinTree nodoVacio = new NodeBinTree(new NodeElement("Vacio", -1));
		NodeBinTree nodoOrigen = arbol.getRoot();
		NodeBinTree nodoSig;

		cola.add(nodoOrigen);
		nodosArbol.add(nodoOrigen);

		while (!cola.isEmpty()) {
			nodoSig = cola.poll();

			if (nodoSig.getLeft() != null) {
				cola.add(nodoSig.getLeft());
				nodosArbol.add(nodoSig.getLeft());
			} else
				nodosArbol.add(nodoVacio);

			if (nodoSig.getRight() != null) {
				cola.add(nodoSig.getRight());
				nodosArbol.add(nodoSig.getRight());
			} else
				nodosArbol.add(nodoVacio);
		}
		return nodosArbol;
	}

	public static int compararArboles(Queue<NodeBinTree> nodosArbol1, Queue<NodeBinTree> nodosArbol2) {
		int nodosIguales = 0;
		Object nodo1;
		Object nodo2;

		while(!nodosArbol1.isEmpty()) {
			nodo1 = nodosArbol1.poll().getElement();
			nodo2 = nodosArbol2.poll().getElement();
			if (!nodo1.toString().equals("Vacio -1") && !nodo2.toString().equals("Vacio -1") && nodo1.equals(nodo2))
				nodosIguales++;
		}
	
		return nodosIguales;
	}

}
