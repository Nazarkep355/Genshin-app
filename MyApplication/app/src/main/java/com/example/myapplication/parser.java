package com.example.myapplication;

import android.util.Log;

import java.io.*;
import java.net.HttpURLConnection;
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



    static public String FindinfoRU(String url, String starts, String ends)
    {
        String res = "";
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
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
        start = tmp.indexOf("</tr>\n" +
                "<tr>");
        end = tmp.indexOf("</td></tr>\n" +
                "<tr>\n" +
                "<td><a href");
        tmp = tmp.substring(start,end);
        while (tmp.contains("<")&&tmp.contains(">")){
            start = tmp.indexOf("<");
            end = tmp.indexOf(">");
            if(start==0){
                tmp= tmp.substring(end+1);
            }
            else tmp = tmp.substring(0,start)+ tmp.substring(end+1);
        }

        res = tmp.trim();
        return res;
    }


    static public String FindelRu(String url){
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
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
        int i = tmp.indexOf("<h3 class=\"pi-data-label pi-secondary-font\">Элемент</h3>");
        tmp= tmp.substring(i);
        i = tmp.indexOf("title");
        tmp = tmp.substring(i, tmp.indexOf("\"><img alt"));
        tmp= tmp.substring(tmp.indexOf("=")).substring(2);
        return tmp;
    }


    static  public String FindelEn(String url){
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            input = new BufferedInputStream(new URL(url).openStream());

            byte data[] = new byte[1024];
            int count;


            while ((count = input.read(data,0,1024)) != -1) {
                buffer.write(data, 0, count);
                buffer.flush();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Error   MalError");
            Log.d("Error","MalError");
        } catch (IOException e) {
            System.out.println("\"Error\",\"IOError\"");
            e.printStackTrace();
            Log.d("Error","IOError");
        }finally {try {


            input.close();} catch (Exception e) {
            e.printStackTrace();
        }
        }
        byte[]  byteArray = buffer.toByteArray();
        tmp= new String(byteArray, StandardCharsets.UTF_8);
        int i = tmp.indexOf("<td class=\"pi-horizontal-group-item pi-data-value pi-font pi-border-color pi-item-spacing\" data-source=\"element\"><span style");
        tmp= tmp.substring(i);
        i = tmp.indexOf("title");
        tmp = tmp.substring(i, tmp.indexOf("\"><img alt"));
        tmp= tmp.substring(tmp.indexOf("=")).substring(2);
        return tmp;
    }

    static public String FindinfoEn(String url, String starts, String ends)
    {
        String res = "";
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
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
        start = tmp.indexOf("<td colspan=\"3\" style=\"text-align:left;\">");
        end = tmp.indexOf("<div class=\"mw-collapsible mw-collapsed\" data-expandtext");
        tmp = tmp.substring(start,end);
        while (tmp.contains("<")&&tmp.contains(">")){
            start = tmp.indexOf("<");
            end = tmp.indexOf(">");
            if(start==0){
                tmp= tmp.substring(end+1);
            }
            else tmp = tmp.substring(0,start)+ tmp.substring(end+1);
        }

        res = tmp.trim();
        return res;
    }
    static public String FindpassiveEn(String url, String starts, String ends)
    {
        String res = "";
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
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
        start = tmp.indexOf("<td colspan=\"3\" style=\"text-align:left;\">");
        end = tmp.indexOf("</td></tr><tr><td style=\"width: 45px\">");
        tmp = tmp.substring(start,end);
        while (tmp.contains("<")&&tmp.contains(">")){
            start = tmp.indexOf("<");
            end = tmp.indexOf(">");
            if(start==0){
                tmp= tmp.substring(end+1);
            }
            else tmp = tmp.substring(0,start)+ tmp.substring(end+1);
        }


        res = tmp.trim();
        return res;
    }
    static public String FindUtpassEn(String url)
    {
        String res = "";
        String tmp = "";
        BufferedInputStream input =null;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
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

        int start = tmp.indexOf("Utility Passive</a>");
        int end = tmp.indexOf("<h4><span class=\"mw-headline\" id=\"Talent_Upgrade\">");


        tmp = tmp.substring(start,end);
        start = tmp.indexOf("<td colspan=\"3\" style=\"text-align:left;\">");
        if(tmp.contains("<div class=\"mw-collapsible mw-collapsed\""))
            end = tmp.indexOf("<div class=\"mw-collapsible mw-collapsed\"");
        else { tmp = tmp.substring(start);
            end = tmp.indexOf("</td></tr></tbody></table>");
            tmp.substring(0,end);}
        tmp = tmp.substring(start,end);
        int count =0;
        while (tmp.contains("<")&&tmp.contains(">")){
            start = tmp.indexOf("<");
            end = tmp.indexOf(">");
            if(start==0){
                tmp= tmp.substring(end+1);
            }
            else if(end>start)tmp = tmp.substring(0,start)+ tmp.substring(end+1);
            else tmp = tmp.substring(end+1);
            count++;
            if(count>20)break;
        }
        res = tmp.trim();
        return res;
    }


    static  public String FindelEnhttp(String url){
        String tmp = "";
        URL ur;
        InputStream in;
        HttpURLConnection urlConnection = null;
        ByteArrayOutputStream buffer  = new ByteArrayOutputStream();
        try {ur = new URL(url);
            urlConnection = (HttpURLConnection) ur.openConnection();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            byte data[] = new byte[1024];
            int count;

            while ((count = is.read(data,0,1024)) != -1) {
                buffer.write(data, 0, count);
                buffer.flush();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("MalformedURLException");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        } finally {
            urlConnection.disconnect();
        }

        byte[]  byteArray = buffer.toByteArray();
        tmp= new String(byteArray, StandardCharsets.UTF_8);
        int i = tmp.indexOf("<td class=\"pi-horizontal-group-item pi-data-value pi-font pi-border-color pi-item-spacing\" data-source=\"element\"><span style");
        tmp= tmp.substring(i);
        i = tmp.indexOf("title");
        tmp = tmp.substring(i, tmp.indexOf("\"><img alt"));
        tmp= tmp.substring(tmp.indexOf("=")).substring(2);
        return tmp;
    }

    static  public String createListHttp(){
        String tmp = "";
        URL ur;
        InputStream in;
        HttpURLConnection urlConnection = null;
        ByteArrayOutputStream buffer  = new ByteArrayOutputStream();
        try {ur = new URL("https://genshin-impact.fandom.com/wiki/Characters/List");
            urlConnection = (HttpURLConnection) ur.openConnection();
            InputStream is = new BufferedInputStream(urlConnection.getInputStream());
            byte data[] = new byte[1024];
            int count;

            while ((count = is.read(data,0,1024)) != -1) {
                buffer.write(data, 0, count);
                buffer.flush();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("MalformedURLException");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");

        } finally {
            urlConnection.disconnect();
        }
        byte[]  byteArray = buffer.toByteArray();
        tmp= new String(byteArray, StandardCharsets.UTF_8);


        return tmp;
    }


    static public Character[] createlist(String tmp){
        int start = tmp.indexOf("</th></tr>\n" +
                "<tr>\n" +
                "<td><a href=\"/wiki/");
        tmp = tmp.substring(start);
        Character[] list = new Character[46];
        for(int i=0;i<46;i++) {


            String name;
            String rarity;
            String element;
            tmp = tmp.substring(tmp.indexOf("</td>"));
            tmp = tmp.substring(tmp.indexOf("title=\""));
            tmp = tmp.substring(tmp.indexOf('"') + 1);
            name = tmp.substring(0, tmp.indexOf("\""));
            tmp = tmp.substring(tmp.indexOf("alt="));
            rarity = tmp.substring(tmp.indexOf('"') + 1, tmp.indexOf("\" "));
            tmp = tmp.substring(tmp.indexOf("</td>"));
            tmp = tmp.substring(tmp.indexOf("title=\""));
            tmp = tmp.substring(tmp.indexOf('"') + 1);
            element = tmp.substring(0, tmp.indexOf('"'));
            tmp = tmp.substring(tmp.indexOf("</td>"));
            tmp = tmp.substring(tmp.indexOf("td></tr>\n" +
                    "<tr>\n" +
                    "<td><a "));
            list[i] = new Character(name);
            list[i].setElement(element);
            list[i].setRarity(rarity);}
        return list;
    }

}
