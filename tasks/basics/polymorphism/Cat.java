package tasks.basics.polymorphism;

public class Cat implements AnimalInterface{
    String name = "Pufi";

    public void voice(){
        System.out.println(name + " meowes!");
    }
}
