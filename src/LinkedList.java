public class LinkedList {
    protected Node start; // referencias para saber donde esta el start y el end
	public int countData;

	public void LinkedList() { 
		start = null;
		countData = 0;
	}
	
	// Método para agregar un Nodo al inicio de la LinkedList
	
	public void addNodeInStart (int element) {
		// Creando el Node
		Node newNode = new Node(element, start);
		start = newNode;
		countData++;
	}

	public void addNodeInFinal (int element) {
		Node newNode = new Node(element, null);
		if (start == null) {
			start = newNode;
			countData++;
		} else {
			Node currentNode = start;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}

			currentNode.setNext(newNode);
			countData++;
		}
	}

	// Método para mostrar los datos
	public void showLinkedList () {

		Node currentNode = start;
		while (currentNode.getNext() != null) {
			System.out.print("[" + currentNode.getData() + "]---->");
			currentNode = currentNode.getNext();
		}

		System.out.print("[" + currentNode.getData() + "]---->");
	}
}
