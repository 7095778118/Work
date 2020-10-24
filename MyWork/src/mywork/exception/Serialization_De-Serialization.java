
// Java code for serialization and De-serialization of a Java object 
import java.io.*;

class Car implements java.io.Serializable {
    public String car_brand;
    public String car_model_name;
    public int car_fuel_capacity;

    // Default constructor
    public Car(String car_brand, String car_model_name, int car_fuel_capacity) {
        this.car_brand = car_brand;
        this.car_model_name = car_model_name;
        this.car_fuel_capacity = car_fuel_capacity;
    }
}

class test {
    public static void main(String[] args) {
        Car Audi_object = new Car("Audi","A6",73);
        String filename = "./test.txt";

        // Serialization is storing an object with its data and methods for later use without actually creating it over and over,
        // this is preferrable when the time to de-serialize is less than time to generate a new object from a class.
        try {
            // Saving the serialized object in a text file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(Audi_object);
            
            // Exiting I/O
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch (IOException ex) {
            System.out.println("IOException raised while implementing serialization");
            ex.printStackTrace();
        }
        
        System.out.println("\nImplementing De-serialization on Car object\n");
        Car Car_object;
        // De-serialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // reading the data in text file and reconstructing the object
            Car_object = (Car) in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            // Printing the data of car object that is deserialized
            System.out.println("Car Brand is: " + Car_object.car_brand);
            System.out.println("Car Model name is: " + Car_object.car_model_name);
            System.out.println("Car Fuel capacity is: " + Car_object.car_fuel_capacity);
        }
        catch (IOException ex) {
            System.out.println("IOException raised while implementing De-serialization");
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
// Output
/*
Object has been serialized

Implementing De-serialization on Car object

Object has been deserialized 
Car Brand is: Audi
Car Model name is: A6
Car Fuel capacity is: 73
*/
