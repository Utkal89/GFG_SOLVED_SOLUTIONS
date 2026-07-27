class Solution {
    int floorSqrt(int n) {
        // code here
        int lo=1;int hi=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid>n) hi=mid-1;
            else lo=mid +1;
        
        }
        return hi;
    }
}