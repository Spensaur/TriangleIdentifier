package com.spencer;

/**
 * Created by spank on 9/12/16.
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private String triangleType;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        determineTriangleType();
    }

    public boolean isEquilateral(){
        if(sideA == sideB && sideB == sideC) {
            triangleType = "equilateral";
            return true;
        }
        return false;
    }

    public boolean isIsosceles(){
        if (sideA == sideB || sideB == sideC || sideA == sideC) {
            triangleType = "isosceles";
            return true;
        }
        return false;
    }

    public void determineTriangleType(){
        if(isEquilateral()) return;
        else if(isIsosceles())return;
        else triangleType = "scalene";;
    }

    public void printTriangleType(){
        System.out.println("Triangle Type: " + triangleType);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
