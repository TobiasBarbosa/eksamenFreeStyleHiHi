package DataObject;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DataObject user1 = new User("Monir", 2345, "Momo123");
        DataObject user2 = new User("Tob", 3452, "ToBo125");

        DataObject student1 = new Student("Josefine", 3455, "jojo@yoyo.dk");
        DataObject student2 = new Student("Mette", 6788, "NedeMette789");

        ArrayList<DataObject> dataObjectsList = new ArrayList<>();
        dataObjectsList.add(user1);
        dataObjectsList.add(user2);
        dataObjectsList.add(student1);
        dataObjectsList.add(student2);

        for(DataObject data : dataObjectsList){
                System.out.println(data.getData());
            }

        //System.out.println(student1.getData());
        //System.out.println(student2.getData());

        //System.out.println(dataObjectsList);

    }
}
