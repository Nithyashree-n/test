package test;
import java.util.Scanner;
public class Classmain {
static int i1;
static int i2;
static int i3;
static int num;
static String input;
static String op;
int s=0;
int su=0;
int m=1;
static int d;
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of inputs for the operations:");
num=sc.nextInt();
int i1[]= new int[num];
for(int i=0;i<num;i++) {
System.out.println("enter values");

i1[i]=sc.nextInt();
}
System.out.println("enter the operations you want to perform:+/-/*/");
op=sc.next();
if(op.equals(" +"))
{
Addclass a1= new Addclass();
a1.add(i1);
}
else if(op.equals(" _")) {
Subclass sub1=new Subclass();
sub1.sub(i1);
}
else if (op.equals("*")) {
Multiclass m = new Multiclass();
m.mul(i1);
}
else {
Divclass d = new Divclass();
d.div(i1);
	
}
sc.close();

}
}
