package org.example.method.references;

import java.util.function.BiFunction;
class Arithmetic3{
    public int add(int a, int b){
        return a+b;
    }
}
public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder = new Arithmetic3()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}  