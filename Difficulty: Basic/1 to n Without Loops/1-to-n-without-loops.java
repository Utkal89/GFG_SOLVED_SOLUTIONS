class Solution {
    public void printTillN(int n) {
        // code here
        print(1,n);
    }
        public static void print(int x,int a){
            if(x>a) return;
            System.out.print(x+" ");
            print(x+1,a);
        }
    
}