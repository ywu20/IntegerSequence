import java.util.NoSuchElementException;
import java.util.ArrayList;
public class Tester{


  public static void main(String[] args){
    /*
    IntegerSequence a=new Range(30,50);
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

  public static int ERR = 0;
public static boolean DEBUG = true;
public static void main(String[] args) {
    if (args.length > 0 && Boolean.parseBoolean(args[0]) == false) DEBUG = false;
    String test = "";

    test = "IntegerSequence.hasNext()";
    try {
        IntegerSequence r = new Range(10, 15);
        ArrayList<Integer> a = new ArrayList<Integer>();
        while (r.hasNext()) {
            a.add(r.next());
        }
        check(test, a.toString(), "[10, 11, 12, 13, 14, 15]");

    } catch(RuntimeException e) {
        except(test, e);
    }

    test = "IntegerSequence.next()";
    try {
        IntegerSequence r = new Range(10, 15);
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 10; i < 17; i++) {
            a.add(r.next());
        }
        noException(test, "NoSuchElementException");
    } catch(NoSuchElementException e) {

    } catch(RuntimeException e) {
        except(test, e);
    }

    if (ERR == 0) System.out.println("All good!");
    else if (ERR == 1) System.out.println("Uh oh... 1 error found.");
    else System.out.println("Uh oh... " + ERR + " errors found.");
}

public static void check(String test, Object actual, Object expected) {
    if (!actual.equals(expected)) {
        System.out.println("Failure on " + test + ": Expected \"" +
                            expected + "\", got \"" + actual + "\".");
        ERR++;
    }
}

public static void except(String test, RuntimeException e) {
    System.out.println("Failure on " + test + ": RuntimeException");
    if (DEBUG) System.out.println(e.toString());
    ERR++;
}

public static void noException(String test, String expected) {
    System.out.println("Failure on " + test + ": Expected " + expected);
    ERR++;
}

int[]nums = {1,3,5,0,-1,3,9};
IntegerSequence as = new ArraySequence(nums);
System.out.println("ArraySequence(array):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.print("length "+as.length());
    as.reset();
    System.out.println("reset "+as.next());

    IntegerSequence r = new Range(10,20);
    IntegerSequence as2 = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as2.hasNext()){
      System.out.print(as2.next()+", ");
    }

    System.out.println();
    System.out.print("length "+as2.length());
    as2.reset();
    System.out.println("reset "+as2.next());
    */
}
}
