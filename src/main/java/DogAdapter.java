public class DogAdapter implements Bell {

    Dog dog;
    public DogAdapter(Dog dog){
        this.dog = dog;
    }
    @Override
    public void ring() {
        dog.bark();
    }
}
