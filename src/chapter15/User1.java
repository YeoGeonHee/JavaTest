package chapter15;

import java.io.Serializable;

public class User1 implements Serializable { /**
     * 
     */
    private static final long serialVersionUID = 1L;
// 직렬화 가능
    private String id;
    private String passwd;
    private transient int age; // 나이는 제외
    private String name;
    public User1(String id, String passwd, int age,String name) {
        super();
        this.id = id;
        this.passwd = passwd;
        this.age = age;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
    	return "아이디 = " + id + ", 이름 = " + name + ", 나이 = " + age
                + ", 비밀번호 = " + passwd;
    
    }
    
}