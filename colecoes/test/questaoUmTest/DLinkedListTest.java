package questaoUmTest;

import org.junit.Assert;
import org.junit.Test;

import questaoUm.DLinkedList;
import questaoUm.DNode;

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

		DNode<String> aux = linkedList.search("C");
		
		Assert.assertEquals(aux, node2);

		
	}

}
