package Tekst;

import java.util.ArrayList;

public class Tekst {


    private ArrayList<String> textLines;

    public Tekst() {
        textLines = new ArrayList<>();

    }

    public void addText(String text) {
        textLines.add(text);
    }

    public int findNoOfUniques() {
        ArrayList<String> tempArray = new ArrayList<>();

        for (String text : textLines) {
            if (!tempArray.contains(text)) {
                tempArray.add(text);
            }
        }
            return tempArray.size();
    }

}
