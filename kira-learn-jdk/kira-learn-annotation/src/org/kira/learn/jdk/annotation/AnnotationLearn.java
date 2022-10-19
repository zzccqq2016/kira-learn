package org.kira.learn.jdk.annotation;


import org.kira.learn.jdk.annotation.property.*;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/17 23:29
 */
@TypeAnnotation
public class AnnotationLearn {


    /**
     * <a href="https://www.cnblogs.com/java-chen-hao/p/11024153.html#_label0">...</a>
     */
    public static void main(String[] args) {
        /**
         * @target
         * type             类，接口，枚举     {@link  TypeAnnotation}
         * field            属性             {@link FieldAnnotation}
         * method           方法             {@link MethodAnnotation}
         * parameter        方法形式参数声明   {@link ParameterAnnotation}
         * constructor      构造方法          {@link ConstructorAnnotation}
         * local_variable   局部变量          {@link LocalVariableAnnotation}
         * annotation_type  注解             {@link AnnotationAnnotation}
         * package          包
         */


        /**
         * @Retention
         * SOURCE           注解将被编译器忽略掉
         * CLASS            注解将被编译器记录在class文件中，但在运行时不会被虚拟机保留，这是一个默认的行为
         * RUNTIME          注解将被编译器记录在class文件中，而且在运行时会被虚拟机保留，因此它们能通过反射被读取到
         */
    }

    @FieldAnnotation
    private String field;

    @MethodAnnotation
    public void method() {
    }

    public void parameterMethod(@ParameterAnnotation String parameter) {
    }

    @ConstructorAnnotation
    public AnnotationLearn() {

    }

    public void localVariableMethod() {
        @LocalVariableAnnotation
        String localVariable = "局部变量";
    }


    @AnnotationAnnotation
    @interface Annotation {

    }





}