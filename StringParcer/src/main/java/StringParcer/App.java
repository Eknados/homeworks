package StringParcer;

public class App {

    public static void main(String[] args) {

        String rawValue = "1,((1,1),(1,0),1)";
        char[] chars = rawValue.toCharArray();


        boolean inBreaks;
        int breakCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                breakCount++;
            }

            if (chars[i] == ')') {
                breakCount--;
            }

            if (breakCount > 0) {
                inBreaks = true;
            } else {
                inBreaks = false;
            }

            if (inBreaks) {
                if (chars[i] == ',') {
                    chars[i] = '+';
                }
            } else {
                if (chars[i] == ',') {
                    chars[i] = '*';
                }
            }
        }

        double doubleValue = eval(String.valueOf(chars));

        System.out.println(isBoolean(doubleValue));
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

    public static boolean isBoolean(double value) {
        if (value > 0) {
            return true;
        } else {
            return false;
        }
    }
}
