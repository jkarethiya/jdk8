/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.accessspecifier.defaultt;

/**
 *
 * @author Jitendra
 */
public class DefaultTest {
    
    DefaultX x = new DefaultX("Default Access Specifier");
    DefaultY y = new DefaultY(); // DefaultY is not public in com.jkpatel.j2se.core.accessspecifier.defaultt; cannot be accessed from outside package

    
}
