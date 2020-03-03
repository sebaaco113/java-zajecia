public class Rak {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.setName("ktos");


        Animal pet = dog;
        System.out.println(pet.name);
        System.out.println(pet.species);

        if (pet.getWeight() > 2) {
            pet.walk();
        } else {
            pet.feed();
        }

    }
}

