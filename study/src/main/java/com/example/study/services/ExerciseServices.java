package com.example.study.services;

import com.example.study.model.SinglyLinkedList;
import com.example.study.model.SinglyLinkedListNode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

@Component
public class ExerciseServices {

    private SinglyLinkedList aux = new SinglyLinkedList();

    public void exercise1() {

        SinglyLinkedList s1 = new SinglyLinkedList();

        s1.insertNode(17);
        s1.insertNode(19);
        s1.insertNode(20);

        SinglyLinkedList s2 = new SinglyLinkedList();
        s2.insertNode(1);
        s2.insertNode(30);
        s2.insertNode(7);

        SinglyLinkedList teste = sort(s1.head, s2.head);
    }

    private SinglyLinkedList sort(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode current1 = head1;
        SinglyLinkedListNode current2 = head2;

        SinglyLinkedList newList = new SinglyLinkedList();

        while (current1 != null || current2 != null) {


            if (current1 == null) {
                newList.insertNode(current2.data);
                current2 = current2.next;
                continue;
            }
            if (current2 == null) {
                newList.insertNode(current1.data);
                current1 = current1.next;
                continue;
            }


            if (current1.data >= current2.data) {
                newList.insertNode(current2.data);
                current2 = current2.next;
            } else if (current1.data <= current2.data) {
                newList.insertNode(current1.data);
                current1 = current1.next;
            }


        }

        return newList;
    }

    public void printReversedLinkedList(SinglyLinkedListNode head) {

        if (head.next != null) {
            printReversedLinkedList(head.next);

        }
        System.out.print(head.data);
    }
}
