import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergei");
        map.put(2, "Moses");

        System.out.println(map.get(2));

        //find the first non-repeating char in a string
        //java developer -> output j
        System.out.println(firstNonRepeatingChar("java developer"));

        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));

    }

    private static Character firstNonRepeatingChar(String s) {
        Map<Character, Integer> map = new HashMap();
        int count;
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
            for (Character c : s.toCharArray()) {
                if (map.get(c) == 1) {
                    return c;
                }
            }
        }
        return null;
    }

    //given int[] array

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int potentialMatch = target - arr[i];
            if(map.containsKey(potentialMatch)) return new int[]{map.get(potentialMatch), i};
            else map.put(arr[i], i);
        }
        return new int[]{};
    }
}
