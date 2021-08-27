package com.feature;

interface shape {
    String getShapeName();
}

class triangle implements shape {
    public String getShapeName() {return "Triangle";}
    public static int getCornerCount(){return 3;}
}
class square implements shape {
    public String getShapeName() {return "Square";}
    public static int getCornerCount(){return 4;}
}

public class LambdaExpression {
    public static void main(String args[]) {
        shape shape1 = new square();
        shape shape2 = new square();
        triangle t= (triangle) shape1;
        square s = (square)shape2;
        System.out.print(String.format("%s %d %s %d", s.getShapeName(), s.getCornerCount(), t.getShapeName(), t.getCornerCount()));

    }
    /*public static void main(String args[]) {
        LambdaExpression lmb = new LambdaExpression();
        MathOperation sum = (int a, int b) -> a+b;
        System.out.println(lmb.operate(3, 5, sum));

        StringOperations concatStr = (String str1, String str2) -> str1.concat(str2) ;
        StringOperations subStr = (String str1, String str2) -> str1.substring(str1.indexOf(str2)) ;
        System.out.println(concatStr.strOperation("hi" , "zunair"));
        System.out.println(subStr.strOperation("hizunair" , "zunair"));
    }
*/

   /* public static void main(String[] args){
        String upperCase ="AB";
        String lowerCase ="ab";
        lowerCase.replace("a", "A").replace("b", "B");
        lowerCase = new StringBuilder(lowerCase).substring(1);
                upperCase = upperCase.replaceFirst("A", "a")+lowerCase.charAt(0);
        System.out.println(upperCase);
    }*//*public static void main(String args[]) {
        LambdaExpression lmb = new LambdaExpression();
        MathOperation sum = (int a, int b) -> a+b;
        System.out.println(lmb.operate(3, 5, sum));

        StringOperations concatStr = (String str1, String str2) -> str1.concat(str2) ;
        StringOperations subStr = (String str1, String str2) -> str1.substring(str1.indexOf(str2)) ;
        System.out.println(concatStr.strOperation("hi" , "zunair"));
        System.out.println(subStr.strOperation("hizunair" , "zunair"));
    }
*/
    /*interface MathOperation {
        int operation(int a, int b);
    }

    interface StringOperations {
        String strOperation(String str1, String str2);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }*/
}
