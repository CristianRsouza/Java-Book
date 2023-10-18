package data_structure.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[1000];

            for(int i = 0; vetor.length > i; i++) {
                vetor[i] = i * 2;
            }

            System.out.println("Choose a number");
            Scanner scanner = new Scanner(System.in);

            int count = 0;
            int findit = scanner.nextInt();
            Boolean find = false;
            int start = 0;
            int end = vetor.length - 1;
            int mid;

            while(start <= end) {
                mid = (int) ((start + end) / 2);
                count++;    
                if(vetor[mid] == findit) {
                        find = true;
                        break;
                    } else if(vetor[mid] < findit){
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
            }

            if(find == true) {
                System.out.println("u find it" + ", " + count );
            } else {
                System.out.println("u didnt find it");
            }

    }
    
}
