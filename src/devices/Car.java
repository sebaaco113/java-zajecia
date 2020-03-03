package devices;

public class Car {
    public String model;
    public Integer yearOfProduction;
    private String plates;
    public String producer;
    public Integer value = 400;

    public String getPlates(){
        return plates;
    }
    public void setPlates(String plates) throws Exception {
        if(plates.length() > 8 ) {
            throw new Exception();
        } else {

            this.plates = plates;
        }
    }
    public String toString(){
        return this.producer + " " + this.model;
    }
}
