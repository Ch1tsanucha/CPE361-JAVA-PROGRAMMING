public abstract class Animal{
    String name;

    public Animal(String aniname){
        this.name = aniname;
    }

    abstract void talk();

    public void eat(){
        System.out.println("This Animal is eating");
    }
    
}