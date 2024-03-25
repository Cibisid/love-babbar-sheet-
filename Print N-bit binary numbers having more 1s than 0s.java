class Solution {
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> list=new ArrayList<>();
        
       printString(N,list,0,"");
       return list;
     
    }
    public static void printString(int n,ArrayList<String> list,int i,String str){
        if(i==n){
            if(str.charAt(0)!='0'){
                int cntz=0;
                int cnton=0;
                int indz=-1;
                int indone=-1;
                boolean check=false;
                for(int j=0;j<str.length();j++){
                    char ch=str.charAt(j);
                    if(ch=='1'){
                        cnton++;
                        indone=j;
                    }
                    else{
                        cntz++;
                        indz=j;
                    }
                    if(cnton<cntz){
                        check=true;
                        break;
                    }
                }
                
                if(!check){
                     if(cnton>cntz){
                    list.add(str);
                }
                else if(cnton==cntz){
                    if(indone<indz){
                        list.add(str);
                    }
                }
                }
            }
            
           return;
        }
        
            printString(n,list,i+1,str+'1');
            printString(n,list,i+1,str+'0');
         
    }
}