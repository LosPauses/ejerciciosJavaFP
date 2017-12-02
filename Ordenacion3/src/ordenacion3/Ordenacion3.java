package ordenacion3;

public class Ordenacion3 {

    public static void main(String[] args) {
        int a[] = new int [4];
        int orden[] = new int [4];
        
        System.out.println("Array desordenado");
        omplirArray(a);
        imprimirArray(a);
        
    }
    
    private static void ordArray (int a[]){
        
    }
    
    private static void imprimirArray(int[] a) {
        for (int pasada = 0; pasada < a.length;
                pasada++) {
            System.out.println(a[pasada]);
        }
    }

    private static void omplirArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
    }
}
