import java.util.jar.JarOutputStream;

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

    }
}

