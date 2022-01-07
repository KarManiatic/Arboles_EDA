package master;

/*********************************************************************
*
* Class Name: NodeElement
* Author/s name: Carlos Romero Navarro
* Release/Creation date: 01/01/2022
* Class description: Clase que define cómo son los nodos del árbol
*
**********************************************************************
*/


class NodeElement <V,T> {
	
	private V key;
	private T value;
	
	public NodeElement(V k, T v) {
		key = k;
		value = v;
	}
	public V getKey() {
		return key;
	}
	public void setKey(V k) {
		key = k;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T v) {
		value = v;
	}
	public boolean equals(Object n) {
		return key.equals(((NodeElement<T, V>) n).getKey());
	}
	
	public String toString() {
		return key + " "+value;
	}

}