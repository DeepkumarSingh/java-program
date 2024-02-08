abstract class Bird{
    public abstract void fly();
    public abstract void makeSound();
}
class Eagle extends Bird{
    @Override
    public void fly(){
        System.out.println("Eagle will flie like a Tremendous ");
    }
    public void makeSound(){
        System.out.println("Eagle will produce large noise like chiooo");
    }
}
class Hawk extends Bird{
    @Override 
    public void fly(){
        System.out.println("Hawk will fly similar to the Eagle ");
    }
    @Override 
    public void makeSound(){
        System.out.println("Hawk will produce small noise as compare to the Eagle ");
    }
}
public class AbstractEx1 {
    public static void main(String[] args) {
        Eagle eagle =new Eagle();
        Hawk hawk = new Hawk();

        System.out.println("Eagle ");
        eagle.fly();
        eagle.makeSound();

        System.out.println("Hawk");
        hawk.fly();
        hawk.makeSound();
    }
}
