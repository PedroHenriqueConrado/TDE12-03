public class TDE02x02 {

    public static void main(String[] args){

        int [][] matriz = new int[3][3];

        int valor = 1;
        for(int i = 0; i< matriz.length; i++){
            for( int j =0; j < matriz.length; j++){
                matriz[i][j] = valor++;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
