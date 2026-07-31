class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int original = n;
        int rev = 0;
        while(n != 0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev == original;
    }
}