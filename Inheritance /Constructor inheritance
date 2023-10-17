// use of super Keyword to access the overloaded constructors of base and derived class 
class base {
    base() {
        System.out.println("I am a base class constructor ");
    }

    base(int x) {
        System.out.println("I am a overloaded base class constructor with value of x is : " + x);
    }
}

class Derived extends base {
    Derived() {
        System.out.println("I am a Derived class Construtor ");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a Overloaded Derived class Constructors with value of y is " + y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a Child of Derived class Constructors ");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded Child of Derived Class constructors with value of z is :" + z);
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        ChildOfDerived obj = new ChildOfDerived();
    }
}

OUTPUT:
I am a base class constructor 
I am a Derived class Construtor
I am a Child of Derived class Constructors

                                                            OR
// use of super Keyword to access the overloaded constructors of base and derived class(with passing some value )
class base {
    base() {
        System.out.println("I am a base class constructor ");
    }

    base(int x) {
        System.out.println("I am a overloaded base class constructor with value of x is : " + x);
    }
}

class Derived extends base {
    Derived() {
        System.out.println("I am a Derived class Construtor ");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a Overloaded Derived class Constructors with value of y is " + y);
    }
}

class ChildOfDerived extends Derived {
    ChildOfDerived() {
        System.out.println("I am a Child of Derived class Constructors ");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded Child of Derived Class constructors with value of z is :" + z);
    }
}

public class Constructor_Inheritance {
    public static void main(String[] args) {
        ChildOfDerived obj = new ChildOfDerived(1,2,3);
    }
}

OUTPUT:
I am a overloaded base class constructor with value of x is : 1
I am a Overloaded Derived class Constructors with value of y is 2
I am a overloaded Child of Derived Class constructors with value of z is :3

