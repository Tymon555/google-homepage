/*import java.util.Scanner;

  public class VendingMachine1 {

  private ProductLine[] products[] = null;

  public VendingMachine1(ProductLine[] products[]) {
    //this.products = new ProductLine[products.length];
    for(int i=0; i<products.length; i++) {
      this.products[i] = products[i];
    }

    //public
  }

  //this function displays one product in one row
  public static void printRow(ProductLine u, int nr) {
    System.out.print("");
    System.out.format("[" + nr +"] : %-20s%-25s%s%n", u.getName()+",", "Price : " + Integer.valueOf(u.getPrice()) + " pence,",
    Integer.valueOf(u.getAmount()) + " remaining");
    return;
  }

  //mainMenu function displays all the products in the table and the maintenance option.
  public static void mainMenu(ProductLine[] data) {
    System.out.println("");
    for(int i=0; i<data.length; i++) {
      printRow(data[i],i);
    }
    System.out.print("[" + data.length + "] : System maintenance\n Please make your selection:");
  }

  public static void takeMoney(int remaining, Scanner in) {
    while(remaining>0) {
      System.out.print("You need to pay " + remaining + " pence\nHow much do you give: ");
      int given = in.nextInt();
      remaining -=given;
    }
    System.out.print("You get your product");
    if(remaining<0) {
      remaining*=-1;
      System.out.println("and " + remaining + " pence change.");
    }
    else System.out.print(".");


  }
  public static void main(String args[]) {
    //initialization of the vending machine. Done this, way, we can add new products just by adding
    //three strings to the string array.
    ProductLine[] parsedData = new ProductLine[4];
    String[] data = {"Coke", "80", "5", "Pepsi", "70", "5", "Lilt", "60", "5", "Sprite", "50", "5"};
    for(int i=0; i<data.length; i+=3) {
      parsedData[i/3] = new ProductLine(data[i], Integer.parseInt(data[i+1]), Integer.parseInt(data[i+2]));
    }
    VendingMachine vendingMachine = new VendingMachine(parsedData);

    //main program loop
    while(true) {
      mainMenu(parsedData);
      Scanner in = new Scanner(System.in);
      int chosenOption = in.nextInt();

      if(chosenOption>=0 && chosenOption<4) {
        if(parsedData[chosenOption].getAmount()>0) {
          takeMoney(parsedData[chosenOption].getPrice(), in);
          parsedData[chosenOption].productBought();
        }
        else {
          System.out.println("Sorry, product not available, choose another option!");
        }
      }
      else if(chosenOption == 4) {
        System.out.println("Do you want to [1] refill the product lines or [2] shut down the system?");
        int maintenanceOption = in.nextInt();
        if(maintenanceOption==1) {
          for(ProductLine e:parsedData) {
            e.refill();
          }
          System.out.println("All products refilled.");
        }
        else {
          return;
        }
      }
    }
  }
}
*/