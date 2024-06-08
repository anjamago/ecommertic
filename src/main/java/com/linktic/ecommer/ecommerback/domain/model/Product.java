package com.linktic.ecommer.ecommerback.domain.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


public class Product {

    private UUID IdProduct;
    private String Name;
    private String Description;
    private BigDecimal Price;
    private Integer Quantity;
    private String Code;
    private String ImageUrl;
    private UUID UserId;
    private UUID CategoryId;
    private LocalDateTime CreateDate;
    private LocalDateTime UpdateDate;

    public UUID getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(UUID idProduct) {
        IdProduct = idProduct;
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
