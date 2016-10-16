package org.demo.newjava;

import java.util.LinkedList;
import java.util.List;

public class NewList<T> {

	List<T> list = new LinkedList<T>();
	
	public NewList() {
		super();
	}

	public void addItem( T item) 
	{
		list.add( item );
	}
	
	public void addItems(List<T> items) 
	{
		for ( T o : items ) 
		{
			list.add(o);
		}
	}
	
	public List<T> getItems() 
	{
		return list ;
	}
}
