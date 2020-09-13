class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    /* here is a switch statement that wont work, because no selection apperently works in java  */
    int day = 1;
    switch (day) {
      case 1:
      System.out.println("Today is the first");
      break;
      case 2:
      System.out.println("Today is the second");
      break;
    default:
    System.out.println("Java sucks.");
    }
  }
}

// okay maybe that worked, but the 
// syntax had to be perfect because
// it was error central. 