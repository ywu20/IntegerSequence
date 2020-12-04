import java.util.NoSuchElementException;
public class Tester{
  public static void main(String[] args){
    Range a=new Range(30,50);
    System.out.println(a);
    System.out.println(a.length());
    System.out.println(a.hasNext());
    System.out.println(a.next());
    System.out.println(a);
    a.reset();
    System.out.println(a);
    Range b=new Range(1,2);
    b.next();b.next();
    try{
      b.next();
      System.out.println(b);
    }catch(NoSuchElementException e){
      System.out.println("catched exception");
    }
  }
}
