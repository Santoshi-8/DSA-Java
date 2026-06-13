package Arrays;

public class lcf2 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String first = strs[0];
        String result = "";

        for (int i = 0; i < first.length(); i++) { // i = columns; outer loop
            char currChar = first.charAt(i);
            for (int j = 1; j < strs.length; j++) { // j = rows; inner loop

                if (i >= strs[j].length()) {
                    System.out.println(result);
                    return;
                }

                if (currChar != strs[j].charAt(i)) {
                    System.out.println(result);
                    return;
                }
            }// inner loop ends;
            result += currChar;
        } // outer loop ends;
        System.out.println(result);
    }
}
