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