import java.util.Arrays;

//№66 Plus One
public class PlusOne {
    public static void main(String[] args) {
        int[] mas = {9,9,9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(mas)));
    }

    public int[] plusOne(int[] digits) {
        int lastEl = digits[digits.length-1];
        if (lastEl < 9) {
            digits[digits.length-1] = lastEl +1;
        } else {
            for (int i = digits.length -1; i != -1; i--) {
                if (digits[i] + 1 > 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    return digits;
                }
            }
            int[] ret =Arrays.copyOfRange(digits,0,digits.length +1);
            ret[0] = 1;
            return ret;
        }
        return digits;
    }
}