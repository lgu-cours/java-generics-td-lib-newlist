package org.demo.newjava;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class NewListTest {
	
	public static void print(List<String> items ) {
		System.out.println("Items : ");
		for ( String s : items ) {
			System.out.println(" . " + s );
		}
	}

	@Test
	public void test() {
		NewList<String> list = new NewList<String>();
		
		list.addItem("A");
		list.addItem("B");
		list.addItem("C");
		
		print ( list.getItems() ) ;
		assertNotNull( list.getItems() );
		assertEquals( 3, list.getItems().size() );

		//---
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("X");
		list2.add("Y");
		list2.add("Z");		
		
		list.addItems(list2);

		print ( list.getItems() ) ;
		
		assertEquals( 6, list.getItems().size() );
	}

}
