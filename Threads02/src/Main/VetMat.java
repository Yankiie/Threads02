package Main;

public class VetMat extends Thread{
    private int[] vetor1 = new int[5];
    private int[] vetor2 = new int[5];
    private int[] vetor3 = new int[5];
    private int operator;

    public VetMat(int[] vetor1, int[] vetor2, int[] vetor3, int operator){
            this.vetor1 = vetor1;
            this.vetor2 = vetor2;
            this.vetor3 = vetor3;
            this.operator = operator;
    }

    public void run(){
        int resultado = 0;
        for (int i = 0; i < 5; i++){
            switch(operator){
                case 0:
                    resultado = vetor1[i] + resultado;
                    break;
                case 1:
                    resultado = vetor2[i] + resultado;
                    break;
                case 2:
                    resultado = vetor3[i] + resultado;
            }
        }
                System.out.println("O Resultado da " +(operator+1)+ "o linha é = "+resultado);
    }
}
