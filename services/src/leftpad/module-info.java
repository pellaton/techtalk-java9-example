module leftpad {

  exports com.github.pellaton.java9.leftpad.api;
  
  provides com.github.pellaton.java9.leftpad.api.LeftPad
      with com.github.pellaton.java9.leftpad.impl.LeftPadImpl;
}
