package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;
import org.openjdk.btrace.core.types.AnyType;

@BTrace
public class PrintConstructor {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.User",
	        method="<init>"
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] args) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("print the input parameters of the constructor: ");
		printArray(args);
		println();
    }
}
