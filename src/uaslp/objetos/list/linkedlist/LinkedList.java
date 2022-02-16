package uaslp.objetos.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public  void addTail(String data){
        Node node = new Node();
        node.data=data;
        if(size==0){
            head=node;
        }else {
            tail.next=node;
            node.previous=tail;
        }
        tail=node;
        size++;
    }

    public  void addFront(String data){
        Node node = new Node(data);

        if(size==0){
            tail = node;
        }else{
            head.previous = node;
        }
        node.next=head;
        head = node;
        size++;
    }

    public  void remove(int index){

    }

    public  void removeAll(){

    }

    public  void setAt(int index, String data){

    }

    public  String getAt(String index){
        return null;
    }
}
