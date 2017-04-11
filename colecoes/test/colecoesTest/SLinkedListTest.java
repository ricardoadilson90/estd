package colecoesTest;

import org.junit.Assert;
import org.junit.Test;

import colecoes.Node;
import colecoes.SLinkedList;

public class SLinkedListTest {

	
	@Test
	public void getSizeTest(){
		SLinkedList<String> linkedList = new SLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		
		Node<String> node = new Node<>();
		node.setValue("A");
		Node<String> node1 = new Node<>();
		node1.setValue("B");
		Node<String> node2 = new Node<>();
		node2.setValue("C");
		Node<String> node3 = new Node<>();
		node3.setValue("D");
		
		linkedList.add(node);
		Assert.assertTrue(linkedList.getSize() == 1);
		linkedList.add(node1);
		Assert.assertTrue(linkedList.getSize() == 2);
		linkedList.add(node2);
		Assert.assertTrue(linkedList.getSize() == 3);
		linkedList.removeFirst();
		Assert.assertTrue(linkedList.getSize() == 2);
		Assert.assertTrue(linkedList.getFirst().getValue() == "B");
		linkedList.add(node3);
		Assert.assertTrue(linkedList.getSize() == 3);
	}
}
