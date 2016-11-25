package com.github.pellaton.java9.leftpad.impl;

import  com.github.pellaton.java9.leftpad.api.LeftPad;


public class LeftPadImpl implements LeftPad {

  public String padLeft(String input, int targetLength) {
    return String.format("%" + targetLength + "s", input);
  }
}
