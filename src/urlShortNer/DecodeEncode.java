package urlShortNer;

import java.util.HashMap;
import java.util.Map;

public class DecodeEncode {

    HashMap<String, String> url = new HashMap<>();

    public String shortString(int n) {
        String collection = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";

        StringBuilder str = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (collection.length() * Math.random());
            str.append(collection.charAt(index));
        }

        return str.toString();
    }

    public void Encode(String str) {
        int pos = 0;
        System.out.println("Enter Url: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/') {
                pos = i + 1;
                break;
            }
        }

        String key = shortString(5);
        url.put(key, str.substring(pos));

        System.out.println("New Shorted URL: " + str.substring(0, pos) + key);
    }

    public String Decode(String str) {
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/') {
                pos = i + 1;
                break;
            }
        }

        for (Map.Entry<String, String > e : url.entrySet()) {
            if (e.getKey().equals(str.substring(pos))) {
                return ("Original Url: " + str.substring(0, pos) + e.getValue());
            }
        }
        return null;
    }
}
