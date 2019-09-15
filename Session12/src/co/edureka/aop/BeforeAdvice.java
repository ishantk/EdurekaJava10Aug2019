package co.edureka.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println("**************************");
		System.out.println(">> before executed");
		System.out.println(">> method: "+method.getName());
		System.out.println(">> inputs: "+inputs[0]+" "+inputs[1]);
		System.out.println(">> beanRef: "+beanRef);
		System.out.println("**************************");
		
		if(Util.iPhoneStock==0) {
			System.out.println(">> Order can be Processed :)");
			
			// Getting the reference of Order Object
			Order order = (Order)beanRef;
			order.status = false; // Set the status to false
			
		}
		
		System.out.println();
		
	}

}
