package utils;

import java.awt.*;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Liaozhiwei
 * @Date: 2019/11/23 16:45
 */
public class JVMDemo {

    /**
     * JVM内存分配测试
     * 堆内存30M|Yong10M(Eden8M,from1M,to1M)|Old20M
     * 初始堆大小:-Xms30m 最大堆大小:-Xmx30m
     * 让虚拟机在发生内存溢出时 Dump 出当前的内存堆转储快照，以便分析用:-XX:+HeapDumpOnOutOfMemoryError
     * 打印 GC 信息:-XX:+PrintGCDetails
     * 永久代(方法区)的最大值:-XX:MaxPermSize=20M
     * -XX:MaxPermSize=20M -Xms30m -Xmx30m -XX:+HeapDumpOnOutOfMemoryError -XX:+PrintGCDetails -XX:HeapDumpPath=C:\Users\Administrator\Desktop\error_logs
     */

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(100);
        int i = 1;
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println("初始化堆的当前内存使用量:"+memoryMXBean.getHeapMemoryUsage());
//        System.out.println("初始化非堆内存的当前内存使用量:"+memoryMXBean.getNonHeapMemoryUsage());
        try {
            Thread.sleep(980);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            list.add(new OneM());//增加1M
//            System.out.println("非堆内存的当前内存使用量:"+memoryMXBean.getNonHeapMemoryUsage());
            System.out.println("堆内存的当前内存使用量:"+memoryMXBean.getHeapMemoryUsage());
            System.out.println(i++);
        }
    }
}
