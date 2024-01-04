package travelticketonlinepurchasesystem.util;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String SPECIAL_CHARACTERS = "@#$%&";
    private static final String NUMBER = "0123456789";
    private static final String RANDOM_PASSWORD = CHAR_LOWER + CHAR_UPPER + SPECIAL_CHARACTERS + NUMBER;

    private static final SecureRandom random = new SecureRandom();

    static StringBuilder sb = new StringBuilder(8);

    public static String generatePassword() {

        sb.append(CHAR_LOWER.charAt(random.nextInt(CHAR_LOWER.length())));

        sb.append(CHAR_UPPER.charAt(random.nextInt(CHAR_UPPER.length())));

        sb.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        sb.append(NUMBER.charAt(random.nextInt(NUMBER.length())));

        for (int i = 4; i < 8; i++) {
            sb.append(RANDOM_PASSWORD.charAt(random.nextInt(RANDOM_PASSWORD.length())));
        }
        return sb.toString();
    }

}
