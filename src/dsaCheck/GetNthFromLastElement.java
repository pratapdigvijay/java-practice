package dsaCheck;

public class GetNthFromLastElement {
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
	
	public GetNthFromLastElement(int value) {
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

	int getNthFromLast(int n) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (n < 0 || n > count)
			return -1;
		int index = count - n;

		for (int i = 0; i < index; i++) {
			head = head.next;

		}
		return head.value;
	}

	public static void main(String[] args) {

		GetNthFromLastElement myLinkedList = new GetNthFromLastElement(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        
        System.out.println(myLinkedList.getNthFromLast(2));
	}
}
