package com.example.ProjectDemo;

public class JsonValues {
  String status;
  double voltage;
  double load;
  double charge;
  double health;
  double imbalance;
  double cellVolage;
  double templerature;
  double extra;
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public double getVoltage() {
    return voltage;
  }
  public void setVoltage(double voltage) {
    this.voltage = voltage;
  }
  public double getLoad() {
    return load;
  }
  public void setLoad(double load) {
    this.load = load;
  }
  public double getCharge() {
    return charge;
  }
  public void setCharge(double charge) {
    this.charge = charge;
  }
  public double getHealth() {
    return health;
  }
  public void setHealth(double health) {
    this.health = health;
  }
  public double getImbalance() {
    return imbalance;
  }
  public void setImbalance(double imbalance) {
    this.imbalance = imbalance;
  }
  public double getCellVolage() {
    return cellVolage;
  }
  public void setCellVolage(double cellVolage) {
    this.cellVolage = cellVolage;
  }

  public double getTemplerature() {
    return templerature;
  }
  public void setTemplerature(double templerature) {
    this.templerature = templerature;
  }
  public double getExtra() {
    return extra;
  }
  public void setExtra(double extra) {
    this.extra = extra;
  }
  
  @Override
  public String toString() {
    return "JsonValues [status=" + status + ", voltage=" + voltage + ", load=" + load + ", charge=" + charge
        + ", health=" + health + ", imbalance=" + imbalance + ", cellVolage=" + cellVolage + ", templerature="
        + templerature + ", extra=" + extra + "]";
  }

}
