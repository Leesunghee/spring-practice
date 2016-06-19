package ex2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by sunghee on 2016. 6. 19..
 */
public class AdminConnection extends ex3.AdminConnection implements InitializingBean, DisposableBean {

    private String adminId;
    private String adminPw;
    private String sub_adminId;
    private String sub_adminPw;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPw() {
        return adminPw;
    }

    public void setAdminPw(String adminPw) {
        this.adminPw = adminPw;
    }

    public String getSub_adminId() {
        return sub_adminId;
    }

    public void setSub_adminId(String sub_adminId) {
        this.sub_adminId = sub_adminId;
    }

    public String getSub_adminPw() {
        return sub_adminPw;
    }

    public void setSub_adminPw(String sub_adminPw) {
        this.sub_adminPw = sub_adminPw;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AdminConnection.afterPropertiesSet");
    }
}
