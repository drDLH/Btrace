package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;

@BTrace
public class PrintRegex {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="/.*/"
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println();
    }
}
