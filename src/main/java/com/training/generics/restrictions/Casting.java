/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

import java.util.ArrayList;
import java.util.List;

// Because the Java compiler erases all type parameters in generic code, you cannot verify which parameterized type for a generic type is being used at runtime.
// The runtime does not keep track of type parameters, so it cannot tell the difference between an ArrayList<Integer> and an ArrayList<String>.
public class Casting {
    public static void main(String args[]) {
        List<Integer> li = new ArrayList<>();
        //List<Number>  ln = (List<Number>) li;  // compile-time error
    }
}
