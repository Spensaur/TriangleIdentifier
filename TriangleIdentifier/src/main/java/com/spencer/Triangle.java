package com.spencer;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by spank on 9/12/16.
 *
 * Represents a triangle based on the data from its side length.
 */
public class Triangle {
    public enum TriangleType {
        EQUILATERAL,
        ISOSCELES,
        SCALENE;
    }

    private final double sideA;
    private final double sideB;
    private final double sideC;
    public final TriangleType triangleType;

    /**
     * Constructs a triangle in which each parameter is a side of the triangle.
     */
    public Triangle(double sideA, double sideB, double sideC) throws InvalidTriangleSidesException{
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        checkTriangle();
        if(sideA == sideB && sideB == sideC) {
            triangleType = TriangleType.EQUILATERAL;
        }
        else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            triangleType = TriangleType.ISOSCELES;
        }
        else {
            triangleType = TriangleType.SCALENE;
        }
    }

    /**
     * Checks to see if the triangle is valid. If not a InvalidTriangleSidesException is thrown
     */
    public void checkTriangle() throws InvalidTriangleSidesException {
        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideB + sideA || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new InvalidTriangleSidesException(Strings.validTriangleMsg);
        }
    }

    public void printTriangleType(){
        System.out.println("Triangle Type: " + triangleType);
    }

    public TriangleType getTriangleType() {
        return triangleType;
    }
}
