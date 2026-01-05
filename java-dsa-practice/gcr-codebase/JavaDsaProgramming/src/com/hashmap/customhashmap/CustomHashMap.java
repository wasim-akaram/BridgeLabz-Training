package com.hashmap.customhashmap;



public class CustomHashMap<K, V> {

    private int capacity = 16;   // default size
    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new Node[capacity];
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // PUT operation
    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = table[index];

        // Update if key already exists
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // GET operation
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> head = table[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // REMOVE operation
    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> head = table[index];
        Node<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}
