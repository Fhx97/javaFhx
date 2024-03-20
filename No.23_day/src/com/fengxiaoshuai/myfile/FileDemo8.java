package com.fengxiaoshuai.myfile;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class FileDemo8 {
    // 统计一个文件夹中每种文件的个数并打印
    public static void main(String[] args) {
        File files = new File("C:\\");
        HashMap<String,Integer> filesMap = new HashMap<>();
        filesMap.put(".txt",0);
        filesMap.put(".jpg",0);
        filesMap.put(".doc",0);
        System.out.println(staticFile(files,filesMap));
    }
    public static HashMap<String,Integer> staticFile(File src,HashMap<String,Integer> fileMap){
        File[] files = src.listFiles();
        Set<String> set = fileMap.keySet();
        if(files != null) {
            for (File file : files) {
                if(file.isFile()){
                    for (String s : set) {
                        if (file.getName().endsWith(s)){
                            fileMap.put(s,fileMap.get(s)+1);
                        }
                    }
                }else{
                    staticFile(file,fileMap);
                }


            }
        }
        return fileMap;
        
    }

}
