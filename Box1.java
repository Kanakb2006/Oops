public class Box1<T>{
    private T t;
    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args){
        Box1<Integer> integerBox = new Box1<Integer>();
        Box1<String> stringBox = new Box1<String>();
        integerBox.set((10));
        stringBox.set(new String("Hello World"));
        System.out.printf("Integer Value :%s\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}