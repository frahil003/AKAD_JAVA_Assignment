package main;
// neuer test
public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("Hallo Main");
		
		MyQueue todoList = new MyQueue();
		
		System.out.println(todoList);
		
		System.out.println(todoList.textAusgeben() + "\n\n");
		
		System.out.println("+-------------------------------------+");
		System.out.println("| Meine Tagesplannung                 |");
		System.out.println("+-------------------------------------+");
		System.out.println(" HAUPTMENÜ:");
		System.out.println(" <1> Aufgabe hinzufügen");
		System.out.println(" <2> Aufgabe löschen");
		System.out.println(" <3> Noch Aufgaben vorhanden?");
		System.out.println(" <4> Wieviel Aufgaben sind vorhanden?");
		System.out.println(" <5> Alle Aufgaben löschen");
		System.out.println(" <6> Anzeigen Aufgaben");
		System.out.println("---------------------------------------");
		System.out.println(" Menüpunkt wählen: ");
	}
}
