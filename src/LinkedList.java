public class LinkedList {
    // Primer nodo
    public Node start;
    // Cantidad de nodos
    public int nodeCount;

    public LinkedList() {
        this.start = null;
        this.nodeCount = 0;
    }

    // Agrega un nodo al final de la lista
    public void addNode(Object element) {
        Node newNode = new Node(element, null);
        if (this.start == null) {
            this.start = newNode;
            this.nodeCount++;
        } else {
            Node currentNode = start;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            this.nodeCount++;
        }
    }

    // Muestra la lista de una forma legible
    public void print() {
        Node currentNode = start;
        while (currentNode.getNext() != null) {
            System.out.print("[ " + currentNode.getData() + " ]---->");
            currentNode = currentNode.getNext();
        }
        System.out.print("[ " + currentNode.getData() + " ]---->");
    }
}
