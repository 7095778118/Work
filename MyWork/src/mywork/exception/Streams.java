import java.util.*; 
import java.util.stream.*; 

public class streamprogram
{ 
public static void main(String args[]) 
{ 
// most used stream methods are map,filter,sorted.


// streams map method
	List<Integer> numbers = Arrays.asList(2,3,4,5,8,1); 

	List<Integer> square = numbers
                            	.stream()
                            	.map(x -> x*x)
                            	.collect(Collectors.toList()); 
    System.out.println("Original List:  "+numbers);
    System.out.println("Squared List:   "+square); 



// streams filter method

List<String> cars = 
				Arrays.asList("Bmw","mazda","toyata","suzuki","benz","audi"); 
				
List<String> resultcars = cars
                           .stream()
                           .filter(carname -> carname.toLowerCase().startsWith("b"))
                           .collect(Collectors.toList()); 
    System.out.println("\n\nCars list:  "+cars);
	System.out.println("Car name starting with B    :"+resultcars); 



// streams sorted method
List<Integer> sortednumbers = numbers
	                                   .stream()
	                                   .sorted()
	                                   .collect(Collectors.toList()); 
	                                   
    System.out.println("\n\nOriginal List:  "+numbers);                        
    System.out.println("Sorted  List:  "+sortednumbers);                        
	                                   

System.out.println("\n\nPrinting numbers list using the for each method\n");
numbers
.stream()
.map(x->x*x)
.forEach(y->System.out.println(y)); 

 
} 
} 
