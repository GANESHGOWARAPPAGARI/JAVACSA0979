class TwoGenerics<T>
{
    T a;
    T b;
    TwoGenerics(T a1,T b1)
    {
        a=a1;
        b=b1;
    }
    void swap()
    {
        T c=a;
        a=b;
        b=c;
    }
    void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class GDemo
{
    public static void main(String args[])
    {
        
        TwoGenerics<String>obj=new TwoGenerics<String>("samba","siva");
        System.out.println("Before swaping");
        obj.print();
        System.out.println("After swaping");
        obj.swap();
        obj.print();

        TwoGenerics<Integer>obj1=new TwoGenerics<Integer>(40,50);
        System.out.println("Before swaping");
        obj1.print();
        System.out.println("After swaping");
        obj1.swap();
        obj1.print();
    }
}
