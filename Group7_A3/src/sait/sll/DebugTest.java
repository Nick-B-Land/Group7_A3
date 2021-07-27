package sait.sll;

import sait.sll.utility.LinkedListADT;
import sait.sll.utility.SinglyLinkedList;


//TEMP FILE
//used for debugging the linked list methods
//mostly double checking as I wanted to make sure things were working right
public class DebugTest {
    public static void main(String[] args) {
        LinkedListADT list = new SinglyLinkedList();

//        list.prepend("a");
//        list.prepend("b");
//        list.prepend("c");
//        list.prepend("d");

//        list.append("a");
//        list.append("b");
//        list.append("c");
//        list.append("d");
//
//        String c = (String) list.retrieve(3);
//        System.out.println(c);

//        list.append("a");
//        list.append("b");
//        list.append("c");
//        list.append("d");
//        list.insert("e", 3);
//        String d = (String) list.retrieve(2);
//        System.out.println(d);

//        list.append("a");
//        list.append("b");
//        list.append("c");
//        list.append("d");
//        list.insert("e", 3);
//        int i = list.indexOf("z");
//        System.out.println(i);


//        list.append("a");
//        list.append("b");
//        list.append("c");
//        list.append("d");
//        list.insert("e", 3);
//
//        list.delete(0);
//        String b = (String) list.retrieve(0);
//        System.out.println(b);

        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");
        list.insert("e", 3);
        list.insert("z", 0);
        String b = (String) list.retrieve(0);
        System.out.println(b);
    }
}
