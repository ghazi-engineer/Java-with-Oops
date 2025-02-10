public class StringProgram {

    public static String reverse(String in) {
        if (in == null)
            throw new IllegalArgumentException("This is not valid input");
        StringBuilder obj = new StringBuilder();

        char[] chars = in.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            obj.append(chars[i]);
        }
        return obj.toString();
    }

    public static void main(String[] args) {
        String str = "Bonus points for adding null check in the method and using StringBuilder for appending the characters. Note that the indexing in Java starts from 0, so you need to start at chars.length in the for loop.";
        System.out.println(reverse(str));
    }
}