/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.inheritance;

public class Inheritance {
    public static void main(final String[] args) {
        // Allowed in java
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // OK

        // It will work
        Box<Number> box = new Box<Number>();
        box.setObject(new Integer(10));   // OK
        box.setObject(new Double(10.1));  // OK

        // What about this ?

        Box<Integer> integersBox = new Box<>(6);
        Box<Double> doubleBox = new Box<>(2.3);
        // boxTest(integersBox);
        //  boxTest(doubleBox);
    }


    public static void boxTest(Box<Number> n) { /* ... */ }
}

class Box<T> {
    private T object;

    public Box() {
    }

    public Box(final T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(final T object) {
        this.object = object;
    }
}