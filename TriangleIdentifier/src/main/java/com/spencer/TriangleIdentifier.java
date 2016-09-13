package com.spencer;

import org.apache.commons.lang3.math.NumberUtils;
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifier {


    public static boolean isValidInput(String[] args){
        return hasThreeArgs(args) && hasValidArgs(args) && isTriangle(args);
    }

    public static boolean hasThreeArgs(String[] args){
        try {
            if (args.length != 3) {
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean hasValidArgs(String[] args){
        try {
            for (String arg : args) {
                if (!NumberUtils.isNumber(arg)) {
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean isTriangle(String[] args){
        try {
            double sideA = Double.parseDouble(args[0]);
            double sideB = Double.parseDouble(args[1]);
            double sideC = Double.parseDouble(args[2]);
            if (sideA >= sideB + sideC) {
                return false;
            }
            if (sideB >= sideA + sideC) {
                return false;
            }
            if (sideC >= sideB + sideA) {
                return false;
            }
            if (sideA <= 0 || sideB <= 0 || sideC <= 0){
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
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
