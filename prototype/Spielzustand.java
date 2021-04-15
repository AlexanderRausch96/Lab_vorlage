package prototype;

import java.util.List;

public class Spielzustand {

    public enum Phase {
        FRAGE_GESTELLT,
        ANTWORT_GEGEBEN;
    }
    
    private Phase phase = Phase.FRAGE_GESTELLT;
    private int frageNr = 1;
    private int punkte = 0;
    
    private final List<Frage> fragen;

    Spielzustand(Fragenkatalog fragenkatalog) {
        fragen = fragenkatalog.waehleZufaelligeFragen(10);
    }

    public void onAntwortGegeben() {
        phase = Phase.ANTWORT_GEGEBEN;
    }
    
    public void onWeiter() {
        frageNr++;
        phase = Phase.FRAGE_GESTELLT;
    }
    
    
    
    public Frage aktuelleFrage() {
        return fragen.get(frageNr-1);
    }

    public int getFrageNr() {
        return frageNr;
    }

    public int getPunkte() {
        return punkte;
    }

    public void erhoeheFrageNr() {
        this.frageNr++;
    }

    public void erhoehePunkte() {
        this.punkte += 5;
    }

}
