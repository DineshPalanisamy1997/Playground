//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  public void setproduct(String Product)
  {
  this.product = Product;
  }
  public String getProduct()
  {
  return product;
  }
  public void setQuant(int Quant)
  {
  this.quantity = Quant;
  }
  public int getQuant()
  {
  return quantity;
  }
}

class Bill extends Customer
{
  public int bill(int p, int q)
  {
  return (p*q);
  }
}
public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
   String Product = scan.next();
    int Quant = scan.nextInt();
    int price = scan.nextInt();
    Item i = new Item();
    i.setPrice(price);
    Customer c = new Customer();
 // c.setProduct(Product);
    c.setQuant(Quant);
    Bill obj = new Bill();
    int p = c.getQuant();
    int q = i.getPrice();
    
    //write the logic here
    System.out.println("Total Price is : "+obj.bill(p,q));
  }
}