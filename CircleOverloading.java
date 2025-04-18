class Area {
    double radius;

    Area (){
        radius=7.4;
    }
    Area (double r){
    radius = r;
    }
    double Ar (){
        return 3.141*radius*radius;
    }
}
class CircleOverloading{
    public static void main(String [] args){
        Area a1=new Area();
        Area a2=new Area(5.5);

        System.out.println(a1.Ar());
        System.out.println(a2.Ar());
    }
}