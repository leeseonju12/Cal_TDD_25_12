package org.example;

public class Calc {

    public static int run(String exp) {

        System.out.println("exp1 : " + exp);

        exp = exp.replace("- ", "+ -");

        System.out.println("exp2 : " + exp);

        boolean needToPlus = exp.contains("+");
        boolean needTomultiply = exp.contains("*");

        if (needToPlus){
            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (int i = 0; i < bits.length; i++){
                sum += Integer.parseInt(bits[i]);
            }
            return sum;
        }

        if (needTomultiply){
            String[] bits = exp.split(" \\* ");

            int mult = 1;

            for (int i = 0; i < bits.length; i++){
                mult *= Integer.parseInt(bits[i]);
            }
            return mult;
        }
        throw new RuntimeException("해석 불가 : 올바른 계산식이 아님");
    }
}