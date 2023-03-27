package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;
import org.openjdk.btrace.core.types.AnyType;

@BTrace
public class PrintDuration {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="arg1",
            location = @Location(value = Kind.RETURN)
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, 
			@Duration long duration, AnyType[] args) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("the input parameters are: ");
		printArray(args);
		println("cost time: " + duration);
		println();
    }
}
