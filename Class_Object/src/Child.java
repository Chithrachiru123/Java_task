// Child Class
class Child extends Parent1 implements Parent2 {
    void displayAllMethods() {
        // Access methods from Parent1
        method1();
        method2();
        method3();
        method4();
        method5();

        // Access methods from Parent2 (interface)
        method6();
        method7();
        method8();
        method9();
        method10();
    }
}

