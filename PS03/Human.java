public class Human extends Animal {

    public Human(String name){
        super(name);
    }

    @Override
    public void talk(){
        System.out.println("Bro I'm talking to you!");
    }

    @Override
    public void eat(){
        System.out.println("I'm Eating");
    }
}
