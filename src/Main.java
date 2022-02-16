import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList team1=new LinkedList();
        LinkedList team2=new LinkedList();

        team1.addTail("Jesus");
        team1.addTail("Salomon");
        team1.addTail("Rangel");

        team2.addFront("Cristian");
        team2.addFront("Daniel");
        team2.addFront("Diego");

    }
}
