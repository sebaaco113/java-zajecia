public class Rak {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.setName("ktos");


        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println("twoja stara");
        if (dog.getWeight() > 2) {
            dog.walk();
        } else {
            dog.feed();
        }

        Car dirtyOne = new Car();
        dirtyOne.producer = "Bentley";
        dirtyOne.model = "Continental";
        dirtyOne.yearOfProduction = 2019;
        dirtyOne.plates = "GDA32342";

        Human me = new Human ();
        me.firstName = "Sebastian";
        me.car = dirtyOne;
        System.out.println(me.car.plates);
    }
}

