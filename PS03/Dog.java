public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void talk(){
        System.out.println("Barking");
    }

    @Override
    public void eat(){
        System.out.println("This Dog is eating");
    }

    public void eat(Cat c){
        System.out.println("This Dog is eating " + c.name);
    }

    void bark() {
        System.out.println("Browwwww");
    }
    
}
