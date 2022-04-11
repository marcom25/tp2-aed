public class LinkedList {
    protected Node inicio,fin; // referencias para saber donde esta el inicio y el fin
	
	public void LinkedList () {
		inicio = null;
		fin = null;
	}
	
	// Metodo para agregar un Node al inicio de la LinkedList
	
	public void agregarAlInicio (int elemento) {
		// Creando el Node
		inicio = new Node(elemento, inicio);
		if (fin==null) {
			fin=inicio;
		}
	}
	// Metodo para mostrar los datos
	public void mostrarLinkedList () {
		
		Node recorrer = inicio;
		System.out.println();
		while (recorrer != null) {
			System.out.print("[" + recorrer.dato + "]---->");
			recorrer = recorrer.siguiente;
		}
		
	}
}
