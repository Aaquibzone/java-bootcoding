package oops.constructor.ex2;

class A{
        public A(){

        System.out.println( "Constructor A");
        }

        }

class B extends A {

    public B() {

        System.out.println("Constructor B");


    }
}
class C extends B {
    public C() {

        System.out.println("Constructor C");

    }


    public static void main(String[] args) {
        C obj = new C();

    }


}

