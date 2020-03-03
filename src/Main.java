import java.lang.reflect.Executable;

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

        Human me = new Human ();
        me.firstName = "Sebastian";
        me.setCar(dirtyOne);
        System.out.println(me.getCar().value);

        Human wife = new Human ();
        wife.firstName = "Ania";
        wife.setCar(dirtyOne);
        System.out.println(wife.getCar().yearOfProduction);

        if(me.getCar().value> me.budget)  {
            System.out.printf("you are poor");
        }else {
            System.out.printf("you can rent a car");
        }

        }

    }





