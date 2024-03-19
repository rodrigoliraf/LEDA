import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    
	    int tamanho = 10;
	    
	    int[] array = new int[tamanho];
	   
	   System.out.println("Para array de tamanho 10");
	   System.out.println("");
	   arrayAleatorio(array, tamanho);
	   System.out.println("");
	   
	   System.out.println("");
	   System.out.println("Bubble Sort: ");
	   bubbleSort(array);
	   
	   System.out.println("");
	   System.out.println("Insertion Sort: ");
	   insertionSort(array);
	   
	   System.out.println("");
	   System.out.println("Selection Sort: ");
	   selectionSort(array);
	   
	   System.out.println("");
	   System.out.println("===================================================================================================================================");
	   System.out.println("");

	   tamanho = 100;
	   array = new int[tamanho];
	   
	   System.out.println("Para array de tamanho 100");
	   System.out.println("");
	   arrayAleatorio(array, tamanho);
	   System.out.println("");
	   
	   System.out.println("");
	   System.out.println("Bubble Sort: ");
	   bubbleSort(array);
	   
	   System.out.println("");
	   System.out.println("Insertion Sort: ");
	   insertionSort(array);
	   
	   System.out.println("");
	   System.out.println("Selection Sort: ");
	   selectionSort(array);
	   
	   System.out.println("");
	   System.out.println("===================================================================================================================================");
	   System.out.println("");
	   
	   tamanho = 1000;
	   array = new int[tamanho];
	   
	   System.out.println("Para array de tamanho 1000");
	   System.out.println("");
	   arrayAleatorio(array, tamanho);
	   System.out.println("");
	   
	   System.out.println("");
	   System.out.println("Bubble Sort: ");
	   bubbleSort(array);
	   
	   System.out.println("");
	   System.out.println("Insertion Sort: ");
	   insertionSort(array);
	   
	   System.out.println("");
	   System.out.println("Selection Sort: ");
	   selectionSort(array);
	   
}



public static void arrayAleatorio(int[] array, int tamanho) {
	    
	    Random random = new Random();
	    
	    for (int i = 0; i < tamanho; i++){
	        array[i] = random.nextInt(100);
	    }
	    
	    System.out.println("Array aleatório:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
	}
}


public static void bubbleSort(int[] array) {
    
    long startTime = System.nanoTime();

        int aux;
        int trocas = 0;
        int comparacoes = 0;
        
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                comparacoes++;
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    trocas++;
                }
            }
        } 
        
        long endTime = System.nanoTime();
        
        long duration = endTime - startTime;
        
        exibirArray(array);
        System.out.println(duration + " nanossegundos");
        System.out.println("numero de trocas: " + trocas);
        System.out.println("numero de comparacoes: " + comparacoes);
    }
    
    
public static void insertionSort(int[] array){
    
    long startTime = System.nanoTime();
    
		int trocas = 0;
		int comparacoes = 0;

		for (int i = 1; i < array.length; i++){
			int aux = array[i];
			int j = i;
			array[j] = aux;
			trocas++;
			comparacoes++;

			if (j != 0) {
				comparacoes++;
			}
		}
		
    long endTime = System.nanoTime();
    
    long duration = endTime - startTime;
    
    exibirArray(array);
    System.out.println(duration + " nanossegundos");
    System.out.println("numero de trocas: " + trocas);
    System.out.println("numero de comparacoes: " + comparacoes);
}

public static void selectionSort(int[] array){
    
    long startTime = System.nanoTime();

        int trocas = 0;
        int comparacoes = 0;
        for (int i = 0; i < array.length-1; i++) {
            int minimo = i;
            for (int j = i+1; j < array.length; j++) {
                comparacoes++;
                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            int temp = array[minimo];
            array[minimo] = array[i];
            array[i] = temp;
            trocas++;
         }
        

    long endTime = System.nanoTime();
    
    long duration = endTime - startTime;
    
    exibirArray(array);
    System.out.println(duration + " nanossegundos");
    System.out.println("numero de trocas: " + trocas);
    System.out.println("numero de comparacoes: " + comparacoes);
}
    
    
    
    

public static void exibirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
