//Program to accept the details of 10 students. Display the total characters in their name//

import java.util.*;

class TotalCharacter
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
//System.out.println("Enter the age of the student number " + (j+1));
//students[j].age=info.nextInt();
}
for(int i=0;i<students.length;i++)
{
System.out.println(students[i].name +" Has a character count of " + students[i].name.length());
}}
}
class Student
{
String name;
int age;
}
