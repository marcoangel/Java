import java.net.Socket;

public class List {
    protected Node firts;
    protected int tam;

    public List(){
        this.tam=0;
        this.firts=null;
    }

    public boolean isEmty(){
        if (this.tam==0) return true;
        else return false;
    }

    public void add(Object value){
        if (isEmty()) {
            this.firts=new Node(value);
            this.tam++;
            return;
        }
        else{
            Node tempo=this.firts;
            while (tempo.getNext()!=null) {
                tempo=tempo.getNext();
            }
            tempo.setNext(new Node(value));
            this.tam++;
        }
    }

    public void push(Object value){
        if (isEmty()) {
            this.firts=new Node(value);
            this.tam++;
            return;
        }
        else{
            Node tempo=this.firts;
            while (tempo.getNext()!=null) {
                tempo=tempo.getNext();
            }
            tempo.setNext(new Node(value));
            this.tam++;
        }
    }

    public void delete(Object value){
        if (isEmty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (this.firts.getValue().equals(value)) {
            this.firts = this.firts.getNext();
            this.tam--;
            return;
        }
        Node tempo = this.firts;
        while (tempo.getNext() != null && tempo.getNext().getValue()!=value){
            tempo = tempo.getNext();
        }

        if (tempo.getNext() != null) {
            tempo.setNext(tempo.getNext().getNext());
            this.tam--;
        } else {
            System.out.println(value + " no se encuentra en la lista.");
        }
    }

    public int getTam(){
        return this.tam;
    }

    public void print(){
        Node tempo=this.firts;
        System.out.print("{");
        while (tempo.getNext()!=null) {
            System.out.print(tempo.getValue()+", ");
            tempo=tempo.getNext();
        }
        System.out.println(tempo.getValue()+"}");
    }

    public static void main(String[] args) {
        System.out.println("Lista");
        List lista=new List();
        lista.add("marco");
        lista.add("juan");
        lista.add("mario");
        lista.print();
        lista.delete("juan");
        lista.print();

        lista.add("maria");
        lista.add("pedro");
        lista.add("carlos");
        lista.delete("pedro");
        lista.delete("maria");
        lista.print();

        System.out.println("Cola");
        Queue cola=new Queue();
        cola.add("marco");
        cola.add("juan");
        cola.add("mario");
        cola.print();
        cola.pop();
        cola.print();

        cola.add("maria");
        cola.add("pedro");
        cola.add("carlos");
        cola.pop();
        cola.pop();
        cola.print();


        System.out.println("Pila");
        Stack pila=new Stack();
        pila.add("marco");
        pila.add("juan");
        pila.add("mario");
        pila.print();
        pila.pop();
        pila.print();

        pila.add("maria");
        pila.add("pedro");
        pila.add("carlos");
        pila.pop();
        pila.pop();
        pila.print();
    }
}
