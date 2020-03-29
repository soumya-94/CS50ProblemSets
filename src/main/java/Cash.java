import java.util.Scanner;

public class Cash {

    public static void main(String ar[])
    {
        float input=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Input the change owed in float: ");
            input = scanner.nextFloat();
            if(input > 0.0)
                break;
            else
                continue;
        } while (true);

        int q=0, d=0, n=0, p=0, coins=0, changeLeft=0, change=0;

        change = Math.round(input * 100);

        q = change/25;
        changeLeft = change%25;

        d = changeLeft/10;
        changeLeft = changeLeft%10;

        n = changeLeft/5;
        changeLeft = changeLeft%5;

        p = changeLeft;

        System.out.println(q+d+n+p);

    }

}
