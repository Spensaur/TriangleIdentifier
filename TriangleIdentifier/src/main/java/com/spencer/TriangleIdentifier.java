package com.spencer;

import org.apache.commons.lang3.math.NumberUtils;
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifier {

    public static boolean isValidInput(String[] args) throws InvalidArgumentsException{
        return hasThreeArgs(args) && hasValidArgs(args);
    }

    /**
     *  Returns true if there are three elements in the array.
     *  @Params args the arguments that are provided at runtime
     */
    public static boolean hasThreeArgs(String[] args) throws InvalidArgumentsException{
        if (args.length != 3) {
            throw new InvalidArgumentsException(Strings.threeArgsMsg);
            }
        return true;
    }

    /**
     * Returns true if all of the elements are numbers.
     * @Params args the arguments that are provided at runtime
     */
    public static boolean hasValidArgs(String[] args) throws InvalidArgumentsException{
        for (String arg : args) {
            if (!NumberUtils.isNumber(arg)) {
                throw new InvalidArgumentsException(Strings.validArgsMsg);
            }
        }
        return true;
    }

    public static void main(String[] args){
        try {
            if (isValidInput(args)) {
                Double sideA = Double.parseDouble(args[0]);
                Double sideB = Double.parseDouble(args[1]);
                Double sideC = Double.parseDouble(args[2]);
                if (Double.isInfinite(sideA) || Double.isInfinite(sideB) || Double.isInfinite(sideC)) {
                    throw new InvalidArgumentsException("One or more of the sides have a length that is too long");
                }
                try {
                    Triangle triangle = new Triangle(sideA, sideB, sideC);
                    triangle.printTriangleType();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
