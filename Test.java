import java.util.Scanner;
 public class Test { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.print("Enter a string: ");
           String input = sc.nextLine(); 
           char ch;
            String nstr = "";
 for (int i = 0; i < input.length(); i++)
  { ch = input.charAt(i); 
    nstr = ch + nstr; }
     System.out.println("Reversed String is : " + nstr);}}