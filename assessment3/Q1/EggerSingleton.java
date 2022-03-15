package Assigments.SpringTask_12March.Q1_LazyEagger;
/*
When the code is executed, all the resources are initialized. All the related entities are referenced by resource.
 */
public class EggerSingleton {
    private static EggerSingleton eggerSingleton=new EggerSingleton();

    private EggerSingleton(){
    }

    public static EggerSingleton getInstance(){
        return eggerSingleton;
    }
}
