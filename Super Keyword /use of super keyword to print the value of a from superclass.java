class A{
  int a =10;
}
class B extends A{
  int a =20;
  void show(){
    System.out.println(super.a); // this will print the value a as 10(not 20 due to super keyword used in a ) 
  }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
