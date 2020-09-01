package Strings;
/*
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.


Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    // Using left and right pointers (boundaries)
    public void reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;

        while (right > left)
        {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }
}
