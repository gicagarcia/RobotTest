package org.example;

import java.util.function.IntPredicate;

public class Robot {

    public Object colisionPoint(Integer x1, Integer x2, Integer a, Integer f, Integer d){
        if(d > 8 || d < 0){
            return "Error";
        }
        return new Integer[]{1, 2};
    }

    public Integer recalculateAngle(Integer a, Integer f){
        return (a+f) - 90;
    }

}
