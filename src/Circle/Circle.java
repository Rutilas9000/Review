/**
 * @Class: Circle
 * @Author: Savion Plater
 * @Course: ITEC 2150 - 05, Fall 2023
 * @Written: August 19, 2023
 * Description: Create a class `Circle` with a field
 * `radius` and a method `calculateArea()` that returns the area of the circle.
 */
class Circle {
    private double radius;
    private double area;

    public double calculateArea(radius){
        area = Math.PI * radius * radius;
        return area;
    }
}
