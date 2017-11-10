package list;

/**
 * Created by Santhosh on 10/11/17.
 */
public class TestLinkedList {
    public static void main(String arg[]){
        ListImplementation listImplementation = new ListImplementation();
        listImplementation.insertAtFirst(2);
        listImplementation.displayList();
        listImplementation.insertAtEnd(7);
        listImplementation.displayList();
        listImplementation.insertAt(1,8);
        listImplementation.displayList();
        listImplementation.insertAt(3,9);
        listImplementation.displayList();
        listImplementation.insertAt(2,24);
        listImplementation.displayList();
        listImplementation.insertAt(40,24);
        System.out.println(listImplementation.size());

        listImplementation.deleteAt(1);
        listImplementation.displayList();
        System.out.println(listImplementation.size());

        listImplementation.deleteAt(2);
        listImplementation.displayList();
        System.out.println(listImplementation.size());


        listImplementation.deleteAt(3);
        listImplementation.displayList();
        System.out.println(listImplementation.size());





    }
}
