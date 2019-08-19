/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.types.multiple;

import com.training.generics.types.box.Box;

public class PairExample {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        // Also allowed
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(10));
    }
}
