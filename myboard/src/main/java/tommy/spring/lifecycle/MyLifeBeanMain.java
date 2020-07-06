package tommy.spring.lifecycle;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MyLifeBeanMain {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		//FileSystemResource resource = new FileSystemResource("src/main/resources/applicationContext.xml");
		//@SuppressWarnings("deprecation")
		//XmlBeanFactory factory = new XmlBeanFactory(resource);
		//factory.addBeanPostProcessor(new CustomBeanPostProcessor());
		MyLifeBean bean = (MyLifeBean)factory.getBean("myLifeBean");
		bean.sayHello();
		factory.close();
		//factory.destroyBean("myLifeBean", bean);
	}
}
