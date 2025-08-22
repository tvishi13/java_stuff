import java.util.Scanner;

class Circle {
    
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

      double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        double area = c.calculateArea();
        System.out.printf("Area of the circle: %.2f\n", area);

        sc.close();
    }
}
