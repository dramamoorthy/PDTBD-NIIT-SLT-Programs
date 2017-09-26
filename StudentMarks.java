//Program to accept the details of 10 students. Display the details of student who will be eligible for voting after three years//

import java.util.*;

class StudentMarks
{
public static void main(String args[])
{
try{
int sum=0;
Scanner info = new Scanner(System.in);
Student students[]= new Student[10];

for(int j=0;j<5;j++)
{

students[j]=new Student();
System.out.println("Enter the name of the student number " + (j+1));
students[j].name=info.next();
System.out.println("Enter the Marks of the student number " + (j+1));
students[j].marks=info.nextInt();
}
for(int i=0;i<5;i++)
{
sum = sum + students[i].marks;
}
System.out.println("the total marks is " + sum);
}
catch (InputMismatchException e)
{
System.out.println("enter an integer");
}

}
}
class Student
{
String name;
int marks;
}
