package  tools;

class Launch
{
    public void abc()
    {
        A obj = new A();
        System.out.println(obj.marksEng);
    }
}

public class A{
    public int marks = 5;
    protected int marksEng = 45;

    public void show()
    {
        System.out.println("in show method!");
    }

}