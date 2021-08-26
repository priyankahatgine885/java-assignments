package reflection;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {
    public static void main(String[] args) {
        File fc = new File("");
        Class<?> reference = fc.getClass();
        Reflection.printTypeInfo(reference);
        System.out.println("---------------------------");
        Reflection.printFiledInfo(reference);
        System.out.println("---------------------------");
        Reflection.printconstructorInfo(reference);
        System.out.println("---------------------------");
        Reflection.printMethodsInfo(reference);

    }
    private static void printMethodsInfo(Class<?> c) {
        if (c != null) {
            Method[] methods = c.getMethods();
            for (Method f : methods) {
                //System.out.println(f.toString());
                // System.out.println(f.toString());
                int mod = f.getModifiers();
                System.out.print(Modifier.toString(mod) + " ");
                System.out.print(f.getReturnType() + " ");
                System.out.println(f.getName());
            }
        }

    }
    private static void printconstructorInfo(Class<?> c) {
        if (c != null) {
            Constructor<?>[] constructors = c.getConstructors();
            for (Constructor<?> f : constructors) {
                System.out.println(f.toString());
            }
        }

    }
    private static void printFiledInfo(Class<?> c) {
        if (c != null) {
            Field[] field = c.getFields();
            for (Field f : field) {
                int mod = f.getModifiers();
                System.out.print(Modifier.toString(mod) + " ");
                System.out.print(f.getType() + " ");
                System.out.println(f.getName());
            }
        }

    }
    private static void printTypeInfo(Class<?> c) {
        if (c != null) {
            System.out.println("Package Name :" + c.getPackageName());
            System.out.println("Fully Qualified Class Name :" + c.getName()); // java.io.File
            System.out.println("Class Name :" + c.getSimpleName());
        }
    }
}
