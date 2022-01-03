package regExExample;

import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args){
        String email = "vinares.liu@gmail.com";
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);

        System.out.println(pattern.matcher(email).matches());
    }
}
