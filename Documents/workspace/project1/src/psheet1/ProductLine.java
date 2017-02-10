package psheet1;


public class ProductLine {
  public ProductLine(String name, int price, int amount) {
    this.name = name;
    this.price = price;
    this.amount = amount;
  }
  public String getName() {return name;}
  public int getPrice() {return price;}
  public int getAmount() {return amount;}
  public String getPrint() {return name + " " + String.valueOf(price);}

  public void productBought() {
    this.amount -=1;
  }

  public void refill() {
    this.amount = 5;
  }
  private String name;
  private int amount;
  private int price;
}
