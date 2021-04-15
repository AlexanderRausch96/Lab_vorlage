package prototype;

import java.util.LinkedList;
import java.util.List;

public class Fragenkatalog {

    final List<Frage> fragen;

    public Fragenkatalog() {
        this.fragen = new LinkedList<>();
    }

    public void addFrage(Frage fragen) {
        this.fragen.add(fragen);
    }

    public static Fragenkatalog erzeugeFragen() {

        Fragenkatalog katalog = new Fragenkatalog();

//   final Frage f1 = ;
        katalog.addFrage(new Frage("Was versteht man unter einer Arteriosklerose?", "Arterienverkalkung", "Durchblutungsstörung des Herzens", "Herzschwäche", "Verschluss einer Koronararterie"));
        final Frage f2 = new Frage("Was versteht man unter einer Herzrhythmusstörung?", "Störung der Reizbildung im Herzen", "Herzschmerzen", "Veränderung einer Herzklappe", "Herzklopfen");
        katalog.addFrage(f2);
        final Frage f3 = new Frage("Welche Blutplättchen gibt es nicht?", "Therozyten", "Leukozyten", "Erythrozyten", "Thrombozyten");
        katalog.addFrage(f3);
        final Frage f4 = new Frage("Wie kann arterielle Hypertonie noch beschreiben werden?", "Dauerhafte Blutdruckerhöhung", "Apaplex", "Varikosis", "Arteriosklerose");
        katalog.addFrage(f4);
        final Frage f5 = new Frage("Welche der folgenden Aussagen hängen nicht mit der Amnanese zusammen?", "Untersuchen des Augenhintergrundes", "Lokalisieren von Schmerzen", "Grad der Belastbarkeit", "Krankheitsverlauf");
        final Frage f6 = new Frage("Welche der folgenden Begriffe hängen nicht mit den Herzen zusammen?", "Triokard", "Endokard", "Epikard", "Myokard");
        final Frage f7 = new Frage("Welche der folgenden Beriffe hängt nicht mit den Erregungleitungssystem zusammen?", "Stenose", "Purkinje-Fasern", "AV-Knoten", "Hiss-Bündel");
        final Frage f8 = new Frage("Was versteht man unter Perkussion?", "Bestimmung der Herztöne", "Stauung der Halsvene", "Herztonfolge", "nichts trifft zu");
        final Frage f9 = new Frage("Was ist eine Krankheitsfolge der Koronarinsuffizienz?", "Plötzlicher Herztod", "Schlaganfall", "Diabtes Mellitus", "Angina pectoris");
        final Frage f10 = new Frage("Was trifft nicht auf das menschliche Herz zu?", "Das Herz besitzt 2 Klappen", "Es besitzt ein Septum", "Es ist mit der Aorta verbunden", "Es besitzt 2 Vorhöfe");
        final Frage f11 = new Frage("Welche der folgenden Wellen gibt es beim EKG nicht?", "C-Welle", "T-Welle", "U-Welle", "P-Welle");
        final Frage f12 = new Frage("Welcher der folgenden Begriffe beschreibt eine Mammographie?", "Brustuntersuchung der Frau nach Krebs", "Beschallung des tiefen Venensystems", "Spiegelung des Darms", "Bestimmung des Hämatokritwertes");

        katalog.addFrage(f5);
        katalog.addFrage(f6);
        katalog.addFrage(f7);
        katalog.addFrage(f8);
        katalog.addFrage(f9);
        katalog.addFrage(f10);
        katalog.addFrage(f11);
        katalog.addFrage(f12);

        return katalog;
    }

    public List<Frage> waehleZufaelligeFragen(int n) {
        // TODO Fragen der Reihe nach aufrufen lassen!
        return fragen.subList(0, n);
    }
}
