package ArrayList;

public class LinkedList {
	
	class Node{//�ܹ��� ��ũ�帮��Ʈ
		int data;
		Node(int data) {this.data = data;}
		Node next = null; //���� Node�� �ּҰ�
	}
	
	int size = 0;
	Node head; // �Ǿ�
	Node rear; // �ǵ�
	
	void firstNode(int data) {
		Node newNode = new Node(data);
		head = newNode;
		rear = newNode; //�ּҰ��� �Ѱ��� ����
		size++;		
	}
	
	void addRearNode(int data) {
		if(size!=0) {//size�� ����? �ƹ��� ��尡 ����.
		Node newNode = new Node(data);
		rear.next = newNode;
		rear = newNode;
		size++;
		}
		else {
			firstNode(data);
		}	
	}
	
//	Node readNode(int index) {
//		if(size >0) {
//			Node node = head;
//			for(int i=0;i<index;i++) {
//				node = node.next;
//			}
//			return node;
//		}
//		else {
//			return null;
//		}
//	}
//	
	
	void addIndexNode(int index, int data) {
//		if((index>=0)&&(index<size)) {
//			Node newNode = new Node(data);
//			newNode.next = readNode(index);
//			readNode(index-1).next = newNode;
//		}
		Node inputNode = new Node(data);
		Node currNode = head;
		Node prevNode = head;
		for(int i=0;i<index-1;i++) {
			prevNode = currNode;
			currNode = currNode.next;
		}
		prevNode.next = inputNode;
		inputNode.next = currNode;		
		size++;
	}
	
	void printLinkedList() {
		Node currNode = head;
		for(int i=0;i<size;i++) {
			System.out.print(currNode.data+ " ");
			currNode = currNode.next;			
		}
		System.out.println();	
	}

}
