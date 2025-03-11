// 25. Regular Expressions in java.util.regex
import java.util.regex.*;
class RegexExample {
    public static void main(String[] args) {
        String email = "test@example.com";
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        System.out.println("Is valid email: " + matcher.matches());
    }
}








