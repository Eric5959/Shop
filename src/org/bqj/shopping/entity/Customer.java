package org.bqj.shopping.entity;

public class Customer {
    private Integer customerId;

    private String customerName;

    private String customerPassword;

    private String customerGendar;

    private Integer customerAge;

    private String customerAddress;

    private String custoemrMobilePhone;

    private String customerHomePhone;

    private Integer vipId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public String getCustomerGendar() {
        return customerGendar;
    }

    public void setCustomerGendar(String customerGendar) {
        this.customerGendar = customerGendar == null ? null : customerGendar.trim();
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustoemrMobilePhone() {
        return custoemrMobilePhone;
    }

    public void setCustoemrMobilePhone(String custoemrMobilePhone) {
        this.custoemrMobilePhone = custoemrMobilePhone == null ? null : custoemrMobilePhone.trim();
    }

    public String getCustomerHomePhone() {
        return customerHomePhone;
    }

    public void setCustomerHomePhone(String customerHomePhone) {
        this.customerHomePhone = customerHomePhone == null ? null : customerHomePhone.trim();
    }

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }
}