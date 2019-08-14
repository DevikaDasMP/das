class Scop
{
    Scop(int x)
    {
        System.out.println("constructor with argument"+x);
    }
    Scop()
    {
        System.out.println("Constructor without arument");
    }
    static
    {
        System.out.println("first static block");
    }
    {
        System.out.println("not static not a constructor");
    }
    static
    {
        System.out.println("second static block");
    }
    void scope1(){
        System.out.println("Scope1");
    }
}
class Scope
{
    public static void main(String[] args)
    {       
        System.out.println("First");
        Scop obj;
        System.out.
        ("Second");
        obj=new Scop();
        System.out.println("Third");
        obj.scope1();        
        System.out.println("end of default");
        Scop obj1=new Scop(5);
    }
    
}