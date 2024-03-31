import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int findNum(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num,countMap.getOrDefault(num, 0) +1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if (entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,4,3,5,5,3};
        int uniqueNumber = findNum(nums);
        System.out.println("Numero unico: "+ uniqueNumber);
    }
}