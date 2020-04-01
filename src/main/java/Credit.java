import java.util.Scanner;

public class Credit {

    public static void main (String ar[]) {

        long card = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the card number: ");
        card = scanner.nextLong();

        int length = String.valueOf(card).length();

        if (length > 12) {

            int arr[] = new int[length];
            int sum1 = 0, sum2 = 0;

            //store individual digits in an array
            for (int i = length - 1; i >= 0; i--) {
                arr[i] = (int) (card % 10);
                card = card / 10;
            }

            int firstDigit = arr[0];
            int secondDigit = arr[1];

            if (firstDigit >= 3 && firstDigit <= 5)
            {
                for (int i=length-2; i>=0; i=i-2)
                {
                    arr[i] = arr[i] * 2;
                    sum1 = sum1 + (arr[i] % 10) + (arr[i] / 10);
                }

                for (int i=length-1; i>=0; i=i-2)
                {
                    sum2 = sum2 + arr[i];
                }

                if ((sum1 + sum2) % 10 == 0) {
                    if (length == 15 && firstDigit == 3 && (secondDigit == 4 || secondDigit == 7))
                        System.out.println("AMEX");
                    else if (length == 16 && firstDigit == 5 && (secondDigit >= 1 && secondDigit <= 5))
                        System.out.println("MASTERCARD");
                    else if ((length == 13 || length == 16) && firstDigit == 4)
                        System.out.println("VISA");
                    else
                        System.out.println("INVALID : the card is not an amex, mastercard or visa");
                } else
                    System.out.println("INVALID : the computed sum of Luhn's algo is not divisible by 10");

            }
            else
                System.out.println("INVALID : the card number does not start with 3, 4 or 5");
        }
        else
            System.out.println("INVALID : length of the card number is less than 13");
    }

}
