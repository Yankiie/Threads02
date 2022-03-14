package Controller;
import Main.VetMat;

public class Thread {
        public static void main(String[] args) {
            int[][] matriz = new int [3][5];
            int[]vetor1 = new int [5];
            int[]vetor2 = new int [5];
            int[]vetor3 = new int [5];

            for (int Linha = 0; Linha < 3; Linha++){
                for (int Coluna = 0; Coluna < 3; Coluna++){
                    matriz[Linha][Coluna] = (int) (Math.random()*101);
                }
            }
            for (int Linha = 0; Linha < 3; Linha++){
                for (int Coluna = 0; Coluna < 3; Coluna++){
                    if (Linha == 0){
                        vetor1[Coluna] = matriz[Linha][Coluna];
                        }  else if (Linha == 1){
                            vetor2[Coluna] = matriz[Linha][Coluna];
                        }  else if (Linha == 2){
                            vetor3[Coluna] = matriz[Linha][Coluna];
                        }
                    }
                }
                    for (int operador = 0; operador < 3; operador++){
                        VetMat VetMat = new VetMat(vetor1, vetor2, vetor3, operador);
                        VetMat.start();
        }
    }
}

