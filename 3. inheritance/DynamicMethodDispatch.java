class Super {
    public void meth1() {
        System.out.println("Super Meth1");
    }

    public void meth2() {
        System.out.println("Super Meth2");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub Meth2");
    }

    public void meth3() {
        System.out.println("Sub Meth3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super sup = new Sub();
        // Creating a reference of Super class and creating object of Sub class and then
        // calling the overriden method from Sub class is known as Dynamic method
        // dispatch.

        // sup.meth1();
        sup.meth2();
        sup.meth1();

    }
}