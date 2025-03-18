package edu.cmu.cs.cs214.rec04;

/**
 * Main class for Recitation 5. This can be used as sandbox to experiment in.
 * @author Nora Shoemaker
 *
 */
public class Main {

    public static void main(String[] args) {

        /** 
         * This is a sandbox to experiment in.
         * Uncomment the following code to play with your implementation 
         * Select all and (CTRL + /) or (COMMAND + /)
         * Feel free to write more to test your implementation. 
         */

        IntegerList list1;
        IntegerList list2;

        list1 = new DelegationSortedIntList();  // Initialize with DelegationSortedIntList
        list2 = new InheritanceSortedIntList(); // Initialize with InheritanceSortedIntList

        // add 5 elements to our first list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        printList(list1);
        System.out.println("Total Added (list1): " + list1.getTotalAdded());  // Print total added

        // add 2 elements to a second list.
        list2.add(3);
        list2.add(0);

        // Add all elements from list1 to list2 (addAll expects an array of elements)
        list2.addAll(new int[]{1, 3, 2, 4, 2});  // Pass the elements from list1 directly as an array

        printList(list2);
        System.out.println("Total Added (list2): " + list2.getTotalAdded());  // Print total added
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}
