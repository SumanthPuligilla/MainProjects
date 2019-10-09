/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in10s.home;

/**
 *
 * @author Administrator
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pavankumar
 */
// Java program to split a file in multiple files.
import java.io.*;
import java.util.Scanner;

public class gg {

    public static void main(String[] args) throws IOException {
        try {

            // read file and get no. of files to be generated
            String inputfile = "D:\\RPT\\Logs\\03-10-2019\\Reports_03-10-2019-11_0.log";

            // No. of lines to be split and saved in each
            double nol = 1000.0;
            
            File file = new File(inputfile);
            Scanner scanner = new Scanner(file);
            
            int count = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }

            // display no. of lines in the input file.
            System.out.println("Lines in the file: " + count);

            double temp = (count / nol);
            int temp1 = (int) temp;
            System.out.println("temp"+temp+"  temp1"+temp1);
            int nof = 0;
            if (temp1 == temp) {
                nof = temp1;
            } else {
                nof = temp1 + 1;
            }
            System.out.println("No. of files to be generated :" + nof);

            // splitting of file into multiple files
            FileInputStream fstream = new FileInputStream(inputfile);
            DataInputStream in = new DataInputStream(fstream);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            for (int j = 1; j <= nof; j++) {

                // location of new file
                FileWriter fstream1 = new FileWriter("D:\\RPT\\Logs\\03-10-2019\\spfile" + j + ".log");
                BufferedWriter out = new BufferedWriter(fstream1);
                for (int i = 1; i <= nol; i++) {
                    strLine = br.readLine();
                    if (strLine != null) {
                        out.write(strLine);
                        if (i != nol) {
                            out.newLine();
                        }
                    }
                }
                out.close();
            }

            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}