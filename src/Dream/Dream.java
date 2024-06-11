package Dream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Dream {

    private LocalDate date;
    private double duration;
    private Type type;

    public Dream(LocalDate date, double duration, Type type) {
        this.date = date;
        this.duration = duration;
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public String isPleasant(Dream dream) {
        String isPleasant = "You had a pleasant dream";
        String unPleasant = "You had an unpleasant dream";

        if (dream.type.equals(Type.PROBLEMSOLVING) && duration < 10) {
            return isPleasant;
        }

        if (dream.type.equals(Type.NEUTRAL) && duration > 10) {
            return isPleasant;

        } else {

            return unPleasant;
        }
    }

//    public ArrayList<Dream> sortDate() {
//        ArrayList<Dream> dreamDateList = new ArrayList<>();
//
//        for (Dream dream : dreamList) {
//            dreamDateList.add(dream);
//            Collections.sort(dreamDateList, new DateComparator());
//        }
//        return dreamDateList;
//    }


    public String toString(){
        return "Dream\n" +
                "Date: " + date + '\n' +
                "Date: " + duration + '\n' +
                "Date: " + type + '\n' ;
    }
}
