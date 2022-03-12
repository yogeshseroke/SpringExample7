package uao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bao.DivisionLogic;
import dao.Division;

public class DivisionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("applicationContext");
		BeanFactory bf=new XmlBeanFactory(res);
		Division d=(Division)bf.getBean("div");
		int i=new DivisionLogic().div(d.getNum(),d.getA());
		System.out.println(i);
	}

}
