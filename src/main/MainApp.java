package main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("Hallo Main");
				
		MyQueue todoList = new MyQueue();
		
		System.out.println(todoList);
				
		System.out.println("+-------------------------------------+");
		System.out.println("| Tagesplannung                       |");
		System.out.println("+-------------------------------------+");
		System.out.println("| Keine Aufgaben / 12 Aufgaben        |");
		System.out.println("+-------------------------------------+");
		System.out.println(" HAUPTMENÜ:");
		System.out.println(" <1> Aufgabe hinzufügen");
		System.out.println(" <2> Aufgabe löschen");
		System.out.println(" <3> Aufgaben anzeigen");
		System.out.println(" <4> Alle Aufgaben löschen");
		System.out.println(" <5> Programm beenden");
		System.out.println("---------------------------------------");
		System.out.println(" Menüpunkt wählen: ");
	}
}
