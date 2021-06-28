import java.util.*;
class EvenNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
int i=b;
while(i>=a)
{
int r=i%2;
if(r==0)
System.out.println(i);
i--;
}
}
}

