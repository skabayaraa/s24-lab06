package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sortedIntList = new SortedIntList();
    private int totalAdded = 0;

    
    @Override
    public boolean add(int element) {
        sortedIntList.add(element);  
        totalAdded++;  
        return true; 
    }

    
    @Override
    public void addAll(int[] elements) {
        sortedIntList.addAll(elements);  
        totalAdded += elements.length;  
    }

    
    @Override
    public int getTotalAdded() {
        return totalAdded;
    }

   
    @Override
    public int size() {
        return sortedIntList.size();  
    }

   
    @Override
    public int get(int i) {
        return sortedIntList.get(i);  
    }
}

