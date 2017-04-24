package questaoDoisTest;

import org.junit.Assert;
import org.junit.Test;

import questaoDois.DLinkedList;
import questaoDois.DNode;

public class DLinkedListTest{
	
	@Test // Questão 1
	public void searchTest(){
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
		
		Assert.assertEquals(node, linkedList.search("A"));
		Assert.assertFalse(node2, linkedList.search("B"));
	}
	
	@Test//Questão 2
	public void getNodeHeightTest() {
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

		long teste = linkedList.getNodeHeight("C");
		
		Assert.assertTrue(teste == 1);
		teste = linkedList.getNodeHeight(node);
		System.out.println(teste);
		Assert.assertTrue(teste == 3);
	}
	
	@Test //Questão 3
	public void getNodeDepthTest(){
		
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		long teste = linkedList.getNodeDepth("C");
		
		Assert.assertFalse(teste == 1);
		Assert.assertTrue(teste == 3);
		
	}
	
	@Test //Questão 4
	public void equalsTest(){
		
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		DLinkedList<String> linkedLista = new DLinkedList<String>();
		
		linkedList.addFirst(node);
		linkedList.addLast(node2);
		linkedList.addLast(node1);
		linkedList.addLast(node3);
		
		Assert.assertFalse(linkedList.equals(linkedLista));
		
		linkedLista = new DLinkedList<String>();
		
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		Assert.assertTrue(linkedList.equals(linkedLista));
	}
	
	@Test //Questão 5
	public void copyTest(){
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		Assert.assertEquals(linkedList, linkedList.copy(linkedList));
		
	}
	
	@Test //Questão 6
	public void invertTest(){
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		DLinkedList<String> aux = new DLinkedList<String>();
		aux.addFirst(node3);
		aux.addLast(node2);
		aux.addLast(node1);
		aux.addLast(node);
		
		AssertEquals(aux, linkedList.invert(linkedList));
		
	}
	
	@Test //Questão 9
	public void joinTest(){
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		DLinkedList<String> aux = new DLinkedList<String>();
		DNode<String> node = new DNode<>("E");
		DNode<String> node1 = new DNode<>("F");
		DNode<String> node2 = new DNode<>("G");
		DNode<String> node3 = new DNode<>("H");
		aux.addFirst(node);
		aux.addLast(node1);
		aux.addLast(node2);
		aux.addLast(node3);
		
		DLinkedList<String> aux2 = linkedList.join(linkedList,aux);
		
		DLinkedList<String> aux3 = new LinkedList<String>();
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		aux3.addFirst(node);
		aux3.addLast(node1);
		aux3.addLast(node2);
		aux3.addLast(node3);
		DNode<String> node = new DNode<>("E");
		DNode<String> node1 = new DNode<>("F");
		DNode<String> node2 = new DNode<>("G");
		DNode<String> node3 = new DNode<>("H");
		aux3.addLast(node);
		aux3.addLast(node1);
		aux3.addLast(node2);
		aux3.addLast(node3);
		
		Assert.assertEquals(aux3,aux2);
		
	}
	
	@Test //Questão 10
	public void removeTest(){
		DLinkedList<String> linkedList = new DLinkedList<String>();
		Assert.assertTrue(linkedList.getSize() == 0);
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node2 = new DNode<>("C");
		DNode<String> node3 = new DNode<>("D");
		linkedList.addFirst(node);
		linkedList.addLast(node1);
		linkedList.addLast(node2);
		linkedList.addLast(node3);
		
		linkedList.remove("C");
		
		DLinkedList<String> aux = new DLinkedList<String>();
		DNode<String> node = new DNode<>("A");
		DNode<String> node1 = new DNode<>("B");
		DNode<String> node3 = new DNode<>("D");
		aux.addFirst(node);
		aux.addLast(node1);
		aux.addLast(node3);
		
		Assert.assertEquals(aux,linkedList);
		Assert.assertTrue(linkedList.getSize == 3);
		
	}
	
}
