public class Node {
    public Object data;
    // Referencia enlace
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
