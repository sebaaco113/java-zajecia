import devices.Car;
import devices.Device;


public class Main {

    public static void main(String[] args) throws Exception {
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
        dirtyOne.setPlates("GDA32342");

        Human me = new Human();
        me.firstName = "Sebastian";
        me.lastName = "Kowalewski";
        me.setCar(dirtyOne);
        System.out.println(me.getCar().value);

        Human wife = new Human();
        wife.firstName = "Ania";
        wife.lastName = "Tak";
        wife.setCar(dirtyOne);



        System.out.println(wife.getCar());
        System.out.println(me.getCar());
        System.out.println(me);
        System.out.println(wife);



        System.out.println("-----------------------------");


        Human.setCar(dirtyOne);

        Device device = new Device() {
            @Override
            public boolean turnOn() {
                System.out.println("Turn On");
                return true;
            }
        };

        device.turnOn();

    }

}



