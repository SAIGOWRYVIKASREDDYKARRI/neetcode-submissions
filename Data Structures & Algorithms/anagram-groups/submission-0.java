class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!hash.containsKey(key)) {
                hash.put(key, new ArrayList<>());
            }

            hash.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>(hash.values());
        return result;
    }
}