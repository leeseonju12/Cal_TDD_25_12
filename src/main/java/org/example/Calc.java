package org.example;

public class Calc {

    public static int run(String exp) {

//        if (exp.equals("2 + 1")) {
//            return 3;
//        }
//        else if (exp.equals("2 + 2")) {
//            return 4;
//        }
//        return 2;
        // 만약 더하기라면 + 로직을 실행하고 아니라면 - 로직을 실행하도록
        String[] bits = null;

        // 사칙연산 판별 조건문
        if (exp.contains("+")) {
            bits = exp.split(" \\+ ");
        }

        else if (exp.contains("-")) {
            bits = exp.split(" - ");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        // 값 반환 조건문
        if (exp.contains("+")) {
            return a + b;
        }
        else if (exp.contains("-")) {
            return a - b;
        }


        return 0;
    }
}
