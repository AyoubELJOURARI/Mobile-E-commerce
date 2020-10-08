package com.example.pfa_ecommerce.Model;

public class Users {
    private String Name, Phone, Password, image, adress;
    public Users() {

    }

    public Users(String name, String phone, String password, String image, String adress) {
        Name = name;
        Phone = phone;
        Password = password;
        this.image = image;
        this.adress = adress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
