package com.spencer;

import org.apache.commons.lang3.math.NumberUtils;
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifier {

    public static boolean isValidInput(String[] args){
        return hasThreeArgs(args) && hasValidArgs(args);
    }

    /**
     *  Returns true if there are three elements in the array.
     *  @Params args the arguments that are provided at runtime
     */
    public static boolean hasThreeArgs(String[] args){
        try {
            if (args.length != 3) {
                System.out.println(Strings.threeArgsMsg);
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(Strings.threeArgsMsg);
            return false;
        }
        return true;
    }

    /**
     * Returns true if all of the elements are numbers.
     * @Params args the arguments that are provided at runtime
     */
    public static boolean hasValidArgs(String[] args){
        try {
            for (String arg : args) {
                if (!NumberUtils.isNumber(arg)) {
                    System.out.println(Strings.validArgsMsg);
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(Strings.validArgsMsg);
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        if(isValidInput(args)){
            try {
                Triangle triangle = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
                triangle.printTriangleType();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
