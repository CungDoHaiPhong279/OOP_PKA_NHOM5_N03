package com.example.quanly.Model;

import javafx.beans.property.*;

public class OrderItem {
    private IntegerProperty orderItemId;
    private IntegerProperty orderId;
    private IntegerProperty productId;
    private StringProperty productName;
    private IntegerProperty quantity;
    private DoubleProperty price;

    // Constructor đầy đủ với orderItemId, orderId, productId, quantity, price
    public OrderItem(int orderItemId, int orderId, int productId, String productName, int quantity, double price) {
        this.orderItemId = new SimpleIntegerProperty(orderItemId);
        this.orderId = new SimpleIntegerProperty(orderId);
        this.productId = new SimpleIntegerProperty(productId);
        this.productName = new SimpleStringProperty(productName);
        this.quantity = new SimpleIntegerProperty(quantity);
        this.price = new SimpleDoubleProperty(price);
    }

    // Constructor cho sản phẩm mới thêm vào đơn hàng
    public OrderItem(int productId, String productName, int quantity, double price) {
        this.productId = new SimpleIntegerProperty(productId);
        this.productName = new SimpleStringProperty(productName);
        this.quantity = new SimpleIntegerProperty(quantity);
        this.price = new SimpleDoubleProperty(price);
    }

    // Getters và Setters cho các thuộc tính
    public int getOrderItemId() {
        return orderItemId.get();
    }

    public IntegerProperty orderItemIdProperty() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId.set(orderItemId);
    }

    public int getOrderId() {
        return orderId.get();
    }

    public IntegerProperty orderIdProperty() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId.set(orderId);
    }

    public int getProductId() {
        return productId.get();
    }

    public IntegerProperty productIdProperty() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId.set(productId);
    }

    public String getProductName() {
        return productName.get();
    }

    public void setProductName(String productName) {
        this.productName.set(productName);
    }

    public StringProperty productNameProperty() {
        return productName;
    }

    public int getQuantity() {
        return quantity.get();
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    public double getPrice() {
        return price.get();
    }

    public DoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }
}
