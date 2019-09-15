package co.edureka.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println("**************************");
		System.out.println(">> afterReturning executed");
		System.out.println(">> method: "+method.getName());
		System.out.println(">> inputs: "+inputs[0]+" "+inputs[1]);
		System.out.println(">> beanRef: "+beanRef);
		System.out.println("**************************");
		
		
		
		Order order = (Order)beanRef;
		
		if(!order.isStatus()) {
			System.out.println(">> Thank You !! Please come back again when we have Stock :)");
		}else {
			System.out.println(">> Email Sent to Customer with Invoice");
		}
		
		System.out.println();
		
	}

}
