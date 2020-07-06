package tommy.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		/**
		 * Set�� �ߺ������͸� ������� ����!
		 */
		Set<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address);
		}
		/**
		Properties addressList = bean.getAddressList();
		for(String key : addressList.stringPropertyNames()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)));
		}
		/**
		Map<String, String> addressList = bean.getAddressList();
		for(String key : addressList.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, addressList.get(key)));
		}
		*/
		/**
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		factory.close();
		*/
	}
}
