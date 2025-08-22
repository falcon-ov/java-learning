package tasks.basics.polymorphism;

public class Dog implements AnimalInterface{
    String name = "Hach";

    public void voice(){
        System.out.println(name+" hafs, hafs!!");
    }
}
