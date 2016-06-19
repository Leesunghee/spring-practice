package ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sunghee on 2016. 6. 19..
 */
public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ex2/applicationCTX.xml");

        AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
        System.out.println("adminID : " + connection.getAdminId());
        System.out.println("adminPW : " + connection.getAdminPw());
        System.out.println("sub_adminID : " + connection.getSub_adminId());
        System.out.println("sub_adminPW : " + connection.getSub_adminPw());

        ctx.close();
    }
}
