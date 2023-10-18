package data_structure.BubbleSort;

public class Main {
    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];


        System.out.println("Non Orderned Vetor");
            for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);

        }

        System.out.println("Orderned Vetor");

        int aux; 
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++ ) {
                if(vetor[i] > vetor[j]) {
                    aux      = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
            System.out.println(vetor[i]);
        }



    }
}
