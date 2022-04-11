public class Node {
    public Object data;
	public Node next; //referencia enlace
		
		// constructor para insertar al final
	public Node (int d) { 
		this.data =d;	
	}
		
		// Constructor para insertar al inicio
	public Node (int d, Node n) {
		data = d;
		next = n;
	}
}