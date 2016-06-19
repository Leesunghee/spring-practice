package ex1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

/**
 * Created by sunghee on 2016. 6. 19..
 */
public class MainClass {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();

        try {
            propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
            System.out.println(env.getProperty("admin.id"));
            System.out.println(env.getProperty("admin.pw"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
        gCtx.load("ex1/applicationCTX.xml");
        gCtx.refresh();

        AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
        System.out.println("admin ID : " + adminConnection.getAdminId());
        System.out.println("admin PW : " + adminConnection.getAdminPw());

        gCtx.close();
        ctx.close();
    }
}
