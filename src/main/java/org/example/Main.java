package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*Task task1 = new Task("Java", "OOP çalış", "Ann", Priority.HIGH, Status.IN_PROGRESS);
        Task task2 = new Task("Java", "Listeleri öğren", "Bob", Priority.MED, Status.ASSIGNED);
        Task task3 = new Task("Python", "Veri analizi", "Carol", Priority.LOW, Status.IN_QUEUE);
        Task task4 = new Task("Java", "OOP çalış", "Bob", Priority.HIGH, Status.IN_QUEUE);

        Set<Task> annsTasks = new HashSet<>();
        Set<Task> bobsTasks = new HashSet<>();
        Set<Task> carolsTasks = new HashSet<>();
        Set<Task> unassignedTasks = new HashSet<>();

        annsTasks.add(task1);
        annsTasks.add(task2);
        bobsTasks.add(task3);
        bobsTasks.add(task4);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println("--- Tüm Görevler ---");
        System.out.println(taskData.getTasks("all"));

        System.out.println("\n--- Ann'in Görevleri ---");
        System.out.println(taskData.getTasks("ann"));

        System.out.println("\n--- Kesişim (Intersection) Testi (Örn: Ann ve Bob) ---");
        System.out.println(taskData.getIntersect(annsTasks, bobsTasks));

        System.out.println("\n--- Fark (Difference) Testi ---");
        System.out.println(taskData.getDifference(taskData.getTasks("all"), annsTasks));*/

        Set<String> uniqueWords = StringSet.findUniqueWords();
        System.out.println(uniqueWords);
        System.out.println(uniqueWords.size());

    }
}