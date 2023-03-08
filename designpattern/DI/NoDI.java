package DI;

import java.util.*;

class BackendDeveloper {
    public void writeJava() {
        System.out.println("자바가 좋아 ~");
    }
}

class FrontendDeveloper {
    public void writeJavascript() {
        System.out.println("자바스크립트가 좋아");
    }
}

public class NoDI {
    private final BackendDeveloper backendDeveloper;
    private final FrontendDeveloper frontendDeveloper;
    
    public NoDI(BackendDeveloper backendDeveloper, 
                   FrontendDeveloper frontendDeveloper) {
                   
        this.backendDeveloper = backendDeveloper;
        this.frontendDeveloper = frontendDeveloper;
    }
    
    public void implement() {
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavascript();
    }
    
    public static void main(String[] args) {
    	NoDI a = new NoDI(new BackendDeveloper(),
                                new FrontendDeveloper());
        a.implement();
    }
}
