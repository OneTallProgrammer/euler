/**
 * Created by joseph on 6/23/17.
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem11 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int largest = 0;

        readInFile(matrix);
        //printTwoDimArrayList(matrix);
        //System.out.println(findLargestRowMultiple(matrix));
        //System.out.println(findLargestColMultiple(matrix));
        //System.out.println(findLargestDiagMultRight(matrix));
        //System.out.println(findLargestDiagMultLeft(matrix));

        int challenger;

        challenger = findLargestRowMultiple(matrix);
        if(challenger > largest){
            largest = challenger;
        }
        challenger = findLargestColMultiple(matrix);
        if(challenger > largest){
            largest = challenger;
        }
        challenger = findLargestDiagMultLeft(matrix);
        if(challenger > largest){
            largest = challenger;
        }
        challenger = findLargestDiagMultRight(matrix);
        if(challenger > largest){
            largest = challenger;
        }

        System.out.println("Largest multiple of 4 adjacent numbers: " + largest);

    }

    public static void readInFile(ArrayList<ArrayList<Integer>> matrix){
        String filePath = "numberGrid.txt";
        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);

            String line;
            while(fileScanner.hasNextLine()){
                line = fileScanner.nextLine();
                StringTokenizer strT = new StringTokenizer(line, " ");
                ArrayList<Integer> newRow = new ArrayList<>();
                while(strT.hasMoreTokens()){
                    newRow.add(Integer.parseInt(strT.nextToken()));
                }

                matrix.add(newRow);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void printTwoDimArrayList(ArrayList<ArrayList<Integer>> matrix){
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix.get(i).size(); j++){
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static int findLargestRowMultiple(ArrayList<ArrayList<Integer>> matrix){
        int largest = 0;

        for(int row = 0; row < matrix.size(); row++){
            for(int col = 0; col < matrix.get(row).size() - 3; col++){
                int a = matrix.get(row).get(col);
                int b = matrix.get(row).get(col + 1);
                int c = matrix.get(row).get(col + 2);
                int d = matrix.get(row).get(col + 3);

                int newMult = a * b * c * d;

                if(newMult > largest){
                    largest = newMult;

                    //System.out.println("col: " + col + " row: " + row + " " +
                    //        a + " " + b + " " + c + " " + d + " " + newMult);
                }
            }
        }

        return largest;
    }

    private static int findLargestColMultiple(ArrayList<ArrayList<Integer>> matrix) {
        int largest = 0;

        for(int row = 0; row < matrix.size() - 3; row++){
            for(int col = 0; col < matrix.get(row).size(); col++){
                int a = matrix.get(row).get(col);
                int b = matrix.get(row + 1).get(col);
                int c = matrix.get(row + 2).get(col);
                int d = matrix.get(row + 3).get(col);

                int newMult = a * b * c * d;

                if(newMult > largest){
                    largest = newMult;

//                    System.out.println("col: " + col + " row: " + row + " " +
//                            a + " " + b + " " + c + " " + d + " " + newMult);
                }
            }
        }

        return largest;
    }

    private static int findLargestDiagMultRight(ArrayList<ArrayList<Integer>> matrix) {
        int largest = 0;

        for(int row = 0; row < matrix.size() - 3; row++){
            for(int col = 0; col < matrix.get(row).size() - 3; col++){
                int a = matrix.get(row).get(col);
                int b = matrix.get(row + 1).get(col + 1);
                int c = matrix.get(row + 2).get(col + 2);
                int d = matrix.get(row + 3).get(col + 3);

                int newMult = a * b * c * d;

                if(newMult > largest){
                    largest = newMult;

//                    System.out.println("col: " + col + " row: " + row + " " +
//                            a + " " + b + " " + c + " " + d + " " + newMult);
                }
            }
        }

        return largest;
    }

    private static int findLargestDiagMultLeft(ArrayList<ArrayList<Integer>> matrix) {
        int largest = 0;

        for(int row = 0; row < matrix.size() - 3; row++){
            for(int col = 3; col < matrix.get(row).size(); col++){
                int a = matrix.get(row).get(col);
                int b = matrix.get(row + 1).get(col - 1);
                int c = matrix.get(row + 2).get(col - 2);
                int d = matrix.get(row + 3).get(col - 3);

                int newMult = a * b * c * d;

                if(newMult > largest){
                    largest = newMult;

//                    System.out.println("col: " + col + " row: " + row + " " +
//                            a + " " + b + " " + c + " " + d + " " + newMult);
                }
            }
        }

        return largest;
    }


}
