public class AdapterPatternDemo {
    public static void main(String[] args) {
        Labrador dog = new Labrador();
        Bell doorBell = new DoorBell();

        Bell dogAdapter = new DogAdapter(dog);

        System.out.println("Labrador...");
        dog.lick();
        dog.bark();

        System.out.println("PlasticToyDog...");
        doorBell.ring();

        System.out.println("DogAdapter...");
        dogAdapter.ring();
    }
}
