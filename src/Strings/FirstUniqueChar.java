package Strings;

/* Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

 */
public class FirstUniqueChar {
    public int findFirstUniqueChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int firstIndex = s.indexOf(s.charAt(i));
            int lastIndex = s.lastIndexOf(s.charAt(i));

            if (firstIndex == lastIndex ) {
                return i;
            }
        }
        return -1;
    }
}
