public class StringRecursion {

    public static void main(String[] args) {
        // System.out.println(charRunCount("Hello", 'l'));
        // System.out.println(isPalindrome("bob"));
        // System.out.println(isPalindrome("maam"));
        // System.out.println(isPalindrome("barb"));
        System.out.println(indexOf("barb",'t'));
        System.out.println(indexOf("barbe",'e'));
        System.out.println(indexOf("re",'e'));
    }
    // Question 3
    public static boolean stringEquals(String str1,String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // we may assume the strings length are equal (from here)
        if (str1.length() == 0) { // we finished going over the strings
            return true;
        }

        if (str1.charAt(0) != str2.charAt(0)) { 
            return false;
        }
        
        return stringEquals(str1.substring(1),str2.substring(1));	
    }

    // Question 4
    public static int charRunCount (String str, char ch){
        if (str.length() == 0){
            return 0;
        }
        char c = str.charAt(0);
        if (c == ch){
            return 1 + charRunCount(str.substring(1), ch);
        }
        return charRunCount(str.substring(1), ch);
    }

    // Question 5
    public static int hammingDistance (String str1, String str2){
        if (str1.length() != str2.length()){
            return -1;
        }
        if (str1.length() == 0){
            return 0;
        }
        if (str1.charAt(0) != str2.charAt(0)){
            return 1 + hammingDistance(str1.substring(1), str2.substring(1));
        }
        return hammingDistance(str1.substring(1), str2.substring(1));
    }

    // question 6 
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) { 
            return false;
        }
        return isPalindrome(str.substring(1,str.length() - 1));	
    }
    
    // Question 7
    public static int indexOf (String str, char ch) {
        int res = indexOfHelper(str,ch);
        if (res == str.length()) {  
            return -1;
        }
        return res;	
    }

    private static int indexOfHelper (String str, char ch) {
        if (str.length() == 0){  
            return 0;
        }
        if (str.charAt(0) == ch) {
            return 0;
        }
        String st1 = str.substring(1);
        return 1 + indexOfHelper(st1,ch);	
    }
    
    // Question 8 
    public static int stringToInt(String num) {
        if (num.length() == 0) {
             return 0;
        }
        int number = (int) (Math.pow(10,num.length() - 1) * (num.charAt(0) - '0'));
        return stringToInt(num.substring(1)) + number;	
    }
    
    // Question 9 
    public static boolean isAnagram (String str1, String str2) {
        if (str1.length() != str2.length()){
            return false;
        }
        if (str1.length() == 0){
            return true;
        }
        int index = str2.indexOf(str1.charAt(0));
        if (index == -1){
            return false;
        }
        String temp = str2.substring(0, index);
        if (index != str2.length() - 1) {
            temp += str2.substring(index + 1);
        } 
        return isAnagram(str1.substring(1), temp);
    }   
}

    
