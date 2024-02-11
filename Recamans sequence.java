class Solution{
  static ArrayList<Integer> recamanSequence(int n){
      // code here
      ArrayList<Integer> seq = new ArrayList<>();
      Set<Integer> check = new HashSet<>();
      seq.add(0);
      check.add(0);
      int i = 1;
      while(i<n){
          int ans = seq.get(i-1)-i;
          if(ans<0 || check.contains(ans)){
              ans = ans + 2*i;
          }
          i++;
          check.add(ans);
          seq.add(ans);
      }
      return seq;
    }
}