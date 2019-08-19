/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.why;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void buildListWithoutGenerics() {
        List list = new ArrayList();
        list.add("hello");
        list.add(new Integer(2));
        String s = (String) list.get(0);
    }

    public static void buildListWithGenerics() {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = list.get(0);   // no cast
    }

    public static void main(String[] args) {
        buildListWithoutGenerics();
        buildListWithGenerics();
    }
}
