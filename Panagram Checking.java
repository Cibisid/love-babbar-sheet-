class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        if(s.length() <26) {
            return false;
        }
        
        char a =  'a';
        
        for(int i=0; i<26; i++){
            if(s.contains(Character.toString(a)) || s.contains(Character.toString(a).toUpperCase())){
                a++;
            }
            
            else{
                return false;
            }
        }
        https://media.geeksforgeeks.org/img-practice/prod/courses/5/Web/Content/Clock-4_1706701529.gif
        return true;
    }
}