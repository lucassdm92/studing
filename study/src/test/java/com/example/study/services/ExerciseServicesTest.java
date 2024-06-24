package com.example.study.services;

import com.example.study.model.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;


@ExtendWith(MockitoExtension.class)
public class ExerciseServicesTest {

    @InjectMocks
    private ExerciseServices exerciseServices;


    @Test
    public void when_reverseList(){

        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertNode(8);
        s1.insertNode(3);
        s1.insertNode(4);
        s1.insertNode(2);
        s1.insertNode(10);


        exerciseServices.printReversedLinkedList(s1.head);
    }
}
