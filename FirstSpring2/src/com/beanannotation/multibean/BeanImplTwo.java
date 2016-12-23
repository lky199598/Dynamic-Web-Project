package com.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component  //一个通用注解，可用于任何bean
public class BeanImplTwo implements BeanInterface {

}
