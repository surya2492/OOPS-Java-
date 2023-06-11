abstract class Member
{
    private String  name;
   abstract void welcomeMessage();
   void print123()
   {
    System.out.println("My name is "+name)
   }
         
}
class Student extends Member{
    void welcomeMessage()
    {
        System.out.println("Hello Students");
    }
    
}
class Teacher extends Member{
    void welcomeMessage()
    {
        System.out.println("Hi Students Iam the Teacher ");
    }
    
}
public class AbstractDemo {
    public static void main(String args[])
    {
        Student s1 = new Student();
        Teacher t1 = new  Teacher();
         

        Member[] m = new Member[4];
        m[0] = new Student();
        m[1] = new Student();
        m[2] = new Student();
        m[3] = new Student();
        for (Member m1:m)
        {
            m1.welcomeMessage();
        }
    }

}