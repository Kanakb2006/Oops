class Animal {
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}
class Cat extends Animal {
 public void makeSound() {
     System.out.println("Cat barks");
 }
}
public class Main {
 public static void main(String[] args) {
     Animal myAnimal = new Animal();
     myAnimal.makeSound();  
     Animal myCat = new Cat();
     myCat.makeSound();    
 }
}
