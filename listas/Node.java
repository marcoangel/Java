public class Node {
    private Node next;
    private Object value;

    public Node(){
        this.next=null;
    }

    public Node(Object value){
        this.next=null;
        this.value=value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node [next=" + next + ", value=" + value + "]";
    }

    
}
