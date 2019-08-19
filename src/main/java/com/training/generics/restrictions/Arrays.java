/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

//You cannot create arrays of parameterized types.
public class Arrays {
    public static void main(String args[]) {
        //Not allowed
        // List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error

        // Inserting different types into an array
        Object[] strings = new String[2];
        strings[0] = "hi";   // OK
        strings[1] = 100;    // An ArrayStoreException is thrown.
    }
}
