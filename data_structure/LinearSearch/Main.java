package data_structure.LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
       String[] states = new String[6];

       states[0] = "rs";
       states[1] = "ac";
       states[2] = "ba";
       states[3] = "df";
       states[4] = "sp";
       states[5] = "ms"; 

     
       Scanner scanner = new Scanner(System.in);
       System.out.println("Witch state u wanna search?");
       String searchFor = scanner.nextLine();

       boolean find = false;
              for(int i = 0; i < states.length; i++) {
                String element = states[i];
                    if(element.equals(searchFor)) {
                        find = true;
                        break;
                    } 
              }

              if(find) {
                System.out.println("find it");
              } else {
                System.out.println("dint find it");
              }
    }
    
}
