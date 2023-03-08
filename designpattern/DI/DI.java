package DI;

import java.util.*;

//의존성 주입자 -> 새로운 개발자를 추가하기에 용이하다
//class IOSDeveloper implements Developer {}
interface Developer {   
 void develop();
}

class BackEndDeveloper implements Developer {
 @Override
 public void develop() {
     writeJava();
 }
 
 public void writeJava() {
     System.out.println("자바가 좋아 ~");
 }
}

class FrontEndDeveloper implements Developer {
 @Override
 public void develop() {
     writeJavascript();
 }
 // public void writeJavascriptGorani() {}
 // 메소드 이름이 변경되어도 클래스 내부에서만 수정되면 된다
 // public void develop() { writeJavascriptGorani(); }
 
 public void writeJavascript() {
     System.out.println("자바스크립트가 좋아");
 }
}

public class DI {
 private final List<Developer> developers;
 
 public DI(List<Developer> developers) {
     this.developers = developers;
 }
 
 public void implement() {
     developers.forEach(Developer::develop);
 }
 
 public static void main(String[] args) {
     List<Developer> dev = new ArrayList<>();
     dev.add(new BackEndDeveloper());
     dev.add(new FrontEndDeveloper());
     DI a = new DI(dev);
     a.implement();
 }
}
