class A
{
  public void m1()
  {
    System.out.println("Hi");
  }
};
class B extends A
{
  public void m2()
  {
    System.out.println("bye");
  }
  public void m1()
  {
    System.out.println("Hello");
 }
  public void m1(String s)
   {
   System.out.println(s);
   }
};
public class C
{
public static void main(String args[])
{
  A a,al;
  B b;
  a=new A();
  b=newB();
  al=a;
  al.m1();
  al=b;
  al.m1();
 }
};