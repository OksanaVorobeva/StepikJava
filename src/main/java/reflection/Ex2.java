package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class employeeClass = Class.forName("reflection.Employee");

        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee obj1 = constructor.newInstance();

        Constructor constructor1 = employeeClass.getConstructor(int.class,
                String.class, String.class);
        Object obj2 = constructor1.newInstance(5, "Zaur", "IT");
        System.out.println(obj2);
        System.out.println("_____");

       /* Method method= employeeClass.getMethod("setSalary");
        method.invoke(obj2,800.88);
        System.out.println(obj2);*/

    }
}
