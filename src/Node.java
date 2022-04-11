public class Node {
    public Object dato;
	public Node siguiente; //referencia enlace
		
		// constructor para insertar al final
	public Node (int d) { 
		this.dato =d;
			
	}
		
		// Constructor para insertar al inicio
	public Node (int d, Node n) {
		dato = d;
		siguiente = n;
	
	}
}
