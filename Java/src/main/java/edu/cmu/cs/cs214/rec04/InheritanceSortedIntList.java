package edu.cmu.cs.cs214.rec04;

// InheritanceSortedIntList.java
public class InheritanceSortedIntList extends SortedIntList {
    private int totalAdded = 0;

    // Override the add method
    @Override
    public boolean add(int element) {
        super.add(element);  // Call the parent class's add method
        totalAdded++;  // Increment the counter for added elements
                return false;
    }

    // Override the addAll method
    @Override
    public void addAll(int[] elements) {
        for (int element : elements) {
            super.add(element);  // Call the parent class's add method for each element
        }
        totalAdded += elements.length;  // Add the number of elements added
    }

    // Method to get the total number of added elements
    public int getTotalAdded() {
        return totalAdded;
    }
}
