class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        if(r==0) return s.charAt(n);
        while(r>0){
            String temp="";
            for(int i=0;i<=n;i++){
                if(s.charAt(i)=='0'){
                    temp=temp+"01";
                }else{
                    temp=temp+"10";
                }
            }
            s=temp;
            r--;
        }
        return s.charAt(n);
        
    }
}