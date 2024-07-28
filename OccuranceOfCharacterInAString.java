package linearsearch;

public class OccuranceOfCharacterInAString {
    public static void main(String[] args) {
        String string = new String("surajsurajsurjasurja");
        char character = 'q';
        int count = 0;
        for (char stringChar : string.toCharArray()) {
            if (character == stringChar) count++;
        }
        System.out.println("the char '" + character + "' occurs " + count + " times.");
    }
}
