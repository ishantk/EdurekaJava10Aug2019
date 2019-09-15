package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println(">> postProcess.AFTER.Initialization");
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanId) throws BeansException {
		System.out.println(">> postProcess.BEFORE.Initialization");
		return beanRef;
	}

}
