package LandTract;

import java.util.Scanner;

public class LandTract {
    private double length;
    private double width;
    
    public LandTract(double len, double wid) {
        this.length = len; 
        this.width = wid;
    }
    
    public LandTract(LandTract lndT) {
        this.length = lndT.getLength();
        this.width = lndT.getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
       
    public boolean equals(LandTract obj) {
        if (this.length == obj.getLength() && this.width == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter length of tract 1: ");
       double length = input.nextDouble();
       System.out.println("Please enter width of tract 1: ");
       double width = input.nextDouble();
       LandTract LandTract1 = new LandTract(length, width);
       
       System.out.println("Please enter length of tract 2: ");
       length = input.nextDouble();
       System.out.println("Please enter width of tract 2: ");
       width = input.nextDouble();
       LandTract LandTract2 = new LandTract(length, width);
       
       System.out.println();
       
       System.out.println("The area of tract 1: " + LandTract1.getArea());
       System.out.println("The area of tract 2: " + LandTract2.getArea());
       
       System.out.println();
       
       if (LandTract1.equals(LandTract2)) {
        System.out.println("The tracts of land dimensions are equal");
       } else {
        System.out.println("The tracts of land dismenions are not equal");
       }
    }
          
}
    
    
