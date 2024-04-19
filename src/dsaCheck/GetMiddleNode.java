package dsaCheck;


public class GetMiddleNode {
	Node head;
	Node tail;
	int length;
	
	class Node{
		Node next;
		int value;
		
		public Node(int value) {
			this.value= value;
			next = null;
		}
	}
	
	public GetMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
 //First way to get middle node, where finding length first then looking at middle of element.
    int getMiddle()
    {
         // Your code here.
         
         Node temp = head;
         int count =0;
         while(temp != null){
             count++;
             temp= temp.next;
         }
         int index;
         if(count%2==0){
             index= (count/2) +1 ;
         }else{
             index = (count-1)/2 + 1;
         }
         temp= head;
         for(int i=1; i<index;i++){
             temp = temp.next;
         }return temp.value;
    }
    
  //Second way to get middle node, where using Floyd’s Cycle Finding Algorithtm.
    public int getMiddleNodeSecond() {
    	if(head==null) return -1;
    	Node slow = head;
    	Node fast = head;
    	
    	while (fast != null && fast.next !=null) {
    		fast = fast.next.next;
    		slow= slow.next;
    	}
    	return slow.value;
    }
    
    public static void main(String[] args) {

    	GetMiddleNode myLinkedList = new GetMiddleNode(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        
        System.out.println(myLinkedList.getMiddle());
        System.out.println(myLinkedList.getMiddleNodeSecond());
	}

}
