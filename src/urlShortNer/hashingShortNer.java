package urlShortNer;

import java.util.Scanner;

public class hashingShortNer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("URL ShortNer Program");

        int choice = Integer.MAX_VALUE;

        DecodeEncode shortNer = new DecodeEncode();

        while (choice != 0) {

            System.out.println("Enter 1 to Encode, 2 to Decode (or) Press 0 to exit: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Large URL: ");
                    String lUrl = sc.next();

                    shortNer.Encode(lUrl);
                    break;

                case 2:
                    System.out.println("Enter Short URL: ");
                    String  sUrl = sc.next();

                    System.out.println(shortNer.Decode(sUrl));
                    break;

                case 0:
                    break;
            }
        }
    }
}
