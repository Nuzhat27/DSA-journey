/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       createCopyNode(head);
       connectRandom(head);
       head = connectNext(head);
       return head; 
    }
    private void createCopyNode(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
    }
    private void connectRandom(Node head){
        Node temp = head;
        while(temp != null){
            Node copyNode = temp.next;
            Node random = temp.random;
            if(random != null){
                copyNode.random = random.next;
            }
            else{
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }
    private Node connectNext(Node head){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        Node temp = head;
        while(temp != null){
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummyNode.next;
    }
}