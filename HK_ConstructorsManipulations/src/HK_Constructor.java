public class HK_Constructor {

    int num1;
    int num2;

//    public HK_Constructor()
//    {
//        num1=10;
//        num2=30;
//    }
//
//    public HK_Constructor(int num1,int num2)
//    {
//        this.num1=num1;
//        this.num2=num2;
//    }

    public  void display()
    {
        System.out.println("Outer Class");
    }

    public class Inner
    {
        public void show()
        {
            System.out.println("Inner Class");
        }
    }

    public static class Static_InnerClass
    {
        public void showstaticinnerclass()
        {
            System.out.println("showstaticinnerclass Class");
        }
    }
}

class Tushant{

    public static void main(String args[])
    {
        HK_Constructor obj=new HK_Constructor();
        obj.display();
        HK_Constructor.Inner obj1= obj.new Inner();
        obj1.show();
        HK_Constructor.Static_InnerClass obj2=new HK_Constructor.Static_InnerClass();
        obj2.showstaticinnerclass();

    }
}