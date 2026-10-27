class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            int[] signature = new int[26];
            for (char c : str.toCharArray()) {
                signature[c - 'a']++;
            }
            String key =
                Arrays.stream(signature).mapToObj(i -> i + "#").collect(Collectors.joining());
            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
