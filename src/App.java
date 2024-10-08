import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {

    private static Aufgabenliste aufgabenListe;

    public static void main(String []args) {
        aufgabenListe = new Aufgabenliste();
        runApplication();
    }

    public static void runApplication() {
        boolean toggle = true;
        while(toggle) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("********* Task Liste bearbeiten *********");
            System.out.println("1) Alle Aufgaben anzeigen");
            System.out.println("2) Aufgabe durchsuchen");
            System.out.println("3) Deadlines anzeigen");
            System.out.println("4) Neue Aufgabe hinzufügen");
            System.out.println("--a) Standard-Aufgabe");
            System.out.println("--b) Aufgabe mit Deadline");
            System.out.println("5) Aufgabe erledigt");
            System.out.println("x) Beenden");
            System.out.println("*****************************************");

            String eingabe = scanner.nextLine();
            switch(eingabe) {
                case "1": aufgabenListe.alleAufgabenAusgeben();
                    break;
                case "2" :
                    System.out.println("Titel der zu suchenden Aufgabe eingeben: ");
                    String eingabeTitel = scanner.nextLine();
                    aufgabenListe.aufgabeAusgeben(eingabeTitel);
                    break;

                case "3": aufgabenListe.alleDeadlinesAusgeben();
                    break;
                case "4a":
                    System.out.println("Titel der Aufgabe eingeben: ");
                    String eingabeTitel4a = scanner.nextLine();
                    aufgabenListe.addAufgabe(new Aufgabe(eingabeTitel4a));
                    break;
                case "4b":
                    System.out.println("Titel der Aufgabe eingeben: ");
                    String eingabeTitel4b = scanner.nextLine();
                    System.out.println("Datum für die Deadline eingeben (In Zahlen): ");
                    System.out.println("Tag: ");
                    int eingabeTag= scanner.nextInt();
                    System.out.println("Monat: ");
                    int eingabeMonat = scanner.nextInt() -1;
                    System.out.println("Jahr: ");
                    int eingabeJahr = scanner.nextInt();
                    aufgabenListe.addAufgabe(new AufgabeMitDeadline(eingabeTitel4b,new GregorianCalendar(eingabeJahr, eingabeMonat, eingabeTag)));
                    break;

                case "5":
                    System.out.println("Index der zu entfernenden Aufgabe eingeben: ");
                    int eingabePosition = scanner.nextInt();
                    aufgabenListe.aufgabeEntfernen(eingabePosition);
                    break;

                case "x":
                    toggle = false;
                    System.out.println("Programm beendet");
                    break;

                default:
                    System.out.println("Richtige Eingabe tätigen!");
                    break;

            }
        }
    }


}
