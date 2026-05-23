class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        for(char c:hm.keySet())
        {
            if(hm.get(c)!=0)
            {
                return false;
            }
        }
        return true;
    }
}
