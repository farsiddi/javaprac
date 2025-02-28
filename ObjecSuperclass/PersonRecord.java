package ObjecSuperclass;

/**
 * special type of class designed to model immutable data with minimal boilerplate code.
 * <br>Records class automatically generates the following methods -
 * <ul>
 *   <li><b>Constructor</b>: A constructor that takes the same number of arguments
 *       as the number of properties.</li>
 *   <li><b>Getters</b>: A getter method for each property. The method name will not
 *       have a prefix <code>get</code> as there are no setter methods.</li>
 *   <li><b>equals()</b>: An implementation of the <code>equals()</code> method that
 *       compares the values of the properties.</li>
 *   <li><b>hashCode()</b>: An implementation of the <code>hashCode()</code> method
 *       that uses the values of the properties.</li>
 *   <li><b>toString()</b>: An implementation of the <code>toString()</code> method
 *       that returns a string representation of the object.</li>
 * </ul>
 * <p>Limitations of Records:</p>
 * <ul>
 *   <li>❌ <b>Cannot extend other classes</b> (but can implement interfaces).</li>
 *   <li>❌ <b>Fields are implicitly final</b> (cannot be reassigned).</li>
 *   <li>❌ <b>No setters</b> (immutability).</li>
 * </ul>
 */

public record PersonRecord(String name,
                           int ssnId) {   // final by default and extends is not allowed(no multiple inheritance | can implement interfaces)

    /**
     * Belowe type of constructor is called canonical constructor<br>
     * if you want a custom constructor instead default that comes with the record class
     */
    public PersonRecord(String name, int ssnId) {
        if (name == null || ssnId == 0) {
            throw new IllegalArgumentException("Not good argument");
        }
        this.name = name;
        this.ssnId = ssnId;
    }

// This is a compact constructor
//    public PersonRecord {
//        if (name == null || ssnId == 0) {
//            throw new IllegalArgumentException("Not good argument");
//        }
//    }
}
