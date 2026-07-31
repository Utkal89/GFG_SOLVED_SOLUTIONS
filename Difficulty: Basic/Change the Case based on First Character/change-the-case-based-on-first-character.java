class Solution {
    String modify(String s) {
        for(int i=0;i<=s.length()-1;i++){
            if(Character.isUpperCase(s.charAt(0))) return s.toUpperCase();
        }return s.toLowerCase();
    }
}