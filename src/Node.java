public class Node {
    public Object data;
	public Node next; //referencia enlace
		
		// Constructor para insertar al inicio
	public Node (int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}