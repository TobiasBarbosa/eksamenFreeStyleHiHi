package DataObject;

import java.util.ArrayList;

public class Student implements DataObject{

    private String name;
    private int id;
    private String email;

    public Student(String name, int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @Override
    public ArrayList<String> getData() {
        ArrayList<String> dataListStudent = new ArrayList<>();
        dataListStudent.add(name);
        String idString = Integer.toString(id);
        dataListStudent.add(idString);
        dataListStudent.add(email);

        return dataListStudent;
    }

    @Override
   public int getId(){
        return id;
   }

   @Override
   public String toString(){
        return  "Student name: "  + name  + '\n' +
                "Student id: "    + id    + '\n' +
                "Student email: " + email + '\n' ;
   }

}
