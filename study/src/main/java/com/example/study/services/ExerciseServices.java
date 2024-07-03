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
    public Integer differentDiagonal(List<List<Integer>> list) {

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < list.size(); i++) {
            firstDiagonal += list.get(i).get(i);
            secondDiagonal += list.get(i).get(list.size() - 1 - i);
        }
        return Math.abs(firstDiagonal - secondDiagonal);

    }


    /**
     * This method recevei
     *
     *
     * **/
    public int[] mergeTwoArrays(int[] nums1, int m, int[] nums2, int n) {

        int[] aux1 = new int[m+n];
        int i = 0;
        for(;i < m; i++){
            aux1[i] = nums1[i];

        }

        int sizer = i;
        for(int j= 0; j <m; j++){

            aux1[sizer] = nums2[j];
            sizer++;
        }


        for(int k = 0 ; k < aux1.length; k++){//1,2,3,2,5,6
            for(int j=k; j < aux1.length; j++){

                        if(aux1[k] > aux1[j]){
                            int kaux = aux1[k];
                            int jaux = aux1[j];

                            aux1[k] = jaux;
                            aux1[j] = kaux;

                        }
            }
        }

        return aux1;
    }
}
