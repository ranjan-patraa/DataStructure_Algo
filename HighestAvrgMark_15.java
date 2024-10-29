package gs;

import java.util.HashMap;
import java.util.Map;

public class HighestAvrgMark_15 {

    public static void main(String[] args) {

        String[][] students = {
                {"Charles", "84"},
                {"John", "100"},
                {"Andy", "37"},
                {"Johh", "23"},
                {"Charles", "20"},
        };

        System.out.println(topperStudent(students));
    }

    static String topperStudent(String[][] students) {

        HashMap<String, int[]> studentMap = new HashMap<>();

        for(String[] student : students) {

            String name = student[0];
            int mark = Integer.parseInt(student[1]);

          studentMap.putIfAbsent(name, new int[2]);
            studentMap.get(name)[0] += mark;
            studentMap.get(name)[1] ++;

            /*int[] currData = studentMap.getOrDefault(name, new int[]{0, 0});
            currData[0] += mark;
            currData[1]++;
            studentMap.put(name, currData);*/
        }

            String topper = "";
            double highestAvrg = Double.NEGATIVE_INFINITY;

            for(Map.Entry<String, int[]> entry : studentMap.entrySet()) {

                String naam = entry.getKey();
                int totalMarks = entry.getValue()[0];
                int totalCount = entry.getValue()[1];

                double average = (double) totalMarks / totalCount;

                if(average > highestAvrg) {
                    topper = naam;
                    highestAvrg = average;
                }
            }
            return "Highest Average: "+ highestAvrg + " (Student : "+ topper +")";
    }
}
