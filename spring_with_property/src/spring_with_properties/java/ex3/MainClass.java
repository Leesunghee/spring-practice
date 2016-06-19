package ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sunghee on 2016. 6. 19..
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AdminConnection connection = ctx.getBean("adminConfig", AdminConnection.class);
        System.out.println("adminID : " + connection.getAdminId());
        System.out.println("adminPW : " + connection.getAdminPw());
        System.out.println("sub_adminID : " + connection.getSub_adminId());
        System.out.println("sub_adminPW : " + connection.getSub_adminPw());

        ctx.close();
    }
}
