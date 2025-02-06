import java.util.*;

public class GroupAnagrams {

    /**
     * Given an array of strings strs, group the
     * anagrams
     * together. You can return the answer in any order.
     * Example 1:
     * <p>
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * <p>
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * <p>
     * Explanation:
     * <p>
     * There is no string in strs that can be rearranged to form "bat".
     * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
     * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
     * Example 2:
     * <p>
     * Input: strs = [""]
     * <p>
     * Output: [[""]]
     * <p>
     * Example 3:
     * <p>
     * Input: strs = ["a"]
     * <p>
     * Output: [["a"]]
     */
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            //for each word in the str [] we will create a key and sort so we know how to recognize anagrams
            char[] chars = str.toCharArray();
            //we need to sort this words so we have the same word to compare anagrams to
            Arrays.sort(chars);
            String sortedWordForKey = Arrays.toString(chars);
            if (!map.containsKey(sortedWordForKey)) {
                //if there is no like this sorted word-key in the map, then insert the KEY and for value - insert an empty list for now
                map.put(sortedWordForKey, new ArrayList<>());
            }
            //now insert the exact word that your iteration is at in that empty list that you created before
            map.get(sortedWordForKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
