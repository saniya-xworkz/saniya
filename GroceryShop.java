class GroceryShop
{
static String groceryName;
void noOfItems()
{
System.out.println("Soaps=10");
System.out.println("Toothpaste =20");
System.out.println("Shampoo=10");
}
void soaps()
{
	System.out.println("Lifeboy=3");
	System.out.println("Dettol=4");
	System.out.println("Lux=3");
}

void toothPaste()
{
	System.out.println("CloseUp=10");
	System.out.println("Colgate=5");
	System.out.println("Pepsodent=5");
}

void shampoo()
{
	System.out.println("ClinicPlus=10");

	System.out.println("SunSilk=10");
}


public static void main(String s[])
{
	GroceryShop.groceryName="saniya general stores";
GroceryShop shop=new GroceryShop();
System.out.println(groceryName);

shop.noOfItems();
System.out.println(groceryName);

shop.soaps();
System.out.println(groceryName);
shop.toothPaste();
System.out.println(groceryName);
shop.shampoo();	

}}