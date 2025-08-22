package tasks.basics.polymorphism;

public class Test01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        AnimalInterface[] animals = new AnimalInterface[2];
        animals[0] = cat1;
        animals[1] = dog1;

        for(int i = 0; i < animals.length; i++){
            animals[i].voice();
        }
    }
}