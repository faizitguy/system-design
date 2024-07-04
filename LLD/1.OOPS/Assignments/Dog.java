public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    };

    public void makeSound() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        Dog puppy = new Dog("puppy");
        puppy.makeSound();
        puppy.walk();
    }
}
