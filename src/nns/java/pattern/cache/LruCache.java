package nns.java.pattern.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LruCache {

	class Node {
		String userId;
		UserAccount userAccount;
		Node previous;
		Node next;

		public Node(String userId, UserAccount userAccount) {
			this.userId = userId;
			this.userAccount = userAccount;
		}
	}

	int capacity;
	Map<String, Node> cache = new HashMap<>();
	Node head;
	Node end;

	public LruCache(int capacity) {
		this.capacity = capacity;
	}

	public UserAccount get(String userId) {
		if (cache.containsKey(userId)) {
			Node node = cache.get(userId);
			remove(node);
			setHead(node);
			return node.userAccount;
		}
		return null;
	}

	/**
	 * Remove node from linked list.
	 */
	public void remove(Node node) {
		if (node.previous != null) {
			node.previous.next = node.next;
		} else {
			head = node.next;
		}
		if (node.next != null) {
			node.next.previous = node.previous;
		} else {
			end = node.previous;
		}
	}

	/**
	 * Move node to the front of the list.
	 */
	public void setHead(Node node) {
		node.next = head;
		node.previous = null;
		if (head != null) {
			head.previous = node;
		}
		head = node;
		if (end == null) {
			end = head;
		}
	}

	public boolean contains(String userId) {
		return cache.containsKey(userId);
	}

	public boolean isFull() {
		return cache.size() >= capacity;
	}

	public UserAccount getLruData() {
		return end.userAccount;
	}
	
	/**
	   * Clear cache
	   */
	  public void clear() {
	    head = null;
	    end = null;
	    cache.clear();
	  }

	  /**
	   * Returns cache data in list form.
	   */
	  public List<UserAccount> getCacheDataInListForm() {
	    List<UserAccount> listOfCacheData = new ArrayList<>();
	    Node temp = head;
	    while (temp != null) {
	      listOfCacheData.add(temp.userAccount);
	      temp = temp.next;
	    }
	    return listOfCacheData;
	  }

	  /**
	   * Set cache capacity
	   */
	  public void setCapacity(int newCapacity) {
	    if (capacity > newCapacity) {
	      clear(); // Behavior can be modified to accommodate for decrease in cache size. For now, we'll
	               // just clear the cache.
	    } else {
	      this.capacity = newCapacity;
	    }
	  }

}
