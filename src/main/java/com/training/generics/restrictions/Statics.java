/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

//A class's static field is a class-level variable shared by all non-static objects of the class. Hence, static fields of type parameters are not allowed
public class Statics<T> {
    public static void main(String args[]) {
        MobileDevice<Smartphone> phone = new MobileDevice<>();
        MobileDevice<Pager> pager = new MobileDevice<>();
        MobileDevice<TabletPC> pc = new MobileDevice<>();
    }
}

class MobileDevice<T> {
    //private static T os;
    private T os;
    // ...
}

class Smartphone {
}

class Pager {
}

class TabletPC {
}