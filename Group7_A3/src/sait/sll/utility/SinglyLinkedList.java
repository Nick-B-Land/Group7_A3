package sait.sll.utility;

public class SinglyLinkedList implements LinkedListADT{
    Node head;
    Node tail;
    int size;

    public SinglyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    /**
     * Checks if the list is empty.
     * @return True if it is empty.
     */
    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    /**
     * Clears the list.
     */
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    /**
     * Adds to the end of the list.
     * @param data Data to append.
     */
    @Override
    public void append(Object data) {
        Node<Object> newNode = new Node<>(data);

        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    /**
     * Prepends (adds to beginning) data to the list.
     * @param data Data to store inside element.
     */
    @Override
    public void prepend(Object data) {
        Node<Object> newNode = new Node<>(data);

        if(head == null){
            head = tail = newNode;
        }
        else{
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        size++;
    }

    /**
     * Adds a new element at a specific position.
     * @param data Data that element is to contain.
     * @param index Index to add new element at.
     * @exception IndexOutOfBoundsException Thrown if index is negative or past the size of the list.
     */
    @Override
    public void insert(Object data, int index) throws IndexOutOfBoundsException {
        if(index > size - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index not found");

        Node<Object> newNode = new Node<>(data);
        int counter = 0;
        Node temp1 = head;

        while(counter < index - 1){
            temp1 = temp1.next;
            counter++;
        }

        if(temp1 == head){
            Node temp2 = head;
            head = newNode;
            newNode.next = temp2;
        }
        else if(temp1.next == tail){
            temp1.next = newNode;
            newNode.next = tail;
        }
        else{
            Node temp2 = temp1.next;
            temp1.next = newNode;
            newNode.next = temp2;
        }

        size++;
    }

    /**
     * Replaces the data  at index.
     * @param data Data to replace.
     * @param index Index of element to replace.
     * @exception IndexOutOfBoundsException Thrown if index is negative or larger than size - 1 of list.
     */
    @Override
    public void replace(Object data, int index) throws IndexOutOfBoundsException {
        if(index > size - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index not found");

        int counter = 0;
        Node temp = head;

        while(counter < index){
            temp = temp.next;
            counter++;
        }

        temp.data = data;
    }

    /**
     * Gets the number of elements in the list.
     * @return Size of list (0 meaning empty)
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int index) throws IndexOutOfBoundsException {
        if(index > size - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index not found");

        int counter = 0;
        Node temp1 = head;

        while(counter < index - 1){
            temp1 = temp1.next;
            counter++;
        }


        if(temp1 == head){
            head = temp1.next;
        }
        else if(temp1.next == tail){
            temp1.next = null;
            tail = temp1;
        }
        else{
            Node temp2 = temp1.next.next;
            temp1.next = null;
            temp1.next = temp2;
        }

        size--;
    }

    /**
     * Gets the data at the specified index.
     * @param index Index of element to get.
     * @return Data in element or null if it was not found.
     * @exception IndexOutOfBoundsException Thrown if index is negative or larger than size - 1 of the list.
     */
    @Override
    public Object retrieve(int index) throws IndexOutOfBoundsException {
        if(index > size - 1 || index < 0)
            throw new IndexOutOfBoundsException("Index not found");
        else if(size < 1)
            return null;

        int counter = 0;
        Node temp = head;

        while(counter < index){
            temp = temp.next;
            counter++;
        }

        return temp.data;
    }

    /**
     * Gets the first index of element containing data.
     * @param data Data object to find the first index of.
     * @return First of index of element with matching data or -1 if not found.
     */
    @Override
    public int indexOf(Object data) {
        int counter = 0;
        Node temp = head;

        while(counter < size){
            if(temp.data == data)
                return counter;

            temp = temp.next;
            counter++;
        }

        return -1;
    }

    /**
     * Go through elements and check if we have one with data.
     * @param data Data object to search for.
     * @return True if element exists with value.
     */
    @Override
    public boolean contains(Object data) {
        int counter = 0;
        Node temp = head;

        while(counter < size){
            if(temp.data == data)
                return true;

            temp = temp.next;
            counter++;
        }

        return false;
    }
}