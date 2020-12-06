/*package whatever //do not write package name here */
import java.util.Scanner;
    public class StudentRecord {
        public static void main(String sfd[]) {
            Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            String stdNameTemp = "";
            while(testCases>0 ){

                int countStd = in.nextInt();

                int highest = 0;

                String stdName = "";

                while((stdName = in.nextLine()).isEmpty());
                    String[] words = stdName.split("[ ]+");
                    for(int k=0; k<words.length; k++){="" string="" sname="words[k];" int="" one="Integer.parseInt(words[++k]);" int="" two="Integer.parseInt(words[++k]);" int="" three="Integer.parseInt(words[++k]);" int="" avg="(one+two+three)/3;" if(avg=""> highest){
                        highest = avg;
                        stdNameTemp = sname;
                }
  
            }
    
            System.out.println(stdNameTemp+" "+highest);
    
            testCases--;
            }

        }
    }

// 3
// 2
// Shrikanth 20 30 10 Ram 100 50 10
// 3
// Adam 50 10 40 Suresh 22 1 56 Rocky 100 90 10
// 3
// Adam 50 10 40 Suresh 22 10 56 Mike 10 90 20



// Ram 53
// Rocky 66
// Mike 40

