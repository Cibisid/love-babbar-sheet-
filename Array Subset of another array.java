class Compute {
  public String isSubset( long a1[], long a2[], long n, long m) {
      Arrays.sort(a1);
      Arrays.sort(a2);

      List<Long> l=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          l.add(a1[i]);
      }
      for(int i=0;i<m;i++)
      {
          if(l.contains(a2[i]))
          {
              l.remove(a2[i]);
          }
          else
          {
              return "No";
          }
      }
      return "Yes";
  }
}

