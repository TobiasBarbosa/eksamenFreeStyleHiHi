package Tekst;

public class Main {
    public static void main(String[] args) {

        Tekst tekst = new Tekst();

        String hej1 = "hej";
        String hej2 = "hej";
        String hej3 = "hejet";
        String hej4 = "hejto";

        tekst.addText(hej1);
        tekst.addText(hej2);
        tekst.addText(hej3);
        tekst.addText(hej4);

        System.out.println(tekst.findNoOfUniques());
    }
}
