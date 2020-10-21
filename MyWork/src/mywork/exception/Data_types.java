
public class MyClass {
  public static void main(String[] args) {
      
    System.out.println("Data types are of two groups");
    System.out.println("1. Primitive");
    System.out.println("2. Non-Primitive");

    // Primitive Types
    byte b = 127;
    short s = 32760;
    int i = 2345678;              
    long l = 234567891010L;
    float f = 5.92349F;
    double d = 6.838483949492D;
    
    // single character
    char ch = 'D';
    boolean bool = true;
    
    
    // Non-Primitive Types
    String myText = "Hello";
    // array of strings
    String[] cars = {"BMW","Ford","Volvo"};
    
    System.out.println("Primitive");
    System.out.println("Byte value:"+b);
    System.out.println("Short value:"+s);
    System.out.println("Integer value:"+i);
    System.out.println("Long value:"+l);
    System.out.println("Float value:"+f);
    System.out.println("Double value:"+f);
    System.out.println("Character :"+ch);
    System.out.println("bool :"+bool);
    
    System.out.println("\n\n\n Non Primitive");
    System.out.println("String Text :"+myText);
    
    System.out.println("\n\n These are the array of cars");
    for (String car : cars){
        System.out.println(car);
    }


  }
}
