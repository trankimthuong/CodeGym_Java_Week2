package validate_numberphone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String NUMBERPHONE_REGEX = "[(]{1}[0-9]{2}[)]{1}[-]{1}[(]{1}[0]{1}[0-9]{9}[)]{1}";

    public NumberPhone(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NUMBERPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
