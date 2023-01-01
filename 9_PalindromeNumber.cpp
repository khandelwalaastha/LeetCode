class Solution {
public:
    bool isPalindrome(int x) {
        if(x==0) return true;
        if(x<0) return false;
        int y, n=x;
        if(x == INT_MAX) return false;
        while(n!=0) {
            y = (y*10) + n%10;
            n = n/10;
        }
        return x==y;
    }
};
