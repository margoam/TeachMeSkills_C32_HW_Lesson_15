package com.teachmeskills.hw.lesson_15.task4;

import java.util.HashSet;
import java.util.Set;

public class Task4 {

    public static void showTMSC32StudentsWithMentor() {

        Set<String> groupMembers = new HashSet<>();
        groupMembers.add("Andrew");
        groupMembers.add("Oleg");
        groupMembers.add("Dmitry");
        groupMembers.add("Dmitry");
        groupMembers.add("Sergey");
        groupMembers.add("Ilya");
        groupMembers.add("Kirill");
        groupMembers.add("Kirill");
        groupMembers.add("Igor");
        groupMembers.add("Marina");
        groupMembers.add("Daniil");
        groupMembers.add("Sultan");
        groupMembers.add("Rita");
        groupMembers.add("Vlad");
        groupMembers.add("Kate");

        for (String member : groupMembers){
            System.out.print(member + " ");
        }
    }
}
