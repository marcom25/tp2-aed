public class LinkedList {
    protected Node start,end; // referencias para saber donde esta el start y el end
	
	public LinkedList() { 
		start = null;
		end = null;
	}
	
	// Método para agregar un Nodo al inicio de la LinkedList
	
	public void addNode (int element) {
		// Creando el Node
		start = new Node(element, start);
		if (end==null) {
			end=start;
		}
	}
	// Método para mostrar los datos
	public void showLinkedList () {
		Node iterate = start;
		System.out.println();
		while (iterate != null) {
			System.out.print("[" + iterate.data + "]---->");
			iterate = iterate.next;
		}
	}
}
