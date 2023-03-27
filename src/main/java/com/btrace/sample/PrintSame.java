package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;

@BTrace
public class PrintSame {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="same"
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, String name) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("the input parameters are: " + name);
		println();
    }
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="same"
	)
	public static void anyRead1(@ProbeClassName String pcn, @ProbeMethodName String pmn, String name, int id) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("the input parameters are: " + name + "," + id);
		println();
    }
}
