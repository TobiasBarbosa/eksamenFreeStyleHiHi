package Audio;

public class Video extends Media {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private double aspectRatio;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Video(String name, double duration, double aspectRatio){
        super(name, duration);
        this.aspectRatio = aspectRatio;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return super.toString() + aspectRatio + ",";
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
