package Article;

public class Main {

    public static void main(String[] args) {

        Article article1 =  new Article("hej", "DecimalFormat is is a concrete subclass FisseKusseSchmeichelErEnMur of NumberFormat that formats decimal numbers. It has a variety of features designed to make it possible to parse and", "Monir");

        System.out.println(article1.getLongestWord());
        System.out.println(article1.getWords());
    }
}
