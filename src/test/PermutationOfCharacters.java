package test;

/* -- Print the possible permute of the arrangement of
      characters in a given string.
 */
public class PermutationOfCharacters {

    public static void permuteCombination(String inp, String res) {

        if (inp.length() == 0) {
            System.out.println(res + " ");
            return;
        } else {
            for (int i = 0; i < inp.length(); i++) {
                char ch = inp.charAt(i);

                String subs = inp.substring(0, i) +
                        inp.substring(i + 1);

                permuteCombination(subs, res + ch);
            }
        }
    }

    public static void main(String[] args) {
        permuteCombination("abc", "");
    }
}
