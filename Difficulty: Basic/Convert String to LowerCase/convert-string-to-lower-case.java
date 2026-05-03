// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        char chars[] = s.toCharArray();
        for(int i = 0; i<chars.length; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i)<= 'Z'){
                chars[i] = (char)(chars[i]+32);
            }
        }
        return new String(chars);
    }
}