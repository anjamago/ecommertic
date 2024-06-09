package com.linktic.ecommer.ecommerback.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;



public class User {
    private UUID IdUser;
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String Address;
    private Long CellphoneNumber;
    private UserType UserType;
    private LocalDateTime CreateDate;
    private LocalDateTime UpdateDate;

    public User(UUID IdUser, String UserName, String FirstName, String LastName, String Email, String Password, String Address, Long CellphoneNumber, UserType UserType, LocalDateTime CreateDate, LocalDateTime UpdateDate) {
        this.IdUser = IdUser;
        this.UserName = UserName;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
        this.CellphoneNumber = CellphoneNumber;
        this.UserType = UserType;
        this.CreateDate = CreateDate;
        this.UpdateDate = UpdateDate;
    }

    public User() {
    }


    public UUID getIdUser() {
        return this.IdUser;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getAddress() {
        return this.Address;
    }

    public Long getCellphoneNumber() {
        return this.CellphoneNumber;
    }

    public UserType getUserType() {
        return this.UserType;
    }

    public LocalDateTime getCreateDate() {
        return this.CreateDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.UpdateDate;
    }

    public void setIdUser(UUID IdUser) {
        this.IdUser = IdUser;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setCellphoneNumber(Long CellphoneNumber) {
        this.CellphoneNumber = CellphoneNumber;
    }

    public void setUserType(UserType UserType) {
        this.UserType = UserType;
    }

    public void setCreateDate(LocalDateTime CreateDate) {
        this.CreateDate = CreateDate;
    }

    public void setUpdateDate(LocalDateTime UpdateDate) {
        this.UpdateDate = UpdateDate;
    }
}

