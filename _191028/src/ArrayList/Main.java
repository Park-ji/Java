package ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
//		ArrayList arr = new ArrayList();	
//		arr.add(1);
//		arr.print();
//		arr.add(2);
//		arr.print();
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		arr.print();
//		arr.delete(2);
//		arr.print();	
//		arr.add(6);
//		arr.print();
		
		LinkedList list = new LinkedList();
		list.addRearNode(1);
		list.addRearNode(2);
		list.addRearNode(3);
		list.printLinkedList();
		list.addIndexNode(2, 4);
		list.printLinkedList();
		list.addIndexNode(3, 5);
		list.printLinkedList();
		list.addRearNode(6);
		list.printLinkedList();
	}	
	

}

