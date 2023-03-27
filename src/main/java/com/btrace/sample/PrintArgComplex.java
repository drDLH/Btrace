package com.btrace.sample;
import java.lang.reflect.Field;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;

import com.springboot.chapter2.main.User;


@BTrace
public class PrintArgComplex {
	
	
	@OnMethod(
	        clazz="com.springboot.chapter2.main.BtraceController",
	        method="arg2",
	        location=@Location(Kind.ENTRY)
	)
	public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, User user) {
		println("classname: "+pcn);
		println("methodname: "+pmn);
		
		//print all fields
		println("print all fields of User: ");
		printFields(user);
		//print one field
		println("print one field of User: ");
		Field filed2 = field("com.springboot.chapter2.main.User", "name");
		println(get(filed2, user));
		println();
    }
}
