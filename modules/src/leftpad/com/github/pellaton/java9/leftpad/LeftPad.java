package com.github.pellaton.java9.leftpad;

/**
 * As we learned from npm every software needs a left pad library, so here it is.
 */
public class LeftPad {

  public static String padLeft(String input, int targetLength) {
    return String.format("%" + targetLength + "s", input);
  }
}
