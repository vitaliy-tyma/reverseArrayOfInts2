package util;

import java.util.ArrayList;
import java.util.List;

public class IncrementService {

    public Integer[] goWithObjects(Integer[] nums) {

        int numsLength = nums.length;
        List<Integer> worker = new ArrayList<>(numsLength);

        int step = 0;
        int carry = 0;
        int incrementedValue;
        int currentWorker;

//        Collections.reverse(worker);
        for (int i = numsLength - 1; i >= 0; i--) {
            if (nums[i] == null) {

                System.out.println("Null object is detected in position " + i + ". Skipping it.");
                continue;
            } else {
                currentWorker = nums[i];
            }

            if (step == 0) {
                incrementedValue = carry + currentWorker + 1;
            } else {
                incrementedValue = carry + currentWorker;
            }

            carry = incrementedValue / 10;

            if (carry == 0) {
                //TODO Copy the tail of the Array (but check for nulls and bad values) and break;
            }

            incrementedValue = incrementedValue % 10;

            worker.add(incrementedValue);

            step++;
        }

        int workerLength = worker.size();
        Integer[] result = new Integer[workerLength];

        for (int i = 0; i < workerLength; i++) {
            result[i] = worker.get(workerLength - i - 1);
        }

        return result;
    }
}
