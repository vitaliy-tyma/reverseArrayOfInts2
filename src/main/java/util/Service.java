package util;

import java.util.*;

public class Service {

    public void goWithPrimitives(int [] nums) {

        List<Integer> numsList = new ArrayList<>(nums.length);
        for (int num : nums){
            numsList.add(num);
        }

        Collections.sort(numsList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int[] resultNums = new int[numsList.size()];

        for(int i = 0; i < resultNums.length; i++){
            resultNums[i] = numsList.get(i);
        }

        System.out.println("Source array of primitives:");
        System.out.println(Arrays.toString(nums));
        System.out.println("Sorted in reverse:");
        System.out.println(numsList);
        System.out.println("Result in primitives:");
        System.out.println(Arrays.toString(resultNums));
    }

    public void goWithObjects(Integer[] nums) throws IllegalArgumentException{

        //Validate the input
        int i = 0;
        for (Integer element : nums){
            if (element == null) {
                throw new IllegalArgumentException("Element " + i + " is null!");
            }
            i++;
        }

        List<Integer> numsList = Arrays.asList(nums);

        Comparator<Integer> reverseComparator = (o1, o2) -> o2 - o1;

        numsList.sort(reverseComparator);

        int[] resultNums = new int[numsList.size()];

        int runCount = 0;
        for (Integer element : numsList) {
            resultNums[runCount++] = element;
        }

        System.out.println("Source array of primitives:");
        System.out.println(Arrays.toString(nums));
        System.out.println("Sorted in reverse:");
        System.out.println(numsList);
        System.out.println("Result in primitives:");
        System.out.println(Arrays.toString(resultNums));
    }
}
