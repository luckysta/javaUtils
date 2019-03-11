package com.minisun.javautils.designpattern;

/**
 * facade 23 设计模式之一外观模式
 * @author minisun
 *
 *外观模式的目的不是给予子系统添加新的功能接口，而是为了让外部减少与子系统内多个模块的交互，松散耦合，从而让外部能够更简单地使用子系统。
 *
 * 封装交互，简化调用。
 */
public class Facade {

    /**
     * CPU启动关机
     */
    public class CPU {

        public void startup(){
            System.out.println("cpu startup!");
        }

        public void shutdown(){
            System.out.println("cpu shutdown!");
        }
    }

    /**
     * 内存启动关机
     */
    public class Memory{

        public void startup(){
            System.out.println("Memory startup!");
        }

        public void shutdown(){
            System.out.println("Memory shutdown!");
        }
    }

    /**
     * 硬盘启动关机
     */
    public class Disk{

        public void startup(){
            System.out.println("Disk startup!");
        }

        public void shutdown(){
            System.out.println("Disk shutdown!");
        }
    }


    /**
     * 计算机启动关机
     */
    public class Computer {
        private CPU cpu;
        private Memory memory;
        private Disk disk;

        public Computer(){
            cpu = new CPU();
            memory = new Memory();
            disk = new Disk();
        }

        public void startup(){
            System.out.println("start the computer!");
            cpu.startup();
            memory.startup();
            disk.startup();
            System.out.println("start computer finished!");
        }

        public void shutdown(){
            System.out.println("begin to close the computer!");
            cpu.shutdown();
            memory.shutdown();
            disk.shutdown();
            System.out.println("computer closed!");
        }
    }
}
