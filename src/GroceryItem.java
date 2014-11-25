public class GroceryItem
{
  String name;
  int quantity; 
  double price;
  
  public GroceryItem (String name2, int quantity2, double price2)
  {
    name=name2;
    quantity=quantity2;
    price=price2;
  }
  
  public double getCost()
  {
    double a=price*quantity;
    return a;
  }
  
  public void setQuantity(int newquantity)
  {
    quantity=newquantity;
  }
  
  public String toString()
  {
    return quantity+" "+name.toString()+" @ "+price+" = "+getCost();
  }
}
