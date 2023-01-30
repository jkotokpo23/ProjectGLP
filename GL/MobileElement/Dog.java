package MobileElement;

import Display.State;

public class Dog extends Pet{

    public Dog(String name, State state){
        super(name, state);
    }

    public Dog(String name, int x, int y){
        super(name,x,y);
    }

    public boolean isDog(Pet pet){
        return pet.specie().equals("Dog");
    }

    @Override
    public String specie(){
        return "Dog";
    }
}