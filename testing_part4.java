class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //math

    Math.max(5,10);
    Math.min(10,20);
    Math.sqrt(50); // can square root any no
    Math.abs(123); //absoulte value of no

    //trying something
    System.out.println(Math.random());

    //can try to print with math lines
    System.out.println(Math.max(10,11));

    // try to put in variables
    int high = 5;
    int low = 6;
    System.out.println(Math.max(high,low));
    // line above works fine with variables

   // print a random in range
   int specificrandom = (int)(Math.random() * 501); // randomnumber between 0 and 500
   System.out.println(specificrandom);
  

  }
}