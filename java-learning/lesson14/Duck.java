package lesson14;

public class Duck implements Flyable, Swimmable {
   @Override
    public void fly() { 
	System.out.println("I can fly!");
     }

    @Override
    public void swim() { 
	System.out.println("I can swim!");
     }

}
   