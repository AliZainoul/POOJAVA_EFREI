// Up casting
class Animal{
  public void sound(){
    System.out.println("Animal making a sound");
  }
}

class Cat extends Animal{
  public void sound(){
    System.out.println("Cat making a sound");
    super.sound();
  }
}

class Dog extends Animal{
  public void sound(){
    System.out.println("Dog making a sound");
    super.sound();
  }
}


public class Main{
  public static void main(String [] args){
    Animal animal = new Animal();
    Cat cat = new Cat();
    Animal catAnimal = cat;
    Dog dog = new Dog();
    Animal dogAnimal = dog;
    //System.out.println(animal);
    //System.out.println(cat);
    //System.out.println(dog);
    animal.sound();
    cat.sound();
    dog.sound();
    catAnimal.sound();
    dogAnimal.sound();
  }
}
