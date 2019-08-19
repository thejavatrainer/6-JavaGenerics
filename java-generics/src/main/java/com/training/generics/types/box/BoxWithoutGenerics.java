/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.types.box;

public class BoxWithoutGenerics {
    private Object object;

    public BoxWithoutGenerics(final Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(final Object object) {
        this.object = object;
    }
}
