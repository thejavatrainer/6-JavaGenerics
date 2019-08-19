/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.parameters;

public class MultipleBounds {
    public static void main(String[] args) {
        D d = new D();
    }
}

class A {
}

interface B {
}

interface C {
}

class D<T extends A & B & C> {
}

/*
class E<T extends B & A & C> {  // compile-time error
}*/
