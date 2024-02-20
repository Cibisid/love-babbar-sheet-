class Solution{
    static int minValue(String s, int k){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        HashMap<Character,Integer> A=new HashMap<>();
        for(int i=0;i<s.length();i++){
            A.put(s.charAt(i),A.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch:A.keySet()){
            p.add(-A.get(ch));
        }
        while(k!=0){
        p.add(p.poll()+1);
        k--;
        }
        int sum=0;
        while(!p.isEmpty()){
            int x=p.poll();
            sum=sum+(x*x);
        }
        return sum;
    }
}