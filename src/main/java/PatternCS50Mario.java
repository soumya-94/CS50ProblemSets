import java.util.Scanner;

public class PatternCS50Mario {

    public static void main (String ar[]) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        do {
            System.out.println("Enter the number of rows: ");
            n = scanner.nextInt();

            if(n>0 && n<9)
            {
                for (int i = 1; i<=n; i++)
                {
                    for (int j = n; j>i; j--)
                    {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <=i ; k++)
                    {
                        System.out.print("#");
                    }
                    System.out.print("  ");
                    for (int k = 1; k <=i ; k++)
                    {
                        System.out.print("#");
                    }
                    System.out.println();
                }

                break;
            }
            else continue;
        } while (true) ;

        scanner.close();
    }


}
