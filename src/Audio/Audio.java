package Audio;

public class Audio extends Media {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private double loudness;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Audio(String name, double duration, double loudness){
        super(name, duration);
        this.loudness = loudness;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return super.toString() + loudness + ",";
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
