package Test;

import MobileElement.Cat;
import MobileElement.Dog;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("Milou", 25,16);
        Cat cat=new Cat("Mimi", 17,19);
        dog.move(1,1);
        System.out.println(dog);
        System.out.println(cat);
    }    
}
