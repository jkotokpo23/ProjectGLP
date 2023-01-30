package MobileElement;

import Display.State;

public class Cat extends Pet{ 

    public Cat(String name, State state){
        super(name, state);
    }

    public Cat(String name, int x, int y){
        super(name,x,y);
    }
    @Override
    public String specie(){
        return "Cat";
    }

    public boolean isCat(Pet pet){
        return pet.specie().equals("Cat");
    }
    
}