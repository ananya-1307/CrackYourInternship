class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int s=0;
        while(n>0)
        {
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        if(s==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}