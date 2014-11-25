import java.util.ArrayList;

public class GroceryList
{
  ArrayList <GroceryItem> list;
  
  public GroceryList()
  {
    list=new ArrayList<GroceryItem>();
  }
 
  public void add(GroceryItem item)
  {
    list.add(item);
  }
  
  public double getTotalCost()
  {
    double sum=0;
    for(int i=0; i<list.size(); i++)
    {
      sum+= list.get(i).getCost();
    }
    return sum;
  }
  
  public String toString()
  {
    String s = "";
    for(int i=0; i<list.size(); i++)
    {
      s+= list.get(i).toString()+"\n";
    }
    return s;
  }
}
