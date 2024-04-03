package com.finalproject.webapi.dto;

public class UserDTO {

    private Integer id;
    private String name;
    private String email;
    private String account;
    private String password;
    private String address;
    private String phone;
    private Integer roleId;
    private Integer statusId;

    /* START Constructor part */
    public UserDTO() {
    }

    public UserDTO(Integer id, String name, String email, String account, String password, String address, String phone, Integer roleId, Integer statusId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.account = account;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.roleId = roleId;
        this.statusId = statusId;
    }

    /* END Constructor part */

    /* START Getter Setter part */

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /* END Getter Setter part */
}
