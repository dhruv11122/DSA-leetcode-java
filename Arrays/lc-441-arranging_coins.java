class Solution {
    public int arrangeCoins(int n) {
        int k=0,i=1;
        while(n>=0){
            n-=i;
            i++;
            k++;
            
        }
        if(n==0){
            return k;
        }
        else{
            return k-1;
        }
    }
}