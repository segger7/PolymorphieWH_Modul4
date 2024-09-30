import java.util.GregorianCalendar;

public class AufgabeMitDeadline extends Aufgabe{

    private GregorianCalendar deadline;

    public AufgabeMitDeadline(String aufgabentext, GregorianCalendar datumErstellung, GregorianCalendar deadline) {
        super(aufgabentext, datumErstellung);
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
        return "[Aufgabe: "+ this.getAufgabentext() +"; Erstellt am: "+ this.getDatumErstellung().toString() +"; Deadline: "+ this.getDeadline().toString()+"]";
    }
}
