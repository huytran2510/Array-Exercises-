public class LongestPalindromeSubstring {
    public static String longestPalindrome(String[] strings) {
        String s= "";
        for(int i =0 ; i< strings.length; i++) {
            s += strings[i];
        }

        String maxLongestPalindrome = "";
        int maxLength = 0;

        for(int i = 0 ; i < s.length(); i++) {
            String oddWord = expand(s,i,i);
            String evenWord = expand(s,i,i+1);
            if(oddWord.length() > maxLength) {
                maxLongestPalindrome = oddWord;
                maxLength = oddWord.length();
            }

            if(evenWord.length() > maxLength) {
                maxLongestPalindrome = evenWord;
                maxLength = evenWord.length();
            }
        }
        return maxLongestPalindrome;
    }

    public static String expand(String s, int left, int right){
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }

    public static void main(String[] args) {
        String[] s = {"a", "k", "o", "o", "k", "d", "e"};
        System.out.println(longestPalindrome(s));
    }
}
