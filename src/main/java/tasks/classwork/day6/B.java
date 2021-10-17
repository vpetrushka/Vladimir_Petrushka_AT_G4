package tasks.classwork.day6;

public class B {

    public static void main(String[] args) {

        A c = new A(){
            @Override
            public int foo(int x) {
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }
        };

        A a = new C();
        a.foo(5);

        method(a, 3);

    }

    public static void method(A a, int z) {
        a.foo(z);
    }
}
