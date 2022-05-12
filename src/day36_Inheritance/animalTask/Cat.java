package day36_Inheritance.animalTask;

public class Cat extends Animal{

    @Override
    public void drink() {
        super.drink();
    }

    public void meow(){
        System.out.println(name + "is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }

}

/*
    Cat:
        6 variables
        8 methods
 */

