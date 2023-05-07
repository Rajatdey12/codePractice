package test;

import java.net.Inet4Address;
import java.util.*;

/*
Implement the LRU cache model.
The idea is basically, evict the least recently used page from the cache.

The Least Recently Used (LRU) cache is a cache eviction algorithm that organizes elements in order of use. In LRU,
 as the name suggests, the element that hasn't been used for the longest time will be evicted from the cache.
 */
public class LRUCacheTwo {

    /*
        Using LinkedHashSet and capacity..
    */
    private Set<Integer> linkedSet;
    private int cache_capacity_size;

    public LRUCacheTwo(int capacity) {
        linkedSet = new LinkedHashSet<>();
        cache_capacity_size = capacity;
    }

    public void populateCache(int page) {

        if (!linkedSet.contains(page)) {
            if (linkedSet.size() == cache_capacity_size) {
//                int first = 0;
//                for (Integer val : linkedSet) {
//                    first = val;
//                    break;
//                }
//                linkedSet.remove(first);
                linkedSet.remove(linkedSet.iterator().next());
                linkedSet.add(page);
            }
        } else {
            linkedSet.remove(page);
            linkedSet.add(page);
        }
        linkedSet.add(page);
    }

    public void display() {

        LinkedList<Integer> linkedLst = new LinkedList<>(linkedSet);
        Iterator<Integer> itr = linkedLst.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        LRUCacheTwo cache = new LRUCacheTwo(4);

        // input set 1
//        cache.populateCache(1);
//        cache.populateCache(2);
//        cache.populateCache(3);
//        cache.populateCache(2);
//        cache.populateCache(4);
//        cache.populateCache(2);

        // input set 2
        cache.populateCache(1);
        cache.populateCache(2);
        cache.populateCache(3);
        cache.populateCache(1);
        cache.populateCache(4);
        cache.populateCache(5);

        // display result
        cache.display();
    }
}
