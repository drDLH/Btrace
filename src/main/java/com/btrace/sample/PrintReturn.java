package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;
import org.openjdk.btrace.core.types.AnyType;

@BTrace
public class PrintReturn {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="arg1",
	        location=@Location(Kind.RETURN)
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, @Return AnyType result) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("the return value of the method: "+result);
		println();
    }
}