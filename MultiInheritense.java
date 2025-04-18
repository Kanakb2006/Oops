class Animal{
    public void Eat() {
        System.out.println("Eating.....");
    }
}
class Dog extends Animal {
    public void Bark() {
        System.out.println("Barking.....");
    }
}
class Puppy extends Dog {
    public void Weep() {
        System.out.println("Weeping.....");
    }
}
class MultiInheritense{
    public static void main (String args[]){
        Puppy p=new Puppy();
        p.Bark();
        p.Eat();
        p.Weep();
    }
}