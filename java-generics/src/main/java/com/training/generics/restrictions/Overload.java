/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

import java.util.Set;

//A class cannot have two overloaded methods that will have the same signature after type erasure.
public class Overload {
    public void print(Set<String> strSet) {
    }
/*
    public void print(Set<Integer> intSet) {
    }*/
}
