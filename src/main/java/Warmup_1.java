public class Warmup_1 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean makes10(int a, int b) {
        if ((a == 10) || (b == 10) || ((a + b) == 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public static String missingChar(String str, int n) {
        String x = str.substring(0, n);
        String y = str.substring(n + 1, str.length());
        return x + y;
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

    public static String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }
        return front + front + front;
    }

    public static String backAround(String str) {
        String back = str.substring(str.length() - 1);
        return back + str + back;
    }

    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    public static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String front = str.substring(0, 2);
        return (front.equals("hi"));
    }

    public static boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }

    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20 || b >= 10 && b <= 20));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    public static boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public static boolean mixStart(String str) {
        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public static String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public static int intMax(int a, int b, int c) {
        return (Math.max(Math.max(a, b), c));
    }

    public static int close10(int a, int b) {
        int diff1 = Math.abs(a - 10);
        int diff2 = Math.abs(b - 10);

        if (diff1 < diff2) {
            return a;
        }
        if (diff2 < diff1) {
            return b;
        }
        return 0;
    }

    public static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public static boolean stringE(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                c++;
            }
        }
        return (c >= 1 && c <= 3);
    }

    public static boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }

    public static String endUp(String str){
        if(str.length() <=3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();

    }
}