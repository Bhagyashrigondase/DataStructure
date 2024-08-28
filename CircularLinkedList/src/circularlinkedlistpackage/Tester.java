package circularlinkedlistpackage;

public class Tester {

	public static void main(String[] args) {
		CircularLinkedList cl=new CircularLinkedList();
		
		cl.insert(50);
		cl.insert(10);
		cl.insert(30);
		cl.insert(20);
		cl.insert(40);
		cl.sortLinkedList();
		
		
		//cl.sortList();
		
		
		//cl.insertAtposition(100, 1);
		
//		cl.display();
//        //cl.deleteByValue(9750);
//		cl.deleteByPosition(3);
//        System.out.println("After deleting:");
        //cl.display();
        //cl.findMidElement();
	}

}
