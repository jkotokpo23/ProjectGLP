package Display;

public class State {
    
    private int x;
    
    private int y;
    
    public State(int posX, int posY){
        this.x=posX;
        this.y=posY;
    }
    
    public State(){
        x=0;
        y=0;
    }

    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setX(int posX){
        this.x=posX;
    }
    
    public void setY(int posY){
        this.y=posY;
    }

    public void move(int x, int y){
        this.x=this.x+x;
        this.y=this.y+y;
    }

    public String toString(){
        return "[ X = "+this.x+" & Y = "+this.y+"]";
    }
    public static void main(String[] args) {
        System.out.println(new State(10,25));
    }
}
