package com.linktic.ecommer.ecommerback.infrastructure.Entitys;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="Products", schema = "catalogo")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ProductId;
    private String Name;
    private String Description;
    private BigDecimal Price;
    private Integer Quantity;
    private String Code;
    private String ImageUrl;
    private UUID UserId;
    private UUID CategoryId;
    @CreationTimestamp
    private LocalDateTime CreateDate;
    @UpdateTimestamp
    private LocalDateTime UpdateDate;

    public ProductEntity() {
    }

    public ProductEntity(UUID userId, LocalDateTime updateDate, Integer quantity, UUID productId, BigDecimal price, String name, String imageUrl, LocalDateTime createDate, String description, String code, UUID categoryId) {
        UserId = userId;
        UpdateDate = updateDate;
        Quantity = quantity;
        ProductId = productId;
        Price = price;
        Name = name;
        ImageUrl = imageUrl;
        CreateDate = createDate;
        Description = description;
        Code = code;
        CategoryId = categoryId;
    }



    public ProductEntity(  Integer quantity,  BigDecimal price, String name, String imageUrl,  String description, String code, UUID categoryId,UUID userId) {
        Quantity = quantity;
        Price = price;
        Name = name;
        ImageUrl = imageUrl;
        Description = description;
        Code = code;
        CategoryId = categoryId;
        UserId = userId;
    }


    public UUID getProductId() {
        return ProductId;
    }

    public void setProductId(UUID productId) {
        ProductId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public UUID getUserId() {
        return UserId;
    }

    public void setUserId(UUID userId) {
        UserId = userId;
    }

    public UUID getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(UUID categoryId) {
        CategoryId = categoryId;
    }

    public LocalDateTime getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        UpdateDate = updateDate;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }
}
