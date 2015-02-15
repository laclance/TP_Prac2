package za.ac.cput.laclance.Prac_2;

public class TestObject
{
    public TestObject()
    {}

    public float getFloat()
    {
        return 5.5f;
    }

    public int getInt()
    {
        return 5;
    }

    public Object getObject() {
        Object o = 5;
        return o;
    }

    public Object getArray() {
        Object o = new Object[]{1,2};
        return o;
    }

    public boolean getTrue()
    {
        return true;
    }

    public boolean getFalse() {return false;}

    public String getNull()
    {
        return null;
    }
}
