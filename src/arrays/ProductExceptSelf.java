package arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for(int i = n-1; i>=0; i--){
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        var sol = productExceptSelf(nums);
        System.out.printf("The product is %s.", Arrays.toString(sol));
    }
}
