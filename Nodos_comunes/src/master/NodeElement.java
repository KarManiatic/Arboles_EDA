package master;

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
//wetrnrtefdggf
}