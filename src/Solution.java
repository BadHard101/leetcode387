import java.util.HashMap;

/*
    // "loveleetcode"
    // "abababababababc"

    // "loveleetcode"
    //            ^
    // l: 2, o: 2, v: 1, e: 4, t: 1, c:1, d: 1
*/

class Solution {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.get(cur) == 1) {
                return i;
            }
        }
        return -1;
    }
}