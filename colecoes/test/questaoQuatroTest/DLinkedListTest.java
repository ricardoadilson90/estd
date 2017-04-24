package questaoQuatroTest;

import org.junit.Assert;
import org.junit.Test;

import questaoQuatro.DLinkedList;
import questaoQuatro.DNode;

public class DLinkedListTest {

	@Test
	public void searchTest() {
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>();
		node.setValue("A");
		DNode<String> node1 = new DNode<>();
		node1.setValue("B");
		DNode<String> node2 = new DNode<>();
		node2.setValue("C");
		DNode<String> node3 = new DNode<>();
		node3.setValue("D");
		
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		DLinkedList<String> linkedListA = new DLinkedList<String>();
		node.setValue("A");
		node1 = new DNode<>();
		node1.setValue("B");
		node2 = new DNode<>();
		node2.setValue("D");
		node3 = new DNode<>();
		node3.setValue("J");

		linkedListA.addFirst(node);
		linkedListA.addLast(node1);
		linkedListA.addLast(node2);
		linkedListA.addLast(node3);

		
		Assert.assertFalse(linkedList.equals(linkedListA));

		node.setValue("A");
		node1 = new DNode<>();
		node1.setValue("B");
		node2 = new DNode<>();
		node2.setValue("C");
		node3 = new DNode<>();
		node3.setValue("D");
		DNode<String> node4 = new DNode<>();
		node4.setValue("D");
		linkedListA = new DLinkedList<String>();
		linkedListA.addFirst(node);
		linkedListA.addLast(node1);
		linkedListA.addLast(node2);
		linkedListA.addLast(node3);
		linkedListA.addLast(node4);
		
		Assert.assertFalse(linkedList.equals(linkedListA));

		
	}

}
