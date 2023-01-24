public class OneAway {
    public static void main(String [] args) {
        System.out.println(oneAway("pale", "ali"));
    }

    public static boolean oneAway(String s1, String s2) {
        if (s1.length() == s2.length()){
            return oneAwayReplaceCheck(s1, s2);
        }
        else if (s1.length() + 1 == s2.length()){
            return oneAwayInsertOrDelete(s1, s2);
        }
        else if (s1.length() - 1 == s2.length()){
            return oneAwayInsertOrDelete(s2, s1);
        }

        return false;
    }

    public static boolean oneAwayReplaceCheck(String s1, String s2){
        boolean isReplace = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                if (isReplace){
                    return false;
                }
                isReplace = true;
            }
        }
        return true;
    }

    public  static boolean oneAwayInsertOrDelete(String s1, String s2){
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()){
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }

        return true;
    }
}



