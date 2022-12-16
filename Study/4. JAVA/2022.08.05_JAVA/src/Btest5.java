import java.util.Scanner;
public class Btest5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int count = 0;
        for(int i = 0 ; i < a.length() ; i++)
        {
           if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'i' || a.charAt(i) == 'u')
           {
               count ++;
           }
        }
        System.out.println(count);
    }
}