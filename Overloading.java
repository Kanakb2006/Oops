class Box {
    double width;
    double height;
    double depth;

    Box (double w,double h, double d){
    width = w;
    height = h;
    depth = d;
    }
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume (){
    return width*height*depth;
    }
}
 class Overloading {
    public static void main (String args []){
        Box m1= new Box(10,20,15);
        Box m2= new Box();
        Box m3= new Box(7);

        System.out.println(m1.volume());
        System.out.println(m2.volume());
        System.out.println(m3.volume());
    }
 }