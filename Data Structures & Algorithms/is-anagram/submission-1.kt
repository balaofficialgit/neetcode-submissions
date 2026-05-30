class Solution {
    fun isAnagram(s: String, t: String): Boolean {

            val map1 : MutableMap<Char, Int> = mutableMapOf() 
            val map2 : MutableMap<Char, Int> = mutableMapOf() 

               for(char in s){
                    map1[char] =(map1.get(char) ?: 0) +1
               }

                 for(char in t){
                    map2[char] =(map2.get(char) ?: 0) +1
               }
            
            return map1 == map2;
    }
}