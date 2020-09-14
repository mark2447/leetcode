package bytedance;

import java.util.HashMap;

public class LRUCache<K,V> {
    public class Node<K, V> {
        K key;
        V value;
        Node<K,V> next;
        Node<K,V> prev;
        public Node(K key, V value) {
            this.value = value;
            this.key = key;
        }
    }
    private final int limit;
    private HashMap<K, Node<K,V>> map;
    private Node<K,V> head;
    private Node<K,V> tail;
    LRUCache (HashMap<K,Node<K,V>> map,int limit) {
        this.map = map;
        this.limit = limit;
    }
    public V get(K key) {
        Node<K,V> node = map.get(key);
        if (node == null) {
            return null;
        }
        remove(key);
        append(node);
        return node.value;
    }
    public void remove(K key) {
        Node node = map.get(key);
        map.remove(key);
        if (node == null) {
            return;
        }
        if (node.next != null) {
            node.prev.next = node.next;
        }
        if (node.prev != null) {
            node.next.prev = node.prev;
        }
        if (node == head) {
            head = head.next;
        }
        if (node == tail) {
            tail = tail.prev;
        }
        node.prev = node.next = null;
    }
    public Node append(Node<K,V> node) {
        map.put(node.key, node);
        if (head == null) {
            head = tail = node;
        } else {
            node.prev = head;
            head.next = node;
            head = node;
        }
        return node;
    }
    public void set(K key, V value) {
        if (!map.containsKey(key)) {
            if (map.size() < limit) {
                Node<K,V> node = new Node<>(key, value);
                append(node);
            } else {
                Node<K,V> node1 = new Node<>(key, value);
                remove(tail.key);
                append(node1);
            }
        } else {
            Node<K,V> node2 = map.get(key);
            remove(node2.key);
            append(node2);
        }
    }
}
