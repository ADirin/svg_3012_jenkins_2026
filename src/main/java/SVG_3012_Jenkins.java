import java.util.Scanner;

public class SVG_3012_Jenkins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Speed");
        double speed = sc.nextDouble();
        System.out.println("distance");
        double distance = sc.nextDouble();
        //System.out.println(printReport(speed,distance));
        try {
            System.out.println(printReport(speed,distance));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
// This is a new method
    public static void validateInput(double speed, double distance) {
        if (speed <=0) {
            throw new IllegalArgumentException("Speed must be greater than zero");
        }
        if(distance <=0) {
            throw new IllegalArgumentException("Distance must be greater than zero");}
    }

    public static double timeCal(double speed, double distance){
        validateInput(speed,distance);
        return distance/speed;
    }
    public static String printReport(double speed, double distance){
        double time=timeCal(speed,distance);
        return "distance "+ distance + ", time "+time + " ,speed "+speed;
    }


}
