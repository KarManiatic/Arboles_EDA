package master;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

import treesDSESIUCLM.*;

/**********************************************************************
 * Class Name: Principal Author/s name: Carlos Romero Navarro, Cristian Rubio
 * Barato, V�ctor Ortega G�mez Release/Creation date: 28/12/2021 Class
 * description: Clase principal que contiene el main y otros m�todos que
 * resuelven el ejercicio
 *
 **********************************************************************
 */

public class Principal {

	public static void main(String[] args) {
		System.out.println("Elija el d�o de �rboles que quiere analizar(1, 2 o 3)");
		Scanner leer = new Scanner(System.in);
		int i = leer.nextInt();

		resultadoArbol(i);
	}

	/*********************************************************************
	 *
	 * Method name: crearArbolA1
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolA1(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 3);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 4);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 5);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 1);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 2);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 4);
		NodeElement<Integer, Integer> n7 = new NodeElement<Integer, Integer>(7, 7);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);
		t.addRight(n2, n5);
		t.addLeft(n3, n6);
		t.addRight(n3, n7);

	}

	/*********************************************************************
	 *
	 * Method name: crearArbolB1
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolB1(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 3);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 4);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 5);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 1);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 7);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 4);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);

		t.addLeft(n3, n5);
		t.addRight(n3, n6);

	}

	/*********************************************************************
	 *
	 * Method name: crearArbolA2
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolA2(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 1);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 9);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 8);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 2);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 7);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 3);
		NodeElement<Integer, Integer> n7 = new NodeElement<Integer, Integer>(7, 9);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addRight(n2, n4);
		t.addRight(n4, n5);
		t.addLeft(n3, n6);
		t.addRight(n3, n7);

	}

	/*********************************************************************
	 *
	 * Method name: crearArbolB2
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolB2(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 2);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 4);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 5);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 1);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 2);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 3);
		NodeElement<Integer, Integer> n7 = new NodeElement<Integer, Integer>(7, 9);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);
		t.addRight(n2, n5);
		t.addLeft(n3, n6);
		t.addRight(n3, n7);

	}

	/*********************************************************************
	 *
	 * Method name: crearArbolA3
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolA3(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 8);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 3);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 10);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 1);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 6);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 14);
		NodeElement<Integer, Integer> n7 = new NodeElement<Integer, Integer>(7, 4);
		NodeElement<Integer, Integer> n8 = new NodeElement<Integer, Integer>(8, 7);
		NodeElement<Integer, Integer> n9 = new NodeElement<Integer, Integer>(9, 13);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);
		t.addRight(n2, n5);
		t.addLeft(n3, n6);

		t.addLeft(n5, n7);
		t.addRight(n5, n8);
		t.addLeft(n6, n9);

	}

	/*********************************************************************
	 *
	 * Method name: crearArbolB3
	 *
	 * Description of the Method: Crea un �rbol binario concreto
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario al que
	 * deseamos a�adir los nodos, es decir, el �rbol que queremos crear
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	private static void crearArbolB3(BinTreeInterface<NodeElement<Integer, Integer>> t) {
		NodeElement<Integer, Integer> n1 = new NodeElement<Integer, Integer>(1, 2);
		NodeElement<Integer, Integer> n2 = new NodeElement<Integer, Integer>(2, 7);
		NodeElement<Integer, Integer> n3 = new NodeElement<Integer, Integer>(3, 5);
		NodeElement<Integer, Integer> n4 = new NodeElement<Integer, Integer>(4, 2);
		NodeElement<Integer, Integer> n5 = new NodeElement<Integer, Integer>(5, 6);
		NodeElement<Integer, Integer> n6 = new NodeElement<Integer, Integer>(6, 9);
		NodeElement<Integer, Integer> n7 = new NodeElement<Integer, Integer>(7, 5);
		NodeElement<Integer, Integer> n8 = new NodeElement<Integer, Integer>(8, 11);
		NodeElement<Integer, Integer> n9 = new NodeElement<Integer, Integer>(9, 4);

		t.addRoot(n1);
		t.addLeft(n1, n2);
		t.addRight(n1, n3);

		t.addLeft(n2, n4);
		t.addRight(n2, n5);
		t.addLeft(n3, n6);

		t.addLeft(n5, n7);
		t.addRight(n5, n8);
		t.addLeft(n6, n9);

	}

	/*********************************************************************
	 *
	 * Method name: recorrerArbol
	 *
	 * Description of the Method: M�todo que va a recorrer el �rbol binario y
	 * guardar sus nodos en una cola
	 *
	 * Calling arguments: El argumento de este m�todo es el �rbol binario que
	 * deseamos recorrer
	 *
	 * Return value: El m�todo devolver� una cola la cual contendr� los nodos del
	 * �rbol binario en orden de izquierda a derecha por niveles
	 *
	 *********************************************************************/

	private static Queue recorrerArbol(BinTreeInterface<NodeElement<Integer, Integer>> arbol) {
		Queue<NodeBinTree> cola = new LinkedBlockingQueue<NodeBinTree>(); // Cola que almacenar� los nodos del �rbol y
																			// nos servir� para recorrer el mismo
		Queue<NodeBinTree> nodosArbol = new LinkedBlockingQueue<NodeBinTree>(); // Cola que almacenar� los nodos del
																				// �rbol en orden de izquierda a derecha
																				// por niveles

		NodeBinTree nodoVacio = new NodeBinTree(new NodeElement("Vacio", -1)); // Nodo que servir� en las colas para
																				// llenar los huecos vac�os
		NodeBinTree nodoOrigen = arbol.getRoot(); // Nodo que contendr� el nodo ra�z del �rbol
		NodeBinTree nodoSig; // Nodo el cual ir� almacenando el nodo que vayamos a evaluar al recorrer el
								// �rbol

		cola.add(nodoOrigen); // A�adimos el nodo ra�z a la primera cola
		nodosArbol.add(nodoOrigen); // A�adimos el nodo ra�z a la segunda cola

		while (!cola.isEmpty()) { // While que se ejecutar� mientras la primera cola no est� vac�a. Servir� para
									// recorrer el �rbol
			nodoSig = cola.poll(); // nodoSig almacenar� el siguiente nodo de la cola

			if (nodoSig.getLeft() != null) { // Si el nodo tiene hijo izquierdo
				cola.add(nodoSig.getLeft()); // Lo a�adimos a la cola
				nodosArbol.add(nodoSig.getLeft()); // Lo a�adimos a la cola
			} else // Si no tiene hijo izquierdo
				nodosArbol.add(nodoVacio); // A�adimos el nodo vac�o a la segunda cola

			if (nodoSig.getRight() != null) { // Si el nodo tiene hijo derecho
				cola.add(nodoSig.getRight()); // Lo a�adimos a la cola
				nodosArbol.add(nodoSig.getRight()); // Lo a�adimos a la cola
			} else // Si no tiene hijo derecho
				nodosArbol.add(nodoVacio); // A�adimos el nodo vac�o a la segunda cola
		}
		return nodosArbol; // Devolvemos la cola que contendr� todos los nodos del �rbol en orden de
							// izquierda a derecha por niveles
	}

	/*********************************************************************
	 *
	 * Method name: compararArboles
	 *
	 * Description of the Method: M�todo que comparar� dos colas las cuales
	 * contendr�n los nodos de los �rboles en orden de izquierda a derecha por
	 * niveles
	 *
	 * Calling arguments: Los argumentos ser�n dos colas las cuales contendr�n los
	 * nodos de los �rboles que queremos comparar
	 *
	 * Return value: El m�todo devolver� un entero el cual indicar� cuantos nodos
	 * comunes tienen los dos �rboles
	 *
	 *********************************************************************/

	public static int compararArboles(Queue<NodeBinTree> nodosArbol1, Queue<NodeBinTree> nodosArbol2) {
		// Creamos las variables necesarias
		int nodosIguales = 0; // Variable "contador" de nodos iguales
		NodeElement nodo1; // obtendra los valores del primer arbol
		NodeElement nodo2; // obtendra los valores del segundo arbol

		while (!nodosArbol1.isEmpty() && !nodosArbol2.isEmpty()) { // condicion de que ambas colas tengan al menos 1
																	// elemento
			nodo1 = (NodeElement) nodosArbol1.poll().getElement(); // asignamos cada elemento de la cola a nodo1 a la
																	// vez que se va borrando de la la misma con el
																	// metodo
																	// poll()
			nodo2 = (NodeElement) nodosArbol2.poll().getElement(); // asignamos cada elemento de la cola a nodo2 a la
																	// vez que se va borrando de la la misma con el
																	// metodo
																	// poll()
			if (!nodo1.toString().equals("Vacio -1") && !nodo2.toString().equals("Vacio -1")
					&& nodo1.getValue() == nodo2.getValue()) // Si ninguno de los dos nodos es "vacio" y el valor de los
																// dos nodos es el mismo, incrementa la variable nodos
																// iguales
				nodosIguales++;
		}

		return nodosIguales;
	}

	/*********************************************************************
	 *
	 * Method name: resultadoArbol
	 *
	 * Description of the Method:
	 *
	 * Calling arguments:
	 *
	 * Return value: El m�todo no devuelve nada, devuelve un void.
	 *
	 *********************************************************************/

	public static void resultadoArbol(int i) {
		BinTreeInterface<NodeElement<Integer, Integer>> arbol1;
		arbol1 = new BinTree<NodeElement<Integer, Integer>>();

		BinTreeInterface<NodeElement<Integer, Integer>> arbol2;
		arbol2 = new BinTree<NodeElement<Integer, Integer>>();

		if (i == 1) {
			crearArbolA1(arbol1);
			crearArbolB1(arbol2);
		}

		else if (i == 2) {
			crearArbolA2(arbol1);
			crearArbolB2(arbol2);
		}

		else if (i == 3) {
			crearArbolA3(arbol1);
			crearArbolB3(arbol2);
		}

		Queue<NodeBinTree> nodosArbol1 = recorrerArbol(arbol1);
		Queue<NodeBinTree> nodosArbol2 = recorrerArbol(arbol2);

		int numNodos = compararArboles(nodosArbol1, nodosArbol2); // obtenemos el numero de nodos iguales de los dos
																	// arboles
		System.out.println("El numero de nodos iguales es: " + numNodos);
	}
}
