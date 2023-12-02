package com.github.junit;

public @interface EnabledIfEnviromentVariable {

	String named();

	String matches();

}
