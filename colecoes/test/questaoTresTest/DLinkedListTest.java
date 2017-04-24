package questaoTresTest;

import org.junit.Assert;
import org.junit.Test;

import questaoTres.DLinkedList;
import questaoTres.DNode;

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

		long teste;
		teste = linkedList.getNodeDepth(node2);
		System.out.println(teste);
		Assert.assertTrue(teste == 2);

		
		

		
	}

}
