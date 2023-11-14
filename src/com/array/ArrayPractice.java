package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPractice {

    public static int searchMaxElementInArr(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int i =0; i<arr.length; i++) {
            if (maxValue<arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int searchMinElementInArr(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int i =0; i<arr.length; i++) {
            if (minValue>arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int secondSmallestElementInArr(int[] arr) {
        int fist = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i =0; i<arr.length; i++) {
            if (arr[i]<fist) {
                second = fist;
                fist = arr[i];
            } else if (arr[i]>fist && arr[i]<second) {
                second = arr[i];
            }
        }
        return second;
    }

    public static int[] moveZeros(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }

    public static int[] reverseArr(int[] arr) {
        int i =0, j= arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        int count = 0;
        for (int i=0; i<arr.length-1; i++) {
            boolean swap = false;
            for (int j =0; j<arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap = true;
                    count++;
                    swap(j, j+1, arr);
                }
            }
            if (!swap) {
                break;
            }
        }
        System.out.println(count);
        return arr;
    }
    public static int findMaxSubArray(int[] nums) {
        int currentMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i =0; i<nums.length; i++) {
            currentMax += nums[i];
            if (currentMax>globalMax) globalMax = currentMax;
            if (currentMax<0) currentMax = 0;
        }
        return globalMax;
    }
//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public static int findSingleElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e)+1);
            } else {
                map.put(e, 1);
            }
        }
        int singleEle = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1) {
                singleEle = entry.getKey();
                break;
            }
        }
        return singleEle;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums1 = {-3, 2, 1, -4, 7, 6, 3, -2, 1,3};
        int[] arr = {1, 8, 2, 1,2};
//        System.out.println(Arrays.toString(moveZeros(arr)));

//        System.out.println(Arrays.toString(reverseArr(arr)));

//        System.out.println(searchMaxElementInArr(arr));

//        System.out.println(searchMinElementInArr(arr));

//        System.out.println(secondSmallestElementInArr(arr));

//        System.out.println(Arrays.toString(bubbleSort(arr)));

//        System.out.println(findMaxSubArray(nums1));

        System.out.println(findSingleElement(arr));

    }

}

