import java.util.Scanner;   
public class Box2<T>{
    private T t;
    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the integer: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of the string: ");
        String b = sc.next();
        Box2<Integer> integerBox = new Box2<Integer>();
        Box2<String> stringBox = new Box2<String>();
        integerBox.set(a);
        stringBox.set(new String(b));
        System.out.printf("Integer Value :%s\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}