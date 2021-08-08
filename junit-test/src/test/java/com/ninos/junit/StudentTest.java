package com.ninos.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all method");
    }

    @BeforeEach
    void setUp() {
        student = new Student();
        System.out.println("before each method..............");
    }

    @Test
    void getName() {
        System.out.println(student.getName());
    }

    @Test
    void getAge() {
        System.out.println(student.getAge());
    }


    @AfterEach
    void tearDown() {
        System.out.println("after each method...................");
    }


    @AfterAll
    static void afterAll() {
        System.out.println("after all method done");
    }
}