import java.io.File;
public class Animal {
    final static Double DEFAULT_WEIGHT_DOG = 12.0;
    final static Double DEFAULT_WEIGHT_LION = 190.0;
    final static Double DEFAULT_WEIGHT_MOUSE = 0.01;
    final String species;
    String name;
    private Double weight;
    File pic;
    public Animal(String species){
        this.species = species;
        if(this.species == "mouse") {
            weight = DEFAULT_WEIGHT_MOUSE;
        } else if (this.species == "dog") {
            weight = DEFAULT_WEIGHT_DOG;
        }else {
            weight = DEFAULT_WEIGHT_LION;
        }

    }
    void feed(){
        weight++;
        System.out.println("thx for food , my weight now is "+ weight);


    }
    void walk(){
        weight--;
        System.out.println(("thx for walk, my weight now is "+ weight));
    }

    public static Double getDefaultWeightDog() {
        return DEFAULT_WEIGHT_DOG;
    }

    public static Double getDefaultWeightLion() {
        return DEFAULT_WEIGHT_LION;
    }

    public static Double getDefaultWeightMouse() {
        return DEFAULT_WEIGHT_MOUSE;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }
}
