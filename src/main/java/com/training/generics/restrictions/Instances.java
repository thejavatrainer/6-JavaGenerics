/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

import java.util.List;

//You cannot create an instance of a type parameter. For example, the following code causes a compile-time error.
// As a workaround, you can create an object of a type parameter through reflection.
public class Instances {

/*    public static <E> void append(List<E> list) {
        E elem = new E();  // compile-time error
        list.add(elem);
    }*/

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }
}
