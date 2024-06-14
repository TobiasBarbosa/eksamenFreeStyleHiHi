package DataObject;

import java.util.ArrayList;

public class User implements DataObject {

    private String name;
    private int id;
    private String userName;
    private ArrayList<String> dataListUser = new ArrayList<>();

    public User(String name, int id, String userName){
        this.name = name;
        this.id = id;
        this.userName = userName;
    }

    @Override
    public ArrayList<String> getData() {
        dataListUser.add(name);
        String idString = Integer.toString(id);
        dataListUser.add(idString);
        dataListUser.add(userName);
        return dataListUser;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return  "User name: " + name     + '\n' +
                "User id: "   + id       + '\n' +
                "Username: "  + userName + '\n' ;
    }


}
