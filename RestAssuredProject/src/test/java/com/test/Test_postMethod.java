package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Test_postMethod {
	
	@Test
	public void test01() {
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("name", "Aly");
		map.put("job","Tester");		
	}

}
