
class Student{
    int roll_no;
    String name;
    int sub1;
    int sub2;
    int sub3;
    public Student(){
        this.roll_no=0;
        this.name="unkown";
        this.sub1=0;
        this.sub2=0;
        this.sub3=0;
    }
    public Student(int roll_no,String name,int sub1,int sub2,int sub3){
        this.roll_no=roll_no;
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
    public void TotalMarks(){
        float result=this.sub1 + this.sub2+this.sub3;
        System.out.println("result:" + result);
        float percentage=result/3;
        System.out.println("percentage:" + percentage);
    }
    
    void display(){
        System.out.println(this.roll_no);
        System.out.println(this.name);
        System.out.println(this.sub1);
        System.out.println(this.sub2);
        System.out.println(this.sub3);
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Student s1=new Student(58,"diksha",98,76,88);
		s1.display();
		s1.TotalMarks();
		
		Student s2=new Student(48,"bhoomi",88,87,67);
		s2.display();
		s2.TotalMarks();
		
		Student s3=new Student(65,"garv",88,86,67);
		s3.display();
		s3.TotalMarks();
		
	}
}
