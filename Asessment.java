import java util.*;
class Assessment
  {
      public void add(int a,int b){
        System.out.println(a+b);
      }

      public int sub(int a,int b){
        System.out.println(a-b);
      }

    public static void main (String args[])
    {
      Assessment a1 =new Assessment();
      System.out.println("hello world");

      int a=10;
      int b=20;
   
      a1.add(a,b);
      a1.sub(a,b);
    }
  }
