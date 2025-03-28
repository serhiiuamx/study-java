package com.custom.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaClass {

    interface StringFunction {
        void doSmth(String str);
    }

    interface SomeFunc<T> {
        T func(T t);
    }

    public void doSomething(NumericFunc nFunc) {
        nFunc.func(4);
    }

    public void start() {
        StringFunction sf = (x) -> System.out.println(x);
        sf.doSmth("abc");
        // new StringFunction((y) -> System.out.println(y)).doSmth("qwerty");
        new Thread(() -> System.out.println("Hello, World!")).start();
        List<String> groceryList = Arrays.asList("apple", "cherry");
        groceryList.forEach(x -> System.out.printf("%s,", x));
        System.out.println();

        NumericFunc nf = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.printf("result=%d\n", nf.func(5));

        SomeFunc<String> strFunc = (x) -> {
            return x + "123";
        };
        System.out.println(strFunc.func("aaa"));

        IncClass ic = new IncClass();
        System.out.printf("before ic.n=%d\n", ic.n);
        doSomething(ic::inc);
        System.out.printf("after ic.n=%d\n", ic.n);

        // Constructor References

        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        CustFunc<Integer> constrRef = CustClass::new;
        CustClass<Integer> mc = constrRef.func(101);
        System.out.println("val in mc is " + mc.getVal());

        // Constructor reference syntax that is used for arrays
        // type[]::new

        // interface MyArrayCreator<T> {
        // T func(int n);
        // }
        // MyArrayCreator<MyClass[]> mcArrayCons = MyClass[]::new;
        // MyClass[] a = mcArrayCons.func(2);
        // a[0] = new MyClass(1);
        // a[1] = new MyClass(2);
    }
}
