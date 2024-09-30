import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class AufgabeMitDeadline extends Aufgabe{

    private GregorianCalendar deadline;

    public AufgabeMitDeadline(String aufgabentext, GregorianCalendar deadline) {
        super(aufgabentext);
        setDeadline(deadline);
    }

    public GregorianCalendar getDeadline() {
        return deadline;
    }

    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatieren = new SimpleDateFormat();
        return "[Aufgabe: "+ this.getAufgabentext() +"; Erstellt am: "+ formatieren.format(getDatumErstellung().getTime()) +"; Deadline: "+ formatieren.format(this.getDeadline().getTime())+"]";
    }
}
