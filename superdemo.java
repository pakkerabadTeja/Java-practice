class A
{
void greet()
{
System.out.println("hello");
}
}
class B extends A
{
void greet()
{
System.out.println("hi");
}
}
class superdemo
{
public static void main(String arg[]);
{
B obj=new B();
}
}
