package com.example.study.services;

import com.example.study.model.SinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


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

    static Stream<Arguments> getListOfInt() {//-18,1,2,3,7,25
        return Stream.of(Arguments.of(new int[]{1, 2, 7, 0, 0, 0}, 3, new int[]{-18, 25, 3, 0, 0, 0}, 3, new int[]{-18, 1, 2, 3, 7, 25}));
    }

    @ParameterizedTest
    @MethodSource("getListOfInt")
    public void when_merge_two_arrays(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        Assertions.assertArrayEquals(expected, exerciseServices.mergeTwoArrays(nums1, m, nums2, n));
    }
}
