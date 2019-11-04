/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author arief ali
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int matrix[][] = new int[4][4];
        matrix[0][0] = 2;
        matrix[0][1] = 4;
        matrix[0][2] = 6;
        matrix[0][3] = 8;
        matrix[1][0] = 3;
        matrix[1][1] = 9;
        matrix[1][2] = 27;
        matrix[1][3] = 30;
        matrix[2][0] = 4;
        matrix[2][1] = 16;
        matrix[2][2] = 20;
        matrix[2][3] = 24;
        matrix[3][0] = 15;
        matrix[3][1] = 25;
        matrix[3][2] = 35;
        matrix[3][3] = 45;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }       
            System.out.println();
        }
    }
    
}
