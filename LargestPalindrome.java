public class LargestPalindrome {

    public String find(String strg){
        int stringLenght = 0;
        String largestPalindrome = "";
        for(int i = 0; i < strg.length(); i++){
            for(int j = i; j < strg.length(); j++){
                String subString = strg.substring(i, j + 1);
                if (subString.length() > stringLenght && palindromeOrNot(subString)){
                    largestPalindrome = subString;
                    stringLenght = subString.length();
                }
            }
        }
        return largestPalindrome;
    }

    public boolean palindromeOrNot(String str){
        boolean result = true;
        String lowerCaseString = str.toLowerCase();
        String revStr = reverse(str);
        String rev = revStr.toLowerCase();
        if(lowerCaseString.equals(rev)){
            return result;
        }
        return result = false;
    }
    public String reverse(String str){
        char[] ch = str.toCharArray();
        int length = ch.length;
        StringBuilder out = new StringBuilder();
        for(int i = length - 1; i >= 0; i--){
            out.append(ch[i]);
        }
        return new String(out);
    }
}
