package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort2 {
	
	    // M�todo
	    public static void main(String[] args){
	    	//entrada de dados do vetor;
	    	Scanner scan = new Scanner(System.in);
			
			int n = 5; 
		    int arr[] = new int[n];

		    for (int i = 0; i<n; i++) {
		      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
		      arr[i] = scan.nextInt();
		    }
		    //fun��o chamada para fazer a ordena��o
	        bubbleSort(arr, arr.length);
	        
	        //fun��o usada para printar o vetor
	        System.out.println("Ap�s a orfdena��o: ");
	        System.out.println(Arrays.toString(arr));
	    }
	    
	    // fun��o que implementa o bubbleSort;
	    static void bubbleSort(int vetor[], int n)
	    {
	        // par�metro inicial para limitar a pesquisa;
	        if (n == 1)
	            return;
	      
	        // Faz a verifica��o do vetor e movendo o maior elemento pro final;
	        for (int i=0; i<n-1; i++)
	            if (vetor[i] > vetor[i+1]){
	            	
	                // utiliza um auxiliar para recriar o vetor modificado;
	                int aux = vetor[i];
	                vetor[i] = vetor[i+1];
	                vetor[i+1] = aux;
	            }
	      
	        //usa da recursividade para reavaliar o vetor;
	        bubbleSort(vetor, n-1);
	    }
	     
	}


