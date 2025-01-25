import java.util.Random;

public class PassGen {
    public static String Generate(int length) {
        String  characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+?";
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for(int i=0;i<length;i++){
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
        }

        public static void main(String[] args) {
            System.out.println("Your Password:"+ Generate(10));
        }
    }
