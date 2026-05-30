class Solution {
    fun isAnagram(s: String, t: String): Boolean {
           if(s.length != t.length) return false;

            val allStrings: MutableMap<Char, Int> = mutableMapOf() 

               for(char in s){
                    allStrings[char] =(allStrings.get(char) ?: 0) +1
               }

               for(char in t){
                var updatedcharValue = allStrings[char] ?: return false;
                if(updatedcharValue == 0) return false;
                 allStrings[char] = updatedcharValue -1
               }
            
            return true;
    }
}