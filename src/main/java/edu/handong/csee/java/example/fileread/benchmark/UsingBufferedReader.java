package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

/**
 * Created by sherxon on 4/23/17. https://github.com/sherxon/AlgoDS/tree/master/src/oi
 */
public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {

    	String fileName_1 = args[0];
    	String fileName_2 = args[1];
    	
        //-------------- Test reading 1 MB file. --------------------

        StopWatch.start();

        BufferedReader inputStream= new BufferedReader(new FileReader(fileName_1));
        while (inputStream.read()!=-1){}

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");
        
        inputStream.close();


        //-------------- Test reading 10 MB file. --------------------

        StopWatch.start();

        BufferedReader inputStream2= new BufferedReader(new FileReader(fileName_2));
        while (inputStream2.read()!=-1){}

        long duration2 = StopWatch.stop();
        System.out.println(duration2 + " milsec");

        inputStream2.close();

        /*
        //-------------- Test reading 100 MB file. --------------------

        StopWatch.start();

        BufferedReader inputStream3= new BufferedReader(new FileReader(DumpDataWriter.input100MB));
        while (inputStream3.read()!=-1){}

        long duration3 = StopWatch.stop();
        System.out.println(duration3 + " milsec");
        
        inputStream3.close();


        //-------------- Test reading 1000 MB file. --------------------


        StopWatch.start();

        BufferedReader inputStream4= new BufferedReader(new FileReader(DumpDataWriter.input1000MB));
        while (inputStream4.read()!=-1){}

        long duration4 = StopWatch.stop();
        System.out.println(duration4 + " milsec");
        
        inputStream4.close();
        */
    }
}
