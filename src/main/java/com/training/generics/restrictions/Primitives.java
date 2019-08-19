/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

// When creating a Pair object, you cannot substitute a primitive type for the type parameter K or V:
public class Primitives {
    public static void main(String args[]) {
        //Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
    }
}

class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // ...
}
