package ClassExercise;

public class Dog extends Animal{

    public Dog() {
    }

    @Override
    public void makeSound() {
        super.makeSound();

        System.out.println("Woof woof");
    }
}
