import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Aufgabenliste {

    private List<Aufgabe> aufgabenList;

    public Aufgabenliste(List<Aufgabe> aufgabenList) {
        setAufgabenList(aufgabenList);
    }

    public Aufgabenliste() {
        setAufgabenList(new ArrayList<>());
    }

    public List<Aufgabe> getAufgabenList() {
        return aufgabenList;
    }

    public void setAufgabenList(List<Aufgabe> aufgabenList) {
        this.aufgabenList = aufgabenList;
    }

    public void alleAufgabenAusgeben() {
        if(!aufgabenList.isEmpty()) {
            for(Aufgabe a : aufgabenList) {
                System.out.println(a);
                System.out.println("-------------------------------------------------------");
            }
        } else {
            System.out.println("Keine Aufgaben in Liste vorhanden!");
        }
    }

    public void aufgabeAusgeben(String aufgabentext) {
        for(Aufgabe a : aufgabenList) {
            if(a.getAufgabentext().equals(aufgabentext)) {
                System.out.println(a);
            }
        }
    }

    public void addAufgabe(Aufgabe aufgabe) {
        aufgabenList.add(aufgabe);
    }

    public void alleDeadlinesAusgeben() {
        for(Aufgabe a : aufgabenList) {
            if(a instanceof AufgabeMitDeadline) {
                if(((AufgabeMitDeadline) a).getDeadline().before(new GregorianCalendar())) {
                    System.out.println("(!) ÜBERFALLIG " + a);
                    System.out.println("-------------------------------------------------------");
                } else {
                    System.out.println(a);
                    System.out.println("-------------------------------------------------------");
                }
            }
        }
    }

    public void aufgabeEntfernen(int position) {
        aufgabenList.remove(position);
    }
}
