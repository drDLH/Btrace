package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;

@BTrace
public class PrintLine {
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="exception",
	        location=@Location(value=Kind.LINE, line=40)
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, int line) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		println("the executed line: " +line);
		println();
    }
}
