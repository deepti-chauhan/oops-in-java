public class Inheritance {
    public static void main(String[] args) {
        Animal newAnimal = new Animal("bob");
        Dog peppy = new Dog("peppy");

        newAnimal.saysHello();
        peppy.saysHello();
    }
}


class Animal {

    String name;
    public Animal(String name) {
        this.name = name;
    }

    void saysHello(){
        System.out.println("hello my name is "+ this.name + ". I am an animal");
    }


}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void saysHello() {
        System.out.println("hello my name is "+ this.name + ". I am a doggo ");
    }
}

