package Dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

    Dream dream1 = new Dream(LocalDate.of(2024,6,6), 40, Type.NIGHTMARE);
    Dream dream2 = new Dream(LocalDate.of(2024,5,6), 11, Type.NEUTRAL);
    Dream dream3 = new Dream(LocalDate.of(2024,3,6), 9, Type.PROBLEMSOLVING);

        System.out.println(dream1.isPleasant(dream1));
        System.out.println(dream2.isPleasant(dream2));
        System.out.println(dream2.isPleasant(dream3));

        ArrayList<Dream> dreamList = new ArrayList<>();
        dreamList.add(dream1);
        dreamList.add(dream2);
        dreamList.add(dream3);


        ArrayList<Dream> dreamDateList = new ArrayList<>();
            for (Dream dream : dreamList) {
                dreamDateList.add(dream);
                Collections.sort(dreamDateList, new DateComparator());
            }
        System.out.println(dreamDateList);


    }
}
