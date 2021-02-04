package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //Kreiranje izlaznog strima za datoteku
        FileOutputStream output = new FileOutputStream("temp.txt");
        // izlazne vrednosti za datoteku
        for(int i =1;i<=10;i++){
            output.write(i);
        }
        // zatvaramo izlazni stream
        output.close();
        // Kreiranje ulaznog strima za datoteku
        FileInputStream input = new FileInputStream("temp.txt");
        // citanje vrednosti iz datoteke
        int value;
        while ((value = input.read())!=-1){
            System.out.print( value + " ");
        }
        // zatvaranje izlaznog toka
        input.close();

    }
}
