package main;

import interfaces.Interface_Queue;

public class MyQueue implements Interface_Queue {

	public String bezeichnung;
	public String zusatz;
	
	public MyQueue() {
		this.bezeichnung = "Mein Tageablauf";
		this.zusatz = "Frank Hilgenberg";
	}	

	@Override
	public void enter(int element) {
		// TODO Auto-generated method stub
	}

	@Override
	public void leave() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void printQueue() {
		
	}
	
	@Override
	public String textAusgeben() {
		return "Ein Text wird ausgegeben!";
	}		
}
