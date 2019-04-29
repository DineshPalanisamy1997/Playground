public class Main {
	public static void main(String[] args) {
      Customers customerobj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'f',"Lakme Kajal,Salwar");
      Customers customerobj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
      Suppliers supplierobj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75f);
      Suppliers supplierobj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7,"Unpaid",4.35f);
      
      customerobj1.displayprofileDetails();
      customerobj2.displayprofileDetails();
      supplierobj1.displayprofileDetails();
      supplierobj2.displayprofileDetails();
      
      customerobj1.editAddress("Coimbatore");
      supplierobj1.editAddress("Delhi");
      
      customerobj1.placeOrder();
      
      supplierobj1.increaseStockLevel(5);
      supplierobj2.increaseStockLevel(10);
      
    }	
}

class Users {
       int Id;
   String name;
   long mobileNumber;
   String address;
   
   public void editAddress(String newAddress)
   {
       System.out.println(name+", "+address);
       address = newAddress;
       System.out.println(name+", "+address);
   }
   public void displayprofileDetails()
   {
       System.out.println(name+", "+mobileNumber);
   }
}

class Customers extends Users{
  
   String dateOfBirth;
   char gender;
   String orderHistory;
  public  Customers(int Id, String name, long mobileNumber, String address,String dateOfBirth, char gender,String orderHistory)
  {
    this.Id = Id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.orderHistory = orderHistory;
  }
  
    public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
 
}

class Suppliers extends Users {
    
  int itemStock;
  String paymentStatus;
  float feedbackRating;
  public Suppliers(int Id, String name, long mobileNumber, String address, int itemStock, String paymentStatus,float feedbackRating)
  {
    this.Id = Id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.address = address;
    this.itemStock = itemStock;
    this.paymentStatus = paymentStatus;
    this.feedbackRating = feedbackRating;
  }
  public void increaseStockLevel(int newStock)
  {
    System.out.println(name+", "+(itemStock+newStock));
  }
}