package Arrays;
//LC 217. Contains Duplicate
public class prblm20 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int num : nums){
            if(!arr.add(num)) return true;
        }
        return false;
    }
}
