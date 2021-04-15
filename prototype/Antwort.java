package prototype;

public class Antwort {

    final boolean istRichtig;
    final String text;

    public Antwort(String text, boolean istRichtig) {
        this.istRichtig = istRichtig;
        this.text = text;
    }

    String getText() {
        return text;
    }

    public boolean istRichtig() {
        return istRichtig;
    }

}
