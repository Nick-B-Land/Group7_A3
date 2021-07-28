package sait.sll.utility;

import java.io.Serializable;

public class Node<E> implements Serializable {
    E data;
    Node next;

    public Node (E data){
        this.data = data;
    }
}
