public class Stack extends List{

    public Stack(){
        super();
    }

    public Object pop(){
        Node tempo=this.firts;
        while(tempo.getNext().getNext()!=null){
            tempo=tempo.getNext();
        }
        Node tempo2=tempo;
        tempo.setNext(null);
        return tempo2.getValue();
    }
    
}
