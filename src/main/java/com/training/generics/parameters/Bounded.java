/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.parameters;

public class Bounded {

    public static void main(String[] args) {
        Box<Integer> integerBounded = new Box<Integer>();
        integerBounded.set(new Integer(10));
        //  integerBox.inspect("some text"); // error: this is still String!
    }
}

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}