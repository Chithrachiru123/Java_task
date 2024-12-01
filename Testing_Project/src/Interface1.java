//Group Task: * 5 interfaces * Need to implement in the single class
//Each interface 3 methods in it.
interface Interface1 {
    void method1A();
    void method1B();
    void method1C();
}

interface Interface2 {
    void method2A();
    void method2B();
    void method2C();
}

interface Interface3 {
    void method3A();
    void method3B();
    void method3C();
}

interface Interface4 {
    void method4A();
    void method4B();
    void method4C();
}

interface Interface5 {
    void method5A();
    void method5B();
    void method5C();
}

// Implement all interfaces in a single class
class MultiInterfaceImplementation implements Interface1, Interface2, Interface3, Interface4, Interface5 {

    // Interface1 methods
    public void method1A() {
        System.out.println("Interface1 - Method1A");
    }

    public void method1B() {
        System.out.println("Interface1 - Method1B");
    }

    public void method1C() {
        System.out.println("Interface1 - Method1C");
    }

    // Interface2 methods
    public void method2A() {
        System.out.println("Interface2 - Method2A");
    }

    public void method2B() {
        System.out.println("Interface2 - Method2B");
    }

    public void method2C() {
        System.out.println("Interface2 - Method2C");
    }

    // Interface3 methods
    public void method3A() {
        System.out.println("Interface3 - Method3A");
    }

    public void method3B() {
        System.out.println("Interface3 - Method3B");
    }

    public void method3C() {
        System.out.println("Interface3 - Method3C");
    }

    // Interface4 methods
    public void method4A() {
        System.out.println("Interface4 - Method4A");
    }

    public void method4B() {
        System.out.println("Interface4 - Method4B");
    }

    public void method4C() {
        System.out.println("Interface4 - Method4C");
    }

    // Interface5 methods
    public void method5A() {
        System.out.println("Interface5 - Method5A");
    }

    public void method5B() {
        System.out.println("Interface5 - Method5B");
    }

    public void method5C() {
        System.out.println("Interface5 - Method5C");
    }

    public static void main(String[] args) {
        MultiInterfaceImplementation obj = new MultiInterfaceImplementation();

        // Call some methods to test
        obj.method1A();
        obj.method2B();
        obj.method3C();
        obj.method4A();
        obj.method5B();
    }
}