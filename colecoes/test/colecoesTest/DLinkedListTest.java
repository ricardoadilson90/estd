package colecoesTest;

import org.junit.Assert;
import org.junit.Test;

import colecoes.DLinkedList;
import colecoes.DNode;
import colecoes.Node;
import colecoes.SLinkedList;

public class DLinkedListTest {

	
	@Test
	public void getSizeTest(){
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
		linkedList.addFirst(node1);
		linkedList.addFirst(node2);
		linkedList.addFirst(node3);
	
		Assert.assertTrue(linkedList.getSize()==4);
		Assert.assertFalse(linkedList.isEmpty());
		Assert.assertEquals(linkedList.getFirst(), node3);
		Assert.assertEquals(linkedList.getLast(), node);
	}
	
}
