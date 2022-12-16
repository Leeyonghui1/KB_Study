import java.util.Scanner;
public class Btest8
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = i ; j < n ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1 ; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}