import javax.swing.*;

public class Matrix {
    private int dimensao=4;
    private int[][] matriz = {{1,5,3,2},{4,8,-5,6},{7,3,4,5},{2,5,9,-9}};

    /**
     * Construtor padrão, utilizará a matriz padrão
     */
    public Matrix(){    }

    /**
     * Contrutor para definir nova matriz
     * @param i variável do tipo inteiro que vai definir a dimensão da matriz[i][i]
     */
    public Matrix (int i){
        setDimensao(i);
        setMatriz(matriz);
    }

    public int[][] getMatriz(){
        return matriz;
    }

    public void setDimensao(int i) {
        this.dimensao = i;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setMatriz(int[][] matriz) {
        JOptionPane.showMessageDialog(null,"Popule sua matriz.");
        matriz = new int[getDimensao()][getDimensao()];
        for(int u=0; u<getDimensao(); u++){
            for(int z=0; z<getDimensao(); z++){
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro para posicao ["+u+"]["+z+"]"));
                matriz[u][z]=valor;
            }
        }
        this.matriz = matriz;
    }

    public int diagonalUm(int[][] mtx){
        int soma=0;
        for(int i=0; i<getDimensao(); i++){
            soma+=mtx[i][i];
        }
        return soma;
    }

    public int diagonalDois(int[][] mtx){
        int soma=0,u=getDimensao()-1;
        for(int i=0; i<getDimensao(); i++){
            soma+=mtx[u][i];
            u--;
        }
        return soma;
    }

    public int diffDiagonal(int[][] mtx){
        int dif, diagonalUm, diagonalDois;

        diagonalUm = diagonalUm(mtx);
        diagonalDois = diagonalDois(mtx);

        dif = diagonalUm - diagonalDois;
        return dif;
    }

    @Override
    public String toString() {
        String matrix = "A matriz usada é: \n";
        for(int i=0;i<getDimensao();i++){
            for (int u=0;u<getDimensao();u++){
                matrix += matriz[i][u] + "   ";
            }
            matrix += "\n";
        }
        return matrix;
    }
}
