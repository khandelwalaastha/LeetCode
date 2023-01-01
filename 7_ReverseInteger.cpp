class Solution {
    public int reverse(int x) {
        boolean isNumberNegative = false;
        if(x < 0) {
            isNumberNegative = true;
            x *=-1;
        }
        long answer = 0;
        while(x !=0 ) {
           answer = (answer * 10) + (x%10) ;
           x = x/10;
        }
        if(isNumberNegative) {
            answer = answer*-1;
        }
        if(answer >= 2147483647) return 0;
        if(answer <= -2147483648) return 0;
        return (int)answer;
    }
}
