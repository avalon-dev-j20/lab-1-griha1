/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.j20.labs.core;

/**
 *
 * @author hp
 */
public class FibonacciArrayFactory implements Factory<int[], Integer> {

    @Override
    public int[] getInstance(Integer length) {
        int[] array = new int[length];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i ++){
            array[i] = array[i - 1] + array[i - 2];
    }
        return array;
    }
}
