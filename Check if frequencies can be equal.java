class Solution {
    boolean sameFreq(String s) {
        int[] a=new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        if(check(a)){
            return true;
        }
        for(int i=0;i<26;i++){
            if(a[i]>0){
                a[i]--;
                if(check(a)){
                    return true;
                }
                a[i]++;
            }
        }
        return false;
    }
    boolean check(int[] freq){
        int n=-1;
        for(int f:freq){
            if(f>0){
                if(n==-1){
                    n=f;
                }else if(f!=n){
                    return false;
                }
            }
        }
        return true;
    }
}