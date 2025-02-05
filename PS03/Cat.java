public class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }

    @Override 
    public void talk(){
        System.out.println("Meow");
    }

    @Override 
    public void eat(){
        System.out.println("This Cat is eating");
    }

    void meow() {
        System.out.println("Meowwww");
    }

}
