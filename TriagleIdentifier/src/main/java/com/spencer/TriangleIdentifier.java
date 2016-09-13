package com.spencer;

import org.apache.commons.lang3.StringUtils;
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifier {


    public static boolean isEquilateral(Double sideA, Double sideB, Double sideC){
        if(sideA == sideB && sideB == sideC) {
            return true;
        }
        return false;
    }

    public static boolean isIsosceles(Double sideA, Double sideB, Double sideC){
        if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return true;
        }
        return false;
    }

    public static boolean isScalene(){
        return true;
    }

    public static boolean isValidInput(String[] args){
        return hasThreeArgs(args) && hasValidArgs(args) &&
                isTriangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
    }

    public static boolean hasThreeArgs(String[] args){
        try {
            if (args.length != 3) {
                throw new InvalidInputException();
            }
        } catch (InvalidInputException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean hasValidArgs(String[] args){
        try {
            for(String arg: args){
                if(!StringUtils.isNumeric(arg)){
                    throw  new InvalidInputException();
                }
            }
        } catch (InvalidInputException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean isTriangle(Double sideA, Double sideB, Double sideC){
        try {
            if (sideA >= sideB + sideC) {
                throw new InvalidInputException();
            }
            if (sideB >= sideA + sideC) {
                throw new InvalidInputException();
            }
            if (sideC >= sideB + sideA) {
                throw new InvalidInputException();
            }
        } catch (InvalidInputException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isValidInput(args));
    }
}
