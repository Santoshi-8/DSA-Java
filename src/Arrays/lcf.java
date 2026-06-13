package Arrays;
// first type
class lcf {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String first = strs[0];
        String result = "";

        for ( int i = 0; i < first.length(); i++) { // i = columns;
            char currChar = first.charAt(i);
            for (int j = 1; j < strs.length; j++) { // j = rows;
                if (i < strs[j].length()) { // outer if starts
                    if (currChar == strs[j].charAt(i)) {
                        // inner if starts;
                    }
                    else {// inner if ends;
                        System.out.println(result);
                       return;
                    }// outer if ends;
                }
                else {
                    System.out.println(result);
                   return;
                }
               }// inner loop ends;

            result += currChar;
            } // outer loop ends;
        System.out.println(result);


    }

    }




