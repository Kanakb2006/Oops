class MaxGeneric {
    public static <T extends Comparable<T>> void max(T x, T y, T z){
        T max=x;

        if (y.compareTo(max)>0){
            max=y;}
        if (z.compareTo(max)>0){
            max=z;}
            return max;
}
public static void main(String[] args) {
    System.out.printf(" of %d, %d and %d is: %d", 3, 4, 5, max(3, 4, 5));
    System.out.printf(" of %.1f, %.1f and %.1f is: %.1f", 6.6, 8.8, 7.7, max(6.6, 8.8, 7.7));
}
}