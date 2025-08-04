
class AlphaNumericSum {

    static int ANSum(String str) {
        int sum = 0;
        String num = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num += c;
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num);
                    num = "";

                }
            }
        }
        if (!num.isEmpty()) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "a2mg79j4";
        int ans = ANSum(str);
        System.out.println(ans);

    }
}
