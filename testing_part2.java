class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String name = "James";
    System.out.println(name);
    // all increiments
    int myNume = 5;
    myNume = myNume + 1;
    float myFloatNume = 5.99f;
    myFloatNume = myFloatNume + 0.11f;
    //char myLettere = 'D';
    //myLettere = myLettere +'D';
    //boolean myBoole = true;
    //dont know how to change that.
    //myBoole = myBoole true;
    String myTexte = "Hello";
    System.out.println(myTexte);
    /*
    System.out.println(myNume, myFloatNume, myLettere, myBoole, myTexte);
    // add strings
    */
    String addStringOne = "First";
    String addStringTwo = "Second";
      String addStringThree = "Three";
    String finalString = addStringOne + " " + addStringTwo;
    System.out.println(finalString); 
      System.out.println(addStringThree);
    // declaring multiple variables
    int ab = 1, ac = 2, ad = 3, ae = 4; 
    float fone = 0.1f, ftwo = 0.2f;
      //System.out.println(ab, ac, ad, ae);
      ab = ab + 1;
      // because the unused variables are 
      // throwing warnings, displayed as
      // green underlines. 
      // here are the rest.
    ac = ac + 2;
    ad = ad + 3;
    ae = ae + 4;
    fone = fone + 0.1f;
    ftwo = ftwo + 0.1f;
    // these above lines have stopped the warnings.
      // System.out.println(ab,ac,ad,ae);
    // now for data types
    /* these are from w3 schools
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String   
    */
    // these bytes dont work. tons of errors. 
    // byte is -128 to 127
    // byte lowest = -128;
    // byte highest = 127;
    // System.out.println(lowest, highest);
    boolean state = true;
    //boolean stateagain = 1;
    //tried declaring bool as 1 or 0. did not work. 
    System.out.println(state);
    // type casting

  }
}
/*
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
*/
// String name = "John";
// every line of code in java must be in a class, interface
// or enum. 

/* This should be in a new class file
// "NewClass.java" instead of 
// the main.java file.
public class NewClass {
  public static void main(String[] args) {
    int bestint = 10;
    double thedouble = bestint; 

    System.out.println(bestint);
    System.out.println(thedouble);
  }
}
*/
