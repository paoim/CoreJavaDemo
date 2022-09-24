package com.pao.challenge.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * // Let's say we have a LRU cache of capacity 2.
 * LRUCache cache = new LRUCache(2);
 * cache.set(1, 10); // it will store a key (1) with value 10 in the cache.
 * cache.set(2, 20); // it will store a key (2) with value 20 in the cache.
 * cache.get(1); // returns 10
 * cache.set(3, 30); // evicts key 2 and store a key (3) with value 30 in the cache.
 * cache.get(2); // returns -1 (not found)
 * cache.set(4, 40); // evicts key 1 and store a key (4) with value 40 in the cache.
 * cache.get(1); // returns -1 (not found)
 * cache.get(3); // returns 30
 * cache.get(4); // returns 40
 *
 */
public class LRUCache {

	private LinkedhashMapWithCapacity<Integer, Integer> cacheMap;

	public LRUCache(int capacity) {
		this.cacheMap = new LinkedhashMapWithCapacity<Integer, Integer>(capacity);
	}

	public int get(int key) {//this method works in O(1)
		return this.cacheMap.getOrDefault(key, -1);
	}

	public void set(int key, int value) {//this method works in O(1)
		System.out.println("Going to set the (key,value) : (" + key + ", " + value + ")");
		this.cacheMap.put(key, value);
	}

	private class LinkedhashMapWithCapacity<K,V> extends LinkedHashMap<K,V> {
		private static final long serialVersionUID = 8981261701429129976L;
		private int capacity;
		public LinkedhashMapWithCapacity(int capacity) {
			super(capacity, 0.75f, true);
			this.capacity = capacity;
		}
		@Override
		protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
			return this.size() > this.capacity;
		}
	}

	public static void main(String[] args) {
		System.out.println("Going to test the LRU Cache Implementation");

		LRUCache cache = new LRUCache(2);

		// it will store a key (1) with value 10 in the cache.
		cache.set(1, 10);

		// it will store a key (2) with value 20 in the cache.
		cache.set(2, 20);

		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10

		// evicts key 2 and store a key (3) with value 30 in the cache.
        cache.set(3, 30);

        System.out.println("Value for the key: 2 is " +  cache.get(2)); // returns -1 (not found)

        // evicts key 1 and store a key (4) with value 40 in the cache.
        cache.set(4, 40);

        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is " +  cache.get(3)); // returns 30
        System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40
	}
}
