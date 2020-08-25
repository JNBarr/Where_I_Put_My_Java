class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //int x = 10;
    //x += 5;

    int s = 5;
    s += 1; // operator
    System.out.println(s);

    // strings
    String motto = "Howdy";
    motto = motto + "Dowdy";
    System.out.println(motto);
    
    //string lengths
    String text = "BongoWongo123";
    System.out.println("String length is approx: " + text.length());
    // calls length function for string

    //string upper/lower case
    String foo = "FooAaaR";
    foo.toLowerCase();
    System.out.println(foo);
    // hasnt shifted.
    String Moo = "CowGoesMow";
    System.out.println(Moo.toUpperCase());
    // this one works on single line

    //locate character in string
    String Boo = "The ghost was wondering around a house and said 'Boo!'";
    System.out.println(Boo.indexOf("Boo!"));

  }
}

// narrow type casting


// this would be in a new .java file
/*
public class typeClass {
  public static void main(String[] args) {
    double theDouble = 8.67;
    int theInt = (int) theDouble; // this is a manual type cast from double to int
      System.out.println(theDouble);
      // outputs original value
        System.out.println(theInt);
        //outputs new value
  }
}
*/
