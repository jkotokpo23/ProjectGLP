package MobileElement;

import Display.State;

public abstract class Pet{
    
    private String name;
    
    private State state=new State();
    
    public Pet(String name, State state) {
        this.name = name;
        this.state = state;
    }

    public Pet(String name, int x, int y){
        this.name=name;
        this.state.setX(x);
        this.state.setY(y);
    }
        
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public State getState(){
        return this.state;
    }

    public void setState(State state){
        this.state=state;
    }

    public void move(int posX, int posY){
        this.state.move(posX, posY);
    }

    public String toString(){
        return "[Name = "+getName()+"]\nLocalisation : "+getState();
    }
    
    abstract String specie();
    
}