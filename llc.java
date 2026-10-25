public class llc {

    private Node head;
    private Node tail;
    private int size;

    public llc()
    {
        this.size=0;
    }

    public void insertfirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head = node;

        if(tail==null)
        {
            tail= head;
        }
        size=size+1;
    }

        public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    private class Node{

        private int value;
        private Node next;

 

    public Node(int value)
    {
        this.value=value;
    }




    


}

 public static void main(String[] args) {
    llc list =new llc();
    list.insertfirst(34);
    list.insertfirst(368);
    list.insertfirst(463);
    list.display();
  }
}
