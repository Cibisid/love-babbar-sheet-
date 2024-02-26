class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> list = new ArrayList<>();
        subSet(s,list,"",0);
        Collections.sort(list);
        return list;
    }
    public static void subSet(String s,List<String> list,String str,int pos){
        
        if(pos == s.length()){
            return ;
        }
        
        String curr = str;
        str += s.charAt(pos);
        list.add(str);
        subSet(s,list,str,pos+1);
        
        str = curr;
        subSet(s,list,str,pos+1);
    }
}