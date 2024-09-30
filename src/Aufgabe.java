import java.util.GregorianCalendar;

public class Aufgabe {

    private String aufgabentext;
    private GregorianCalendar datumErstellung;

    public Aufgabe(String aufgabentext, GregorianCalendar datumErstellung) {
        setAufgabentext(aufgabentext);
        setDatumErstellung(datumErstellung);
    }

    public String getAufgabentext() {
        return aufgabentext;
    }

    public void setAufgabentext(String aufgabentext) {
        this.aufgabentext = aufgabentext;
    }

    public GregorianCalendar getDatumErstellung() {
        return datumErstellung;
    }

    public void setDatumErstellung(GregorianCalendar datumErstellung) {
        this.datumErstellung = datumErstellung;
    }

    @Override
    public String toString() {
        return "[Aufgabe: "+ aufgabentext +"; Erstellt am: "+ datumErstellung.toString() +"]";
    }
}
