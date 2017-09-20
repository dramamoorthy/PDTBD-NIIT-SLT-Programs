//Program to accept the details of 10 students. Display the details of student who will be eligible for voting after three years//

import java.util.*;

class VotingAge
{
public static void main(String args[])
{
Scanner info = new Scanner(System.in);
Student students[]= new Student[10];

for(int j=0;j<10;j++)
{

students[j]=new Student();
System.out.println("Enter the name of the student number " + (j+1));
students[j].name=info.next();
System.out.println("Enter the age of the student number " + (j+1));
students[j].age=info.nextInt();
}
for(int i=0;i<students.length;i++)
{
if(students[i].age + 3 > 17)
{
System.out.println(students[i].name +" will be eligible to vote after three years, Present age is: " + students[i].age);
}
}}
}
class Student
{
String name;
int age;
}
