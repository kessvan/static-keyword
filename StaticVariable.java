class StaticVariable
{
 static String name="college";

static void fun1()
{
   System.out.println("Hello I am Static");
}
void fun2()
{
   System.out.println("Hello I am non Static");
}

    public static void main(String args[])
    {

    StaticVariable.fun1();
    StaticVariable  oa=new  StaticVariable();
    oa.fun2(); 
    System.out.println(StaticVariable.name);
  
    }
}
