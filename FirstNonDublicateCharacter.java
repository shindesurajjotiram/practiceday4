package linearsearch;

public class FirstNonDublicateCharacter {
    public static void main(String[] args) {
        String s = "surajjoutiramshinde";
        for (int i = 0; i < s.length(); i++) {
            boolean found = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
