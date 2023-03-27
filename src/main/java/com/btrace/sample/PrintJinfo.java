package com.btrace.sample;

import static org.openjdk.btrace.core.BTraceUtils.*;
import org.openjdk.btrace.core.annotations.*;

@BTrace
public class PrintJinfo {
    static {
    	println("System Properties:");
    	printProperties();
    	println("VM Flags:");
    	printVmArguments();
    	println("OS Enviroment:");
    	printEnv();
    	exit(0);
    }
}