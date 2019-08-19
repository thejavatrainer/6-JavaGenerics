/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.types.box;

public class Box<T> {
    private T object;

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
