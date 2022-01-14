package com.example.myapplication;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class parser {

    static public void Copytofile(String url){

        FileOutputStream fout =null;
        BufferedInputStream input =null;
        try {
            fout = new FileOutputStream("src/text.txt");
            input = new BufferedInputStream(new URL(url)
                    .openStream());
            byte data[] = new byte[1024];
            int count;

            while ((count = input.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, 1024);
                fout.flush();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {try {


            input.close();} catch (IOException e) {
            e.printStackTrace();
        }
        }
    }



    static public String Findinfo(String url, String starts, String ends)
    {
        String res = "";
        String tmp = "";
        FileOutputStream fout =null;
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            fout = new FileOutputStream("src/text.txt");
            input = new BufferedInputStream(new URL(url).openStream());

            byte data[] = new byte[1024];
            int count;

            while ((count = input.read(data,0,1024)) != -1) {
                buffer.write(data, 0, count);
                buffer.flush();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {try {


            input.close();} catch (IOException e) {
            e.printStackTrace();
        }
        }
        byte[]  byteArray = buffer.toByteArray();
        tmp= new String(byteArray, StandardCharsets.UTF_8);

        int start = tmp.indexOf(starts);
        int end = tmp.indexOf(ends);


        tmp = tmp.substring(start,end);
        start = tmp.indexOf("</b><br />");
        end = tmp.indexOf("</p>");
        tmp = tmp.substring(start,end);
        while (tmp.contains("<")){
            start = tmp.indexOf("<");
            end = tmp.indexOf(">");
            if(start==0){
                tmp= tmp.substring(end+1);
            }
            else tmp = tmp.substring(0,start)+ tmp.substring(end+1);
        }

        res =tmp;

        return res;
    }
}
