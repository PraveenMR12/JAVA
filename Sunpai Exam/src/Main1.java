import java.util.*;

public class Main1 {
    public static String highestAttendance(int N, String[] Name, int M, int[][] Attendance) {
        //this is default OUTPUT. You can change it.
        String result = "-404";

        // write your Logic here:
        int[] totalAttendance = new int[N];

        // Calculate the total attendance for each student
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                totalAttendance[j] += Attendance[i][j];
            }
        }

        int maxAttendance = Arrays.stream(totalAttendance).max().orElse(-1);

        // Find the names with the highest attendance
        List<String> studentsWithMaxAttendance = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (totalAttendance[i] == maxAttendance) {
                studentsWithMaxAttendance.add(Name[i]);
            }
        }

        // Set the output result
        if (studentsWithMaxAttendance.size() == 1) {
            result = studentsWithMaxAttendance.get(0);
        } else {
            result = "Prize shared between Multiple Students";
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // INPUT [uncomment & modify if required]
        int N = sc.nextInt();
        String[] Name = new String[N];
        for (int i = 0; i < N; i++) {
            Name[i] = sc.next();
        }
        int M = sc.nextInt();
        int[][] Attendance = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                Attendance[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // OUTPUT
        System.out.print(highestAttendance(N, Name, M, Attendance));
    }
}