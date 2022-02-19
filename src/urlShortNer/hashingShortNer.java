package urlShortNer;

import java.util.HashMap;
import java.util.Scanner;

public class hashingShortNer {

    static String shortString(int n) {
        String collection = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder str = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(collection.length()*Math.random());
            str.append(collection.charAt(i));
        }

        return str.toString();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL ShortNer");
        int choice;
        while (choice != 0) {
            System.out.println("What You want to do?\nType 1 For Encode and 2 For Decode (OR) Type 0 to Exit: ");
            choice = sc.nextInt();
            sc.nextLine();

            HashMap<String, String> url = new HashMap<>();
            switch (choice) {
                case 1:
                    System.out.println("Enter Url: ");
                    String str = sc.next();
                    int pos = 0;
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == '/') {
                            pos = i+1;
                            break;
                        }
                    }

            }
        }
    }
}
