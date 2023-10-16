package data_structure;

public class Vetor {
    public static void main(String[] args) {
        int[] vetor = new int[7];
        vetor[0] = 3;
        vetor[1] = 22;
        vetor[2] = 50;
        vetor[3] = 10;
        vetor[4] = 25;
        
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("This is " + i + " vetor");
            System.out.println(vetor[i]);
        }


    }
}