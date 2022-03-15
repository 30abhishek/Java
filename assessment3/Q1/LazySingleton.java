package Assigments.SpringTask_12March.Q1_LazyEagger;
/*
In lazy loading, loading of object is delayed until it is needed. It enhances efficiency of a program.
Only the needed objects are loaded.
 */
public class LazySingleton {
    private static LazySingleton singleton=null;

     LazySingleton(){
    }

    public static LazySingleton getInstance(){
        if(singleton ==null)
            singleton=new LazySingleton();
        return singleton;
    }
}