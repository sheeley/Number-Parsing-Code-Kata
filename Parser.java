/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.*;
import java.math.BigInteger;

/**
 *
 * @author jsheeley
 */
public class Parser {

    /**
     * @param args the command line arguments
     */
    public Parser(String filename) throws FileNotFoundException, IOException, NoSuchAlgorithmException {
        File file = new File(filename);
    InputStream is = new FileInputStream(file);
     Reader reader = new InputStreamReader(is);

     Integer[] ints;
    if(true){
        ints = punchCardParse(reader);
        // should lead to c7314d51cd4fe9fd121f2637046a7aec
    } else if(false/* other format */){

    } else if(false/* third format */){

    }

        String output = "";
        int i = 0;
        while(i < ints.length){
            output += ints[i];
            i++;
            if(i % 10 == 0){ output += "\n"; }
        }

        byte[] bytesOfMessage = output.getBytes("UTF-8");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] thedigest = md.digest(bytesOfMessage);
        System.out.println(String.format("%040x", new BigInteger(1, thedigest)));
    }

    public Integer[] punchCardParse(Reader reader) throws IOException {
        int i = 0, c = 0;
        Integer[] ints = new Integer[100];
        while((c = reader.read()) != -1){
            try {
                if(Character.getNumericValue((char)c) != -1){
                    int ch = Character.getNumericValue((char)c);
                    ints[i++] = ch;
                }
            } catch (Exception e){}
        }
        return ints;
    }

    public static void main(String[] args) throws Exception {
        		new Parser(args[0]);
    }
}
