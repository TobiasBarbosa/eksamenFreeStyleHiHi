package Car;

public class Car {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private String brand;
    private int carWeight;
    private int totalWeight;
    private boolean hasTrailerPossibility;
    Trailer trailer;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public Car(String brand, int weight){
        this.brand = brand;
        this.carWeight = weight;
        this.hasTrailerPossibility = false;
    }

    public Car(String brand, int weight, Trailer trailer){
        this.brand = brand;
        this.carWeight = weight;
        this.hasTrailerPossibility = true;
        setTrailer(trailer);
        this.totalWeight = getTotalWeightForCar();
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public int getTotalWeightForCar(){
        this.totalWeight = carWeight;
        if(hasTrailerPossibility && trailer != null){
            totalWeight += trailer.getWeight();
        }
        return totalWeight;
    }

    public void setTrailer(Trailer trailer) {
        if (carWeight + trailer.getWeight() <= 3500 && carWeight + trailer.getWeight() >= 0) {
            this.trailer = trailer;
        } else {
            throw new IllegalArgumentException("Total weight cannot exceed 3500kg");
        }
    }



    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    public String toString(){
        String result =
                "Car\n" +
                "Brand: "  + brand  + '\n' +
                "Weight: " + carWeight + '\n' +
                "Trailer option: " ;
                if(hasTrailerPossibility) {
                result += "Yes\n" +
                          "Trailer weight: " + trailer.getWeight() + '\n' +
                          "Total weight: " + getTotalWeightForCar() + '\n';
                } else {
                    result += "No\n";
                }

                return result;
    }

    //***END CLASS***---------------------------------------------------------------------------------------------------
}
