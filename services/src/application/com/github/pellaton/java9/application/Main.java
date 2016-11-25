package com.github.pellaton.java9.application;

import com.github.pellaton.java9.leftpad.api.LeftPad;
// import com.github.pellaton.java9.leftpad.impl.LeftPadImpl;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

  public static void main(String[] argv) {

    /**
     * Public classes of packages not explcitly exported are invisible to other packages.
     * As a proof, uncomment the following line and the corresponding import and then look
     * at the compiler error.
     */
    // System.out.println(new LeftPadImpl().padLeft("TechTalk", 20));

    System.out.println(lookupLeftPad().padLeft("TechTalk", 20));
  }

  /**
   * The service loader mechanism is basically unchanged to what we know from Java 1.6.
   * This means that we might get zero, one or many implementations of a service at runtime.
   */
  private static LeftPad lookupLeftPad() {
    ServiceLoader<LeftPad> serviceLoader = ServiceLoader.load(LeftPad.class);
    Iterator<LeftPad> serviceIterator = serviceLoader.iterator();
    if (!serviceIterator.hasNext()) {
      throw new RuntimeException("Unable to locate a LeftPad service.");
    }
    return serviceIterator.next();
  }
}
