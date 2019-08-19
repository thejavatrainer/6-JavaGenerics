/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.parameters;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        addNumbers(li);
        System.out.println(li);
    }
}