package questaoDoisTest;

import org.junit.Assert;
import org.junit.Test;

import questaoDois.DLinkedList;
import questaoDois.DNode;

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

		long teste;//= linkedList.getNodeHeight("C");
		
		//Assert.assertTrue(teste == 2);
		teste = linkedList.getNodeHeight(node);
		System.out.println(teste);
		Assert.assertTrue(teste == 3);

		
		

		
	}

}
