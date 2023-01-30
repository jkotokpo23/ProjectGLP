package StaticElement;

import Display.State;

public class StaticElement {

    private String name;
    private State state;

    public StaticElement(String name, State state){
        this.name= name;
        this.state=state;
    }

    public String getName(){
        return this.name;
    }

    public State getState(){
        return this.state;
    }
}
