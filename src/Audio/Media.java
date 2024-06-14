package Audio;

public abstract class Media {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String name;
    private double duration;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Media (String name, double duration){
        this.name = name;
        this.duration = duration;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return name + "," + duration + ",";
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
