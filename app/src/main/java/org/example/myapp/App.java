package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.utils.Utils;

/**
 * 이 클래스는 한밭대학교 특강 실습을 위한 첫 번째 클래스입니다.<br>
 * <code>App</code> 클래스!
 */
public class App {

  /**
   * 프로그램의 진입점(entry point)메서드 입니다. 콘솔에 "Hello" 메시지를 출력합니다.
   *
   * @param args 명령행 인수 배열 (이 프로그램에서는 사용되지 않음)
   */
  public static void main(String[] args) {
    Utils.printMessage("Hello!");
    String message = Joiner.on(", ").join("hello", "world");
    System.out.println(message);
  }
}
