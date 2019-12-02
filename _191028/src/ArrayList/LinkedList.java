package ArrayList;

public class LinkedList {
	
	class Node{//단방향 링크드리스트
		int data;
		Node(int data) {this.data = data;}
		Node next = null; //다음 Node의 주소값
	}
	
	int size = 0;
	Node head; // 맨앞
	Node rear; // 맨뒤
	
	void firstNode(int data) {
		Node newNode = new Node(data);
		head = newNode;
		rear = newNode; //주소값만 넘겨준 상태
		size++;		
	}
	
	void addRearNode(int data) {
		if(size!=0) {//size가 없다? 아무런 노드가 없다.
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
