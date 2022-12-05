package com.atguigu.mybatis.pojo;

/**
 * @author txy
 * @create 2022-06-21 15:49
 */
public class Admin {
    private Integer id;
    private String name;
    private Character gender;
    private String password;
    private String email;
    private String telephone;
    private String address;

    public Admin(Integer id, String name, Character gender, String password, String email, String telephone, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public Admin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", name='" + name + '\'' + ", gender=" + gender + ", password='" + password + '\'' + ", email='" + email + '\'' + ", telephone='" + telephone + '\'' + ", address='" + address + '\'' + '}';
    }
}
