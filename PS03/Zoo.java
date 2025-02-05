public class Zoo {
    public static void main(String[] args) {
        Animal[] x;
        Dog d;
        Cat c;
        Human n;
        
        // สร้างอาร์เรย์สำหรับเก็บ Animal ทั้ง 3 ชนิด
        x = new Animal[3];
        
        // ทำการ upcasting โดยการเก็บ Dog, Cat และ Human ไว้ในตัวแปรชนิด Animal
        x[0] = d = new Dog("Goofy"); // this is known as upcasting
        x[1] = c = new Cat("Tom");
        x[2] = n = new Human("Mick");
        
        x[0].eat(); // เรียก eat() ของ Dog ผ่านตัวแปร Animal (polymorphism)
        d.eat(); // เรียก eat() ของ Dog โดยตรงผ่านตัวแปรชนิด Dog
        d.eat(c); // Dog กิน Cat
        n.eat(); // Human เรียก eat()

        // การ downcasting เพื่อเรียกเมธอดที่เป็นของ Dog โดยตรง
        ((Dog) x[0]).bark(); // this is known as downcasting

        // x[0].bark(); 
        // Error: เนื่องจาก x[0] ถูกประกาศเป็นชนิด Animal ซึ่งไม่มีเมธอด bark()
        
        // ((Dog)x[1]).bark(); 
        // Error: ClassCastException เพราะ x[1] เป็น Cat ไม่สามารถ cast เป็น Dog ได้

        // loop เพื่อเรียกพฤติกรรมเฉพาะตัวของสัตว์แต่ละชนิด
        for (Animal a: x) {
            if (a instanceof Cat) ((Cat) a).meow(); // หาก a เป็น Cat ให้เรียก meow()
            else if (a instanceof Dog) ((Dog) a).bark(); // หาก a เป็น Dog ให้เรียก bark()
            else a.talk(); // Human หรือ Animal อื่นจะเรียก talk()
        }
    }
}
