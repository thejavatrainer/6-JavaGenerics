/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.types.box;

public class ChocolateBox<T extends Chocolate> {
    private T object;

    public ChocolateBox(final T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
