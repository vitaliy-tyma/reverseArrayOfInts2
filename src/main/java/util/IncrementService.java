package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IncrementService {

    public Integer[] goWithObjects(Integer[] nums) {
        Integer[] result = new Integer[nums.length];

        List<Integer> worker = new ArrayList<>(Arrays.asList(nums));

        int step = 0;
        int carry = 0;
        int incrementedValue = 0;

        Collections.reverse(worker);
        for (int i = 0; i < worker.size(); i++) {
            incrementedValue = worker.get(i);

            if (step == 0) {
                incrementedValue = carry + worker.get(i) + 1;
            } else {
                incrementedValue = carry + worker.get(i);
            }

            carry = incrementedValue / 10;

            incrementedValue = incrementedValue % 10;

            worker.set(i, incrementedValue);

            step++;
        }

        Collections.reverse(worker);
        for (int i = 0; i < worker.size(); i++) {
            result[i] = worker.get(i);
        }

        return result;
    }
}
