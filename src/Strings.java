import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {

    public static String merge(String str1, String str2) {

        StringBuilder sb = new StringBuilder();

        int count = 0;
        int len1 = str1.length(); //3
        int len2 = str2.length(); //4

        while (true) {
            if (count < len1) {
                sb.append(str1.charAt(count));
            }

            if (count < len2) {
                sb.append(str2.charAt(count));
            }

            if (count >= len1 && count >= len2) {
                break;
            }

            count++;
        }

        return sb.toString();
    }


    public static String merge2(String str1, String str2) {

        int tamanhoMaximo = 0;

        if (str1.length() > str2.length()) {
            tamanhoMaximo = str1.length();
        } else {
            tamanhoMaximo = str2.length();
        }

        List<Character> list = new ArrayList<>();

        for (int count=0 ; count < tamanhoMaximo ; count++) {
            if (count < str1.length()) {
                //sb.append(str1.charAt(count));
                list.add(str1.charAt(count));
            }

            if (count < str2.length()) {
                list.add(str2.charAt(count));
            }
        }

        return list.toString();
    }

}
