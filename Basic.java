class A
{
    public void m1()
    {
        System.out.println("m1 from class A is called ");
    }
}
class B extends A
{
    public void m2()
    {
        System.out.println("m2 from class B is called");
    }
}
class Basic
{
    public static void main(String[] args)
    {
        objB=new B();
        objB.m1();
    }
}