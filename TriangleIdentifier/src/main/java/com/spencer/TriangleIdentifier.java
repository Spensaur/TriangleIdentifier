package com.spencer;

import org.apache.commons.lang3.math.NumberUtils;
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifier {

    public static final String threeArgsMsg = "Arguments are invalid. There must be exactly three arguments.";
    public static final String validArgsMsg = "Arguments are invalid.";
    public static final String validTriangleMsg = "Arguments are invalid. Not a valid triangle.";

    public static boolean isValidInput(String[] args){
        return hasThreeArgs(args) && hasValidArgs(args) && isTriangle(args);
    }

    /* Returns true if there are three elements in the array. */
    public static boolean hasThreeArgs(String[] args){
        try {
            if (args.length != 3) {
                System.out.println(threeArgsMsg);
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(threeArgsMsg);
            return false;
        }
        return true;
    }

    /* Returns true if all of the elements are numbers. */
    public static boolean hasValidArgs(String[] args){
        try {
            for (String arg : args) {
                if (!NumberUtils.isNumber(arg)) {
                    System.out.println(validArgsMsg);
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(validArgsMsg);
            return false;
        }
        return true;
    }

    /* Returns true if the elements in the array can form a valid triangle. */
    public static boolean isTriangle(String[] args){
        try {
            double sideA = Double.parseDouble(args[0]);
            double sideB = Double.parseDouble(args[1]);
            double sideC = Double.parseDouble(args[2]);
            if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideB + sideA || sideA <= 0 || sideB <= 0 || sideC <= 0) {
                System.out.println(validTriangleMsg);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(validTriangleMsg);
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        if(isValidInput(args)){
            Triangle triangle = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
            triangle.printTriangleType();
        }
    }
}
