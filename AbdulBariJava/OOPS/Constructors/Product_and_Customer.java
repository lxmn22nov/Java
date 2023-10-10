//Product and Customer using objects with the help of constructors.
class Product
{
    private String item_no;
    private String name;
    private double price;
    private int quantity;

    //Implementing get methods.
    public String getItem_No()
    {
        return item_no;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    //Implementing set methods.
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    //Creating objects.
    public Product(String item_no)
    {
        this.item_no = item_no;
    }
    public Product(String item_no, String name, double price, int quantity)
    {
        this.item_no = item_no;
        this.name = name;
        // this.price = price;
        // this.quantity = quantity;
        setPrice(price);
        setQuantity(quantity);
    }
}
class Customer
{
    private String customer_id;
    private String name;
    private String address;
    private String phone_no;

    //Implementing get methods.
    public String getCustomer_Id()
    {
        return customer_id;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone_no()
    {
        return phone_no;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhone_no(String phone_no)
    {
        this.phone_no = phone_no;
    }
    //Creating objects.
    public Customer(String customer_id, String name)
    {
        this.customer_id = customer_id;
        this.name = name;
    }
    public Customer(String  customer_id, String name, String address, String phone_no)
    {
        this.customer_id = customer_id;
        this.name = name;
        // this.address = address;
        // this.phone_no = phone_no;
        setAddress(address);
        setPhone_no(phone_no);
    }
    
}
public class Product_and_Customer 
{
    public static void main(String[] args)
    {
        Product p = new Product("LX123");
        p.setPrice(1000);
        p.setQuantity(4);
        Customer c = new Customer("1000017428", "Laxman Singh Koranga");
        c.setAddress("Karayal Chatur Singh, Haldwani.");

        System.out.println(p.getItem_No());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQuantity());

        System.out.println(c.getCustomer_Id());
        System.out.println(c.getName());
        System.out.println(c.getAddress());
        System.out.println(c.getPhone_no());
    }
}