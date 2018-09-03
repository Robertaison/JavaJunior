public class Main {
    public static void main(String[] args){
        int[][] matriz;
        Matrix matrix = new Matrix();
        matriz = matrix.getMatriz();

        int dif = matrix.diffDiagonal(matriz);
        System.out.println(matrix);
        System.out.println(dif);
    }
}
