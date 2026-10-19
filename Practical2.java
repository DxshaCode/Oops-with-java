// Single inheritence
class Vehicle{
    void Start(){
        System.out.println("vehicle Starts");
    }
}

class Car 
        extends Vehicle{
            void run(){
                System.out.println("Car is running");
            }
        }
public class Main
{
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Car c1=new Car();
		
		v1.Start();
		c1.Start();
		c1.run();
	}
}
