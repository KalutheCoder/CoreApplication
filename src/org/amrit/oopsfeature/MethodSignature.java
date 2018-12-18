package org.amrit.oopsfeature;

/**
 * Created by Amrit - Ojha on 12/16/2018.
 */

/**
 * In java, method signature consists of name of the method followed by arguments type.
 * Example:
 * public void methodOne(int i, float f);
 * methodOne(int i, float f);
 * <p>
 * In java, return type is not part of the method signature.
 * Compiler will use method signature while resoling method calls.
 */
public class MethodSignature {

    public void methodOne() {

    }

    public int method() {
        return 10;
    }

    /**
     * Note: if both method have same name then we will get C.E. methodOne() is already defined in MethodSignature class.
     */
}
