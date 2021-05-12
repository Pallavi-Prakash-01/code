public class JewelsAndStones {
//Approach 1 : BruteForce Approach
public int numJewelsInStones(String jewels, String stones) {
       int count =0;
       for(int i=0;i<jewels.length();i++){
           for(int j=0;j<stones.length();j++){
               if(jewels.charAt(i)==stones.charAt(j))
                   count++;
               else continue;
           }
        } 
        return count;
    }
//Approach 2 : Using Hashset
public int numJewelsInStones(String jewels, String stones) { 
       Set<Character> Jset = new HashSet();
       int answer =0;
       for(char j:jewels.toCharArray())
             Jset.add(j);
       
       for(char s:stones.toCharArray()){
              if(Jset.contains(s))
                   answer++;
       }
    return answer;          
}
}
