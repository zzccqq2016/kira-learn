package org.kira.learn.jdk.annotation;

import org.kira.learn.jdk.annotation.property.TypeAnnotation;

import java.util.Objects;

/**
 * @author: Zhang Chaoqing
 * Date: 2022/10/17 23:48
 */
public class ObtainAnnotationLearn {


    public static void main(String[] args) {

        AnnotationLearn annotationLearn = new AnnotationLearn();
        Class<? extends AnnotationLearn> annotationLearnClass = annotationLearn.getClass();
        TypeAnnotation annotation = annotationLearnClass.getAnnotation(TypeAnnotation.class);

    }

}