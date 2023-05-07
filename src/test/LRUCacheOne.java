package test;

import java.util.*;

/*
Implement the LRU cache model.
The idea is basically, evict the least recently used page from the cache.

The Least Recently Used (LRU) cache is a cache eviction algorithm that organizes elements in order of use. In LRU,
 as the name suggests, the element that hasn't been used for the longest time will be evicted from the cache.
 */
public class LRUCacheOne {

    /*
        Using Deque (LinkedList) and hashSet to check if key/page is present.
    */
    private Deque<Integer> doublyQueue;
    private Set<Integer> set;
    private int CACHE_SIZE;


    public LRUCacheOne(int capacity) {
        doublyQueue = new LinkedList<>();
        set = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    public void referPage(int page) {

        if (!set.contains(page)) {
            if (doublyQueue.size() == CACHE_SIZE) {
                int last = doublyQueue.removeLast();
                set.remove(last);
            }
        } else {
            doublyQueue.remove(page);
        }
        doublyQueue.push(page);
        set.add(page);
    }

    public void display() {
        Iterator<Integer> itr = doublyQueue.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
    }

    public static void main(String[] args) {
        LRUCacheOne cache = new LRUCacheOne(4);
        cache.referPage(1);
        cache.referPage(2);
        cache.referPage(3);
        cache.referPage(2);
        cache.referPage(4);
        cache.referPage(2);
        cache.display();
    }
}
