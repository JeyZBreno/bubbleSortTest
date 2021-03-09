package bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort2 {
	
	    // Método
	    public static void main(String[] args){
	    	//entrada de dados do vetor;
	    	Scanner scan = new Scanner(System.in);
			
			int n = 5; 
		    int arr[] = new int[n];

		    for (int i = 0; i<n; i++) {
		      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
		      arr[i] = scan.nextInt();
		    }
		    //função chamada para fazer a ordenação
	        bubbleSort(arr, arr.length);
	        
	        //função usada para printar o vetor
	        System.out.println("Após a orfdenação: ");
	        System.out.println(Arrays.toString(arr));
	    }
	    
	    // função que implementa o bubbleSort;
	    static void bubbleSort(int vetor[], int n)
	    {
	        // parâmetro inicial para limitar a pesquisa;
	        if (n == 1)
	            return;
	      
	        // Faz a verificação do vetor e movendo o maior elemento pro final;
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


