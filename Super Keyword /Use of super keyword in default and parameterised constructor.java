class A{
   A(){
    System.out.println(" Hello Viewer kaise ho"); 
  }
}
class B extends A{
  
  B(){
    // be default java make super keyword here (in case of default constructor )
    System.out.println(" Hello Learner kaise ho"); 
  }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}
