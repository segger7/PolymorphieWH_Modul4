import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Aufgabe {

    private String aufgabentext;
    private final GregorianCalendar datumErstellung;

    public Aufgabe(String aufgabentext) {
        setAufgabentext(aufgabentext);
        datumErstellung = new GregorianCalendar();
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

    @Override
    public String toString() {
        SimpleDateFormat formatieren = new SimpleDateFormat();
        return "[Aufgabe: "+ aufgabentext +"; Erstellt am: "+ formatieren.format(datumErstellung.getTime()) +"]";
    }
}
