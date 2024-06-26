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


    public long calcArrayOfLong(List<Long> ar) {

        long calc = 0;

        for (Long longs : ar) {
            calc = longs.longValue() + calc;
        }

        return calc;

    }

    // -  0 {11 2   4}
    // -  1 {4  5   6}
    // -  2 {10 8 -12}

    //4
    //-1 1 -7 -8
    //-10 -8 -5 -2
    //0 9 7 -1
    //4 4 -2 1
    public Integer differentDiagonal(List<List<Integer>> list) {


        int calc = 0;
        int calc2 = 0;

        int resulSize = list.size();
        for (int i = 0; i < list.size(); i++) {
            calc += list.get(i).get(i);
            calc2 += list.get(i).get(resulSize - 1);

            resulSize--;
        }

        return Math.abs(calc - calc2);

    }
}
