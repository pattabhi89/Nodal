package com.example.ranad.nodalsystems;

import android.os.Parcel;
import android.os.Parcelable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Index;

/**
 * Created by Rana D on 2/3/2018.
 */
@Entity(
        // Define indexes spanning multiple columns here.
        indexes = {
                @Index(value = "customerId , ProductId ", unique = true)
        })
public class CartItem implements Parcelable {
    @Id (autoincrement = true)
    Long id;
    String customerId , ProductId;
    int Quantity;

    public CartItem(){

    }

    public CartItem(String ProductId, int Quantity){
        this.ProductId = ProductId;
        this.Quantity = Quantity;
    }


    protected CartItem(Parcel in) {
        customerId = in.readString();
        ProductId = in.readString();
        Quantity = in.readInt();
    }

    @Generated(hash = 1933224580)
    public CartItem(Long id, String customerId, String ProductId, int Quantity) {
        this.id = id;
        this.customerId = customerId;
        this.ProductId = ProductId;
        this.Quantity = Quantity;
    }








    public static final Creator<CartItem> CREATOR = new Creator<CartItem>() {
        @Override
        public CartItem createFromParcel(Parcel in) {
            return new CartItem(in);
        }

        @Override
        public CartItem[] newArray(int size) {
            return new CartItem[size];
        }
    };

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(customerId);
        parcel.writeString(ProductId);
        parcel.writeInt(Quantity);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  CartItem){
            if(((CartItem) obj).getProductId() == this.getProductId() && ((CartItem) obj).getCustomerId() == this.getCustomerId()){
                return true;
            }
            else{
                return false;
            }
        }
        return super.equals(obj);

    }

    @Override
    public String toString() {
        return "cust id = "+customerId+" proid = "+getProductId();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
}
