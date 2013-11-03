import java.io.*;
public class Test {
    
 
    static boolean [][] friends;
    
    static int [] who;
    
    static int num_sets = 0;
    static int size = 0;
    static int iterations = 0;
    
    static boolean newSet = true;
    
    public static void main(String...z) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            
            String line = "";
            int i = 0;
            int j = 0;
            while ((line = br.readLine()) != null) {
                
                if(i == 0) {
                    num_sets = Integer.parseInt(line);
                }
                else {
                    
                    if ( i > iterations) {
                        newSet = true;
                        i = 0;
                    }
                    
                    if (newSet) {
                        newSet = false;
                        String [] nums = line.split("\\s+");
                        size = Integer.parseInt(nums[0]);
                        iterations = Integer.parseInt(nums[1]);
                        
                        friends = new boolean[size][size];
                    }
                    else { // currently parsing set
                        String [] n = line.split("\\s+");
                        int x = Integer.parseInt(n[0]);
                        int y = Integer.parseInt(n[1]);
                        friends[x-1][y-1] = true;
                        friends[y-1][x-1] = true;
                    }    
                }
                i++;
            }
            
            who = new int[size];
            
            int sum = 0;
            for (int k = 0; k < size; ++k) {
                for (int q = 0; q < size; ++q) {
                    if (friends[k][q]) {
                        sum++;
                    }
                }
                who[k] = sum;
                sum = 0;
            }
            
            int max = who[0];
            
            for (int k = 0 ; k < size; ++k) {
                if (who[k] > max) {
                    max = who[k];
                }
            } 
            
            System.out.print(max + 1);
         
        }
        catch (IOException e) {
        }
        
    }
    
}