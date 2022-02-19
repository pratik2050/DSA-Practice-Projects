package urlShortNer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashingShortNer {

    static String shortString(int n) {
        String collection = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder str = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (collection.length() * Math.random());
            str.append(collection.charAt(index));
        }

        return str.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL ShortNer");

        int choice = Integer.MAX_VALUE;

        System.out.println("What You want to do?\nType 1 For Encode and 2 For Decode (OR) Type 0 to Exit: ");
        choice = sc.nextInt();
        sc.nextLine();

        int pos = 0;

        HashMap<String, String> url = new HashMap<>();


        System.out.println("Enter Url: ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/') {
                pos = i + 1;
                break;
            }
        }
        String key = shortString(5);

        StringBuilder shortStr = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            shortStr.append(str.charAt(i));
        }

        System.out.println("New shorthand url: " + shortStr + key);

        url.put(key, str.substring(pos));


        StringBuilder outString = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            outString.append(str.charAt(i));
        }
        for (Map.Entry<String, String> e : url.entrySet()) {
            if (e.getKey() == key) {
                outString.append(e.getValue());
                break;
            }
        }
        System.out.println(outString);

    }
}
