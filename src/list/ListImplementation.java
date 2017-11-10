package list;


/**
 * Created by Santhosh on 10/11/17.
 */
public class ListImplementation{

    private Node start;

    private Node end;

    private int size;


    public ListImplementation (){
        start =null;
        end = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (start == null){
            return true;
        }
        return false;
    }

    public void insertAt(int pos , int data){

        if (pos ==-1 || pos >size){
            System.out.println("Invalid position");
            return;
        }
        Node node = new Node(data,null);
        if (start == null || pos ==1){
            insertAtFirst(data);
            return;
        }else if (pos==size){
            insertAtEnd(data);
            return;
        } else {
            size++;
            Node cNode = start;
            for (int i=2 ; i<=size ;i++){
                if(i==pos){
                    Node temp =cNode.getLink();
                    cNode.setLink(node);
                    node.setLink(temp);
                    break;
                }
                cNode = cNode.getLink();
            }
        }
    }

    public void insertAtFirst(int d){
        Node newNode = new Node(d,null);
        size ++;
        if (isEmpty()){
            start=newNode;
            end = start;
        }else{
            newNode.setLink(start);
            start=newNode;
        }
    }

    public void insertAtEnd(int d){
        size ++;
        Node newNode = new Node(d,null);
        if (isEmpty()){
            start=newNode;
            end = start;
        } else{
            end.setLink(newNode);
            end=newNode;
        }
    }


    public void deleteAt(int pos){

        if (pos ==-1 || pos >size){
            System.out.println("Invalid position");
            return;
        }else if(pos==1){
            size--;
            start = start.getLink();
            return;
        }else {
            size--;
            Node currentNode = start;
            for (int i=1 ; i<=size ;i++){
                if(i==pos-1){
                    currentNode.setLink(currentNode.getLink().getLink());
                    return;
                }
                currentNode = currentNode.getLink();
            }
        }



    }

    public void displayList(){
        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }

        if (start.getLink() == null){
            System.out.println (start.getData());
            return;
        }

        Node node = start;
        while (node.getLink() !=null){
            System.out.print (node.getData() + "-->");
            node = node.getLink();
        }
        System.out.println (node.getData());

    }

    public int size(){
        return size;
    }

}
