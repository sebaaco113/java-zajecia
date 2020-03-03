public class Car {
    String model;
    Integer yearOfProduction;
    private String plates;
    String producer;
    Integer value = 400;

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

}
