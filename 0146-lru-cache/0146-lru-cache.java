class Node {
    int key, val;
    Node next;
    Node prev;

    Node() {
        key = val = -1;
        next = prev = null;
    }

    Node(int key, int val) {
        this.key = key;
        this.val = val;
        next = prev = null;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> mpp;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        mpp = new HashMap<>();
    }

    public int get(int key) {
        if (mpp.containsKey(key)) {
            Node node = mpp.get(key);
            int val = node.val;
            deleteNode(node);
            insertAfterHead(node);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (mpp.containsKey(key)) {
            Node node = mpp.get(key);
            node.val = value;
            deleteNode(node);
            insertAfterHead(node);
        } else {
            if (mpp.size() == capacity) {
                Node node = tail.prev;
                mpp.remove(node.key);
                deleteNode(node);
            }
            Node newNode = new Node(key, value);
            mpp.put(key,newNode);
            insertAfterHead(newNode);
        }
    }

    private void deleteNode(Node node) {
        Node front = node.next;
        Node back = node.prev;
        back.next = front;
        front.prev = back;
    }

    private void insertAfterHead(Node node) {
        Node front = head.next;
        head.next = node;
        node.next = front;
        node.prev = head;
        front.prev = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */