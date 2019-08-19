/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.training.generics.restrictions;

import java.io.File;

// A generic class cannot extend the Throwable class directly or indirectly.
// A method cannot catch an instance of a type parameter.
// You can, however, use a type parameter in a throws clause.
public class Exceptions {

/*    public static <T extends Exception, J> void execute(List<J> jobs) {
        try {
            for (J job : jobs) {
                // ...
            }
        } catch (T e) {   // compile-time error
            // ...
        }
    }*/
}

// Extends Throwable indirectly
//class MathException<T> extends Exception { /* ... */ }    // compile-time error

// Extends Throwable directly
//class QueueFullException<T> extends Throwable { /* ... */ // compile-time error

class Parser<T extends Exception> {
    public void parse(File file) throws T {     // OK
        // ...
    }
}