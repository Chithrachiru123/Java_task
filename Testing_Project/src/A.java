interface A {
void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
        public static void main (String[]args){
            C obj = new C();
            obj.methodA();
            obj.methodB();
        }
    }
