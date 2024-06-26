package com.example.study.services;

import com.example.study.model.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class ExerciseServicesTest {

    @InjectMocks
    private ExerciseServices exerciseServices;


    @Test
    public void when_reverseList() {

        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertNode(8);
        s1.insertNode(3);
        s1.insertNode(4);
        s1.insertNode(2);
        s1.insertNode(10);


        exerciseServices.printReversedLinkedList(s1.head);
    }

    @Test
    public void when_calc_all_array_of_long() {
        List<Long> lisOfLong = new ArrayList<>();
        lisOfLong.add(5L);
        lisOfLong.add(1000000001L);
        lisOfLong.add(1000000002L);
        lisOfLong.add(1000000003L);
        lisOfLong.add(1000000004L);
        lisOfLong.add(1000000005L);


        exerciseServices.calcArrayOfLong(lisOfLong);
    }

    @Test
    public void when_different_diagonal_is_ok() {
        List<List<Integer>> collum = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);


        collum.add(row1);
        collum.add(row2);
        collum.add(row3);


        exerciseServices.differentDiagonal(collum);

        Assertions.assertEquals(15, exerciseServices.differentDiagonal(collum));
    }
}
