import java.util.Scanner;
public class Btest6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        
        for(int i = 0 ; i < a.length() ; i++)
        {
            if(a.charAt(i) == 'A')
            {
                if(a.charAt(i+1) == '+')
                    System.out.print("4.3");
                else if(a.charAt(i+1) == '0')
                    System.out.print("4.0");
                else if(a.charAt(i+1) == '-')
                    System.out.print("3.7");
                else
                    break;
            }
            else if(a.charAt(i) == 'B')
            {
                if(a.charAt(i+1) == '+')
                    System.out.print("3.3");
                else if(a.charAt(i+1) == '0')
                    System.out.print("3.0");
                else if(a.charAt(i+1) == '-')
                    System.out.print("2.7");
                else
                    break;
            }
            else if(a.charAt(i) == 'C')
            {
                if(a.charAt(i+1) == '+')
                    System.out.print("2.3");
                else if(a.charAt(i+1) == '0')
                    System.out.print("2.0");
                else if(a.charAt(i+1) == '-')
                    System.out.print("1.7");
                else
                    break;
            }
            else if(a.charAt(i) == 'D')
            {
                if(a.charAt(i+1) == '+')
                    System.out.print("1.3");
                else if(a.charAt(i+1) == '0')
                    System.out.print("1.0");
                else if(a.charAt(i+1) == '-')
                    System.out.print("0.7");
                else
                    break; 
            }
            else if(a.charAt(i) == 'F')
            {
                System.out.print("0.0");              
            }
            else
                break;
        }
    }
}