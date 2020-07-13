package com.hx.phitab.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

/**
 * 重置bean名称生成策略，可以不同包同名策略
 * @author ChenJiaHe
 * @Date 2020-06-30
 */
public class UniqueNameGenerator extends AnnotationBeanNameGenerator {

    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        //全限定类名
        String beanName = definition.getBeanClassName();
        return beanName;
    }
}