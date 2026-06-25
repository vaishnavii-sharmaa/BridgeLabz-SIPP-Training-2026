public class ArraySubsetsRecursion {

    public static void generateSubsets(
            int[] array,
            int index,
            String subset) {

        if (index == array.length) {

            System.out.println(
                    "[" + subset + "]");
            return;
        }

        generateSubsets(
                array,
                index + 1,
                subset);

        String newSubset;

        if (subset.isEmpty()) {

            newSubset =
                    String.valueOf(array[index]);

        } else {

            newSubset =
                    subset + "," + array[index];
        }

        generateSubsets(
                array,
                index + 1,
                newSubset);
    }

    public static void main(String[] args) {

        int[] array = {1, 2};

        generateSubsets(
                array,
                0,
                "");
    }
}
