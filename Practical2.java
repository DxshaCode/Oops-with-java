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
//Multilevel inheritence
class person{
      void p(){
            System.out.println("i am a person");
      }
}

class Employee 
      extends person{
            void e(){
                  System.out.println("i am an employee");
            }
      }
      
class Manager
      extends Employee{
            void m(){
                  System.out.println("i am manager");
            }
      }
public class Main
{
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.p();
		m1.e();
		m1.m();
	}
}

//Hierarchical Inheritance
class Shape{
      void s(){
            System.out.println("its a shape");
      }
}

class Circle
      extends Shape{
            
            void c(){
                  System.out.println("its a circle");
            }
      
}

class Rectangle
      extends Shape{
            
            void r(){
                  System.out.println("its a rectangle");
            }
      
}
public class Main
{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.s();
		r1.r();
		
		Circle c1=new Circle();
		c1.s();
		c1.c();
	}
}
