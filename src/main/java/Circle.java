/**
 * Implements a class that encapsulates data and methods for representing a square
 * @author Sonam Sherpa
 * @version 1.0
 * @since 2024-09-20
 */
import java.lang.Math;

class Circle {

// instance variables //
private final double pi = 3.14;

private double radius = 1.0;

private double perimeter = 2 * pi;

private double area = 1 * 1 * pi;

// circle constructor //
public Circle(double r){
radius = r;
perimeter = 2 * r * pi;
area = r * r * pi;
}


// get radius //
public double getRadius(){
    return radius;
}

// get perimeter
public double getCPerimeter(){
    return perimeter;
}

// get area //
public double getCArea(){
    return area;
}


// set radius //
public void setRadius(double r){
    radius = r;
    perimeter = 2 * radius * pi;
    area = radius * radius * pi;
}


// set perimeter //
public void setCPerimeter(double p){
    perimeter = p;
    radius = perimeter / 2 / pi;
    area = radius * radius * pi;
}


// set area //
public void setCArea(double a){
    area = a;
    radius = Math.sqrt(area) / pi;
    perimeter = radius * 2 * pi;
}







}


