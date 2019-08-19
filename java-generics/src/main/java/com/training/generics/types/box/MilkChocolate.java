/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.types.box;

public class MilkChocolate extends Chocolate {
    private int milkContent;

    public MilkChocolate(final String name, final int size, final int milkContent) {
        super(name, size);
        this.milkContent = milkContent;
    }

    public int getMilkContent() {
        return milkContent;
    }

    public void setMilkContent(final int milkContent) {
        this.milkContent = milkContent;
    }
}
