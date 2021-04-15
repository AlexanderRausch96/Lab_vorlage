/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Rausch
 */
public class Frage {

    String fragetext;
    Antwort richtigeAntwort;
    List<Antwort> antworten = new ArrayList<>();

    public Frage(String fragetext, String richtigeAntwort, String... falscheOptionen) {
        this.fragetext = fragetext;
        this.richtigeAntwort = new Antwort(richtigeAntwort, true);
        
        for (int i = 0; i < falscheOptionen.length; i++) {
            this.antworten.add(new Antwort(falscheOptionen[i], false));
        }
        this.antworten.add(this.richtigeAntwort);
        Collections.shuffle(antworten);
    }

    public String getFragetext() {
        return this.fragetext;
    }

    public List<Antwort> getAntworten() {
        return antworten;
    }


    public Antwort getRichtigeAntwort() {
        return richtigeAntwort;
    }
    

}
