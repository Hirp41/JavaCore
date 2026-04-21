package tops.core;

class F1 {
    final int a;   // final variable

    public F1() {
        a = 10;    // must be initialized once
    }

    // final method
    final void display() {
        System.out.println("Final method in F1");
    }

    void show() {
        System.out.println("Value of a = " + a);
    }
}

class F2 extends F1 {
    void show() {
        System.out.println("Overridden show() in F2");
    }

    // ❌ Not allowed (will give error)
    // void display() {
    //     System.out.println("Trying to override final method");
    // }
}

// final class (cannot be inherited)
final class F3 {
    void msg() {
        System.out.println("Final class example");
    }
}

// ❌ Not allowed
// class F4 extends F3 {}

public class FinalKeyword {
    public static void main(String[] args) {
        F2 obj = new F2();
        obj.show();
        obj.display();

        F3 obj2 = new F3();
        obj2.msg();
    }
}