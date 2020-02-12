package com.neuedu.test;

import java.io.*;

/**
 * Created by 86188 on 2020/2/12.
 *
 * 把d盘下的某个文件复制到d:\\a下
 */
public class MyTest6 {
    public static void main(String[] args) {
        File from=new File("D:\\02.source\\01.html\\01.html基础.pdf");
        File parent=new File("D:\\a");
        //判断目录在不在，如果不在就创建这个目录
        if(!parent.exists()){
            parent.mkdirs();
        }
        File to=new File("D:/a/"+from.getName());//复制到a文件
        //把文件里的东西读到内存里，再从内存里写道另一个文件里
        InputStream inputStream=null;
        OutputStream outputStream=null;
        byte[] b=new byte[1024];
        try {
             inputStream=new FileInputStream(from);
             outputStream=new FileOutputStream(to);//读的同时要写到新的文件里，
             int len=inputStream.read(b);//返回长度
            while(len!=-1){

                outputStream.write(b,0,len);//读到什么就往outputStream里些什么,但不可能每个长度都刚好是1024，所以规定范围
                len=inputStream.read(b);//如果不等于-1就接着往下读
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(outputStream!=null)//if下如果只有一行代码的时候，不用加大括号
                    outputStream.close();
                if(inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
