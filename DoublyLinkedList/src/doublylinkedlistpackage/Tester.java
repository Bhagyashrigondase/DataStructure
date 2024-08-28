package doublylinkedlistpackage;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList l1=new DoublyLinkedList();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		//l1.insertAtPosition(90, 2);
		l1.display();
		//l1.deleteByValue(40);
		System.out.println("After deleting:");
		l1.deleteByPosition(4);
		l1.display();
	}

}
