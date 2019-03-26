package com.minisun.javautils.utils.stringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

public class bitmap {
    public static final int _1MB = 1024 * 1024;
    public static byte[] flags = new byte[ 512 * _1MB ];



    public int[] removeDuplicates(int[] array) {
        int index = 0;
        Map<Integer, Boolean> maps = new LinkedHashMap<Integer, Boolean>();
        for(int num : array) {
            if(!maps.containsKey(num)) {
                array[index] = num;
                index++;
                maps.put(num, true);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        //待判重数据
        int[] array = {255, 1024, 0, 65536, 255};

        int index = 0;
        for(int num : array) {
            if(!getFlags(num)) {
                //未出现的元素
                array[index] = num;
                index = index + 1;
                //设置标志位
                setFlags(num);
                System.out.println("set " + num);
            } else {
                System.out.println(num + " already exist");
            }
        }
    }

    public static void setFlags(int num) {
        //使用每个数的低三位作为byte内的映射
        //例如: 255 = 0x11111111
        //低三位(也就是num & (0x07))为0x111 = 7, 则byte的第7位为1, 表示255已存在
        flags[num >> 3] |= 0x01 << (num & (0x07));
    }

    public static boolean getFlags(int num) {
        return (flags[num >> 3] >> (num & (0x07)) & 0x01) == 0x01;
    }
}
