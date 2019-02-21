package PraktikumDescending;
import java.util.Arrays;
public class PraktikumDescending {
    public static void main(String[] args) {
        // Variabel
        int[] bilangan = {20,3,6,1,4,5,9,2,6,10};
        
        // Tampilkan bilangan
        System.out.println("Bilangan sebelum di sorting Bubble Sort :  "+Arrays.toString(bilangan));
        
        // Proses Bubble Sort
        System.out.println("\nProses Bubble Sort secara Descending: ");
        for(int x = 0; x < bilangan.length; x++) {
                // Tampilkan proses Iterasi
                System.out.println("Iterasi "+(x+1));
                for(int y = 0; y < bilangan.length-1; y++) { if(bilangan[y] < bilangan[y+1]) {
                                // Proses pertukaran bilangan 
                                int temp = bilangan[y];
                                bilangan[y] = bilangan[y+1];
                                bilangan[y+1] = temp;
                        }
                // Tampilkan proses pertukaran tiap Iterasi
                System.out.println(Arrays.toString(bilangan));
                }
                System.out.println();
        }
        // Tampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting: "+Arrays.toString(bilangan));
    }
}
  