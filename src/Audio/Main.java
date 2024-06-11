package Audio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Media> mediaList = new ArrayList<>();
        Media media1 = new Video("Løvernes Konge", 150, "16:9");
        Media media2 = new Audio("Burn by Usher", 3.51, 55);

        mediaList.add(media1);
        mediaList.add(media2);

        try {
            File file = new File("mediainfo.txt");
            PrintStream printStream = new PrintStream(file);
            for (Media media : mediaList) {
                printStream.println(media);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }



    }
}
