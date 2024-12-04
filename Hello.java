public class Hello{
    int a = 10;
    static int b = 20;

    public static void main(String args[])
    {
        Hello h = new Hello();
        Hello h1 = new  Hello();
        System.out.println(h.a);
        h.hello();
        hey();

        h.b =50;
        h1.b = 100;
        h.b = 2500;

        h.a = 4320;
        h1.a = 32;
//since the variable b is static here,it will not have separate space when new object created,
//so how many object created will not matter,for which the last value is given it will be the output
        System.out.println("h.b :" + h.b);
        System.out.println("h.a :" + h.a);
        System.out.println("h1.a :" + h1.a);
    }
    

void hello()
{

}

static void hey(){

}
}