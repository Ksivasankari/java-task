//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A{
    public void call1()
    {
        System.out.println("This is class A");
        B b=new B();
        b.call2();
    }
}
class B{
    public void call2()
    {
        System.out.println("This is class B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new A();
        a.call1();
    }
}