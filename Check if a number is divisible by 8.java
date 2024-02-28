class Solution{
    int DivisibleByEight(String s){
        
        int n=s.length();
        String p="";
        if(s.length()<=3){
            int a=Integer.parseInt(s);
            if(a%8==0)return 1;
            return -1;
        }
        p=p+s.charAt(n-3)+s.charAt(n-2)+s.charAt(n-1);
        int b=Integer.parseInt(p);
        if(b%8==0)return 1;
        return -1;
    }
}