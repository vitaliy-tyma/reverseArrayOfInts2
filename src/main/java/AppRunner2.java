import static util.Service.goWithObjects;
import static util.Service.goWithPrimitives;

public class AppRunner2 {

    public static void main(String[] args) {
        System.out.println("Start with Primitives");
        int[] nums1 = {1, 4, 5, -8, 0, 4, 2, 45, 788, 234};
        goWithPrimitives(nums1);

        System.out.println("\nStart with Objects");
        Integer[] nums2 = {1, 4, 5, -8, 0, 4, null, 2, 45, 788, 234};
        try {
            goWithObjects(nums2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException 1: " + e.getMessage());
        } finally {
            System.out.println("Processing has been interrupted.");
        }

    }
}
