public class Queue extends List {

    public Queue(){
        super();
    }

    public Object pop(){
        Node tempo=this.firts;
        this.firts=this.firts.getNext();
        return tempo.getValue();
    }
}
