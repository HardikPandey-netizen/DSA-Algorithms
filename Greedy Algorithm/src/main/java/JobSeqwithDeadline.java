import java.util.ArrayList;
import java.util.Arrays;

public class JobSeqwithDeadline {
    static int[] JobSequencing(Job[] job, int n){
        Arrays.sort(job, (a,b)->b.profit - a.profit);


        int maxDeadline = 0;
        for(Job j : job){
            maxDeadline = Math.max(maxDeadline,j.deadline);
        }
        int[] slot = new int[maxDeadline+1];
        Arrays.fill(slot,-1);



        for(Job j : job){
            for(int i = j.deadline; i >= 1; i--){
                if(slot[i] == -1){
                    slot[i] = j.id;
                    break;
                }
            }
        }

        return slot;
    }

    static void main() {
        Job[] jobs = {
                new Job(1, 2, 100),
                new Job(2, 1, 19),
                new Job(3, 2, 27),
                new Job(4, 1, 25),
                new Job(5, 3, 15)
        };
        int[] ans = JobSequencing(jobs, jobs.length);
        System.out.println(Arrays.toString(ans));
    }
}
