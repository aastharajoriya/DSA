package BinarySearch;

public class StringEncoding {

    public static void main(String[] args) {
        String message = "aabbcabcdabbdcaas";

        String result = stringEncoding(message);
        System.out.println(result);
    }

    public static String stringEncoding(String message) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < message.length(); i++) {

            if (message.charAt(i) == message.charAt(i - 1)) {
                count++;
            } else {
                result.append(message.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        // last character
        result.append(message.charAt(message.length() - 1));
        result.append(count);

        return result.toString();
    }
}