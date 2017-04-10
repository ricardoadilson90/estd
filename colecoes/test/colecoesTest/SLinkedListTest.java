package colecoesTest;

import org.junit.Assert;
import org.junit.Test;

import colecoes.Node;
import colecoes.SLinkedList;

public class SLinkedListTest {

	
	@Test
	public void getSizeTest(){
		SLinkedList<String> linkedList = new SLinkedList<>();
		Assert.assertTrue(linkedList.getSize() == 0);
		Node<String> node = new Node<>();
		linkedList.add(node);
		Assert.assertTrue(linkedList.getSize() == 1);
	}
}
