package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sortedIntList = new SortedIntList();
    private int totalAdded = 0;

    // Delegate the add method to the sortedIntList
    @Override
    public boolean add(int element) {
        sortedIntList.add(element);  // Delegate to SortedIntList
        totalAdded++;  // Increment the counter for added elements
        return true;  // Return true as the element is successfully added
    }

    // Delegate the addAll method to the sortedIntList
    @Override
    public void addAll(int[] elements) {
        sortedIntList.addAll(elements);  // Delegate to SortedIntList
        totalAdded += elements.length;  // Add the number of elements added
    }

    // Method to get the total number of added elements
    @Override
    public int getTotalAdded() {
        return totalAdded;
    }

    // Delegate the size method to SortedIntList
    @Override
    public int size() {
        return sortedIntList.size();  // Return the size of the SortedIntList
    }

    // Delegate the get method to SortedIntList
    @Override
    public int get(int i) {
        return sortedIntList.get(i);  // Return the element at the given index
    }
}

