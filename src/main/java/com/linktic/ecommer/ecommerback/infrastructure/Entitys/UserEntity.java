
package com.linktic.ecommer.ecommerback.infrastructure.Entitys;

import com.linktic.ecommer.ecommerback.domain.model.UserType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name="Users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID IdUser;
    private String UserName;
    private String FirstName;
    private String LastName;
    @Column(unique = true)
    private String Email;
    private String Password;
    private String Address;
    private Long CellphoneNumber;
    @Enumerated(EnumType.STRING)
    private UserType UserType;
    @CreationTimestamp
    private LocalDateTime CreateDate;
    @UpdateTimestamp
    private LocalDateTime UpdateDate;

    public UserEntity(){}
    public UserEntity(UUID idUser, String userName, String firstName, String lastName, String email, String password, String address, Long cellphoneNumber, com.linktic.ecommer.ecommerback.domain.model.UserType userType, LocalDateTime createDate, LocalDateTime updateDate) {
        IdUser = idUser;
        UserName = userName;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        Address = address;
        CellphoneNumber = cellphoneNumber;
        UserType = userType;
        CreateDate = createDate;
        UpdateDate = updateDate;
    }

    public UserEntity( String userName, String firstName, String lastName, String email, String password, String address, Long cellphoneNumber, com.linktic.ecommer.ecommerback.domain.model.UserType userType) {

        UserName = userName;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        Address = address;
        CellphoneNumber = cellphoneNumber;
        UserType = userType;
    }

    public UUID getIdUser() {
        return IdUser;
    }

    public void setIdUser(UUID idUser) {
        IdUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Long getCellphoneNumber() {
        return CellphoneNumber;
    }

    public void setCellphoneNumber(Long cellphoneNumber) {
        CellphoneNumber = cellphoneNumber;
    }

    public com.linktic.ecommer.ecommerback.domain.model.UserType getUserType() {
        return UserType;
    }

    public void setUserType(com.linktic.ecommer.ecommerback.domain.model.UserType userType) {
        UserType = userType;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        UpdateDate = updateDate;
    }

}
