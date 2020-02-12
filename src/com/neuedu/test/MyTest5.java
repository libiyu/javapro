package com.neuedu.test;

import java.io.*;

/**
 * Created by 86188 on 2020/2/12.
 */
public class MyTest5 {
    public static void main(String[] args) {
        int a=10;
        Student student=new Student();
        //给student赋值
        student.setId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("卓越1班");
       //字节输出流
        /*outputStream是抽象类，不能实例化，不能new  outputStream
        * 那就new它的子类,即FileOutputStream()
        *File file=new File("写文件的路径");
        *
        *
        * 字节输出流
        * */
        File file=new File("d:/Test.java");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.isDirectory());
        //  OutputStream outputStream=new FileOutputStream()
        try {
            OutputStream outputStream=new FileOutputStream(file);
            //往里写东西
            String b="sdfgfdgfgxgh";

            outputStream.write( b.getBytes());//是把字符串改成字节数组，内容传送到传输管道上面
            outputStream.flush();//吧管道里的内容压入到文件里边
            outputStream.close();//结束之后一定要关闭
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream inputStream=null;
        try {
             inputStream=new FileInputStream(file);
            byte[] c = new byte[10];
            int d=inputStream.read(c);
            while(d!=-1){
                System.out.println(new String(c));
                d=inputStream.read(c);
            }
          //  System.out.println(inputStream.read(c));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (inputStream!=null) {
                    inputStream.close();//读完之后一定得关闭
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




        //一行一行的读
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("11111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
