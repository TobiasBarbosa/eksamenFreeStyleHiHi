package Names;

public class Names {

    //***ATTRIBUTES / INSTANCE VARIABLES***-----------------------------------------------------------------------------
    String firstName;
    String middleName;
    String lastName;

    //***CONSTRUCTOR***
    public Names(String fullName){
        setFullName(fullName);
    }

    public void setFullName(String fullName){
        String[] names = fullName.split(" ");

        if(names.length == 1){
            throw new IllegalArgumentException("You have to write your full name");

        } else if(names.length == 2){
            firstName = names[0];
            lastName = names[1];

        } else if (names.length == 3){
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];

        } else {
            throw new IllegalArgumentException("You can maximum use 3 names");
        }
    }

    @Override
    public String toString(){
        String result = "First name: " + firstName  + '\n';

        if (middleName != null){
            result += "Middle name: "  + middleName + '\n';
        }
            result += "Last name: "    + lastName   + '\n';

        return result;
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
