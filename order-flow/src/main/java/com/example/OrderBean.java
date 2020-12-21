package com.example;

import jakarta.faces.flow.FlowScoped;
import jakarta.inject.Named;

@Named
@FlowScoped("order")
public class OrderBean  implements java.io.Serializable {

  private int itemCount;
  private String address;

  public int getItemCount() {
    return itemCount;
  }

  public void setItemCount(int itemCount) {
    this.itemCount = itemCount;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getReturnValue() {
    return "/home";
  }

}
