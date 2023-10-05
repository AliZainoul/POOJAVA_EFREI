// Down casting
class Animal{
  public void sound(){
    System.out.println("Animal making a sound");
  }
}

class Cat extends Animal{
  public void sound(){
    System.out.println("Cat making a sound");
    //super.sound();
  }
}

class Dog extends Animal{
  public void sound(){
    System.out.println("Dog making a sound");
    //super.sound();
  }
}


public class Main{
  public static void main(String [] args){

    Animal animal = new Cat();

    //if(animal instanceof Cat){
      Cat cat = (Cat) animal;
      cat.sound();
    //  animal.sound();
  //  }

    Animal animal1 = new Dog();
  //  if(animal1 instanceof Dog){
      Dog dog = (Dog) animal1;
      dog.sound();
    //  animal1.sound();
  //  }

    /*
    Cat cat = new Cat();
    Dog dog = new Dog();

    //System.out.println(animal);
    //System.out.println(cat);
    //System.out.println(dog);
    animal.sound();
    cat.sound();
    dog.sound();
    */
  }
}
