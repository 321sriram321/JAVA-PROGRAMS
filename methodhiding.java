class One
{
   public static void methodOne() {
      System.out.println("super class methodOne");
   }
}

class Two extends One
{
   public static void methodOne() {
      System.out.println("sub class methodOne");
   }
}

public class methodhiding
{
   public static void main(String[] args)
   {
        //Two t = new Two();
        One o = new Two();
        o.methodOne();
   }
}
