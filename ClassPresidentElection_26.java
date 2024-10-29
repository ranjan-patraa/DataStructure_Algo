package gs;

import java.util.ArrayList;

public class ClassPresidentElection_26 {

    public static void main(String[] args) {

        int noOfStudents = 4;
        int lengthOfSong = 2;

        System.out.println(selectPresident(noOfStudents, lengthOfSong));

    }

    static int selectPresident(int n, int k) {

        ArrayList<Integer> students = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            students.add(i);
        }

        int index = 0;

        while(students.size() > 1) {

            index = (index + k - 1) % students.size();
            students.remove(index);
        }
        return students.get(0);
    }
}
