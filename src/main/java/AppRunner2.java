import util.IncrementService;
import util.Service;

import java.util.Arrays;


public class AppRunner2 {

    public static void main(String[] args) {
        System.out.println("Start with Primitives");
        int[] nums1 = {1, 4, 5, -8, 0, 4, 2, 45, 788, 234};
        new Service().goWithPrimitives(nums1);

        System.out.println("\nStart with Objects");
        Integer[] nums2 = {1, 4, 5, -8, 0, 4, null, 2, 45, 788, 234};
        try {
            new Service().goWithObjects(nums2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException 1: " + e.getMessage());
            System.out.println("Processing has been interrupted.");
        } finally {
            System.out.println("Finally clause 3.");
        }

        System.out.println("\nStart with Incrementing Objects");
        Integer[] nums3 = {-9, 4, 5, 8, 0, 4, 2, 5, 9, 9};
        Integer[] integers = new IncrementService().goWithObjects(nums3);
        System.out.println("Integers source:");
        System.out.println(Arrays.toString(nums3));
        System.out.println("Integers incremented:");
        System.out.println(Arrays.toString(integers));
    }
}
