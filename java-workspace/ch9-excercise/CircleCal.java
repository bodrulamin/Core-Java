import java.util.Scanner;
class CircleCal{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	System.out.print("====================");
	System.out.print(" Enter Radius ");

	Circle c = new Circle(sc.nextDouble());
	double area = c.getArea();

	System.out.print("====================");
	System.out.println(" The Area is " +area);



    }	

}


class Circle{
    double radius;


    public Circle(){
	System.out.println("Default Constructor");
    }
    public Circle(double r){
	System.out.println("2nd Constructor");
	radius = r;
    }

    double getArea(){
	return radius * radius * Math.PI;
    }

}
