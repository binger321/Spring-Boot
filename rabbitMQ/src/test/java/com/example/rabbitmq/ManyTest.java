package com.example.rabbitmq;

import com.example.rabbitmq.many.NeoSender;
import com.example.rabbitmq.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private NeoSender neoSender;

	@Autowired
	private NeoSender2 neoSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			neoSender.send(i);
		}
		try{
			Thread thread = Thread.currentThread();
			thread.sleep(1500);//暂停1.5秒后程序继续执行
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//
//	@Test
//	public void manyToMany() throws Exception {
//		for (int i=0;i<100;i++){
//			neoSender.send(i);
//			neoSender2.send(i);
//		}
//	}

}