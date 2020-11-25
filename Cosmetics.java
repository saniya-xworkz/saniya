class Cosmetics
{
 double price;
 static String name;
 String brand;
static int id;
void makeover()
{
System.out.println("party");

}


public static void main(String a[])
{
Cosmetics cos=new Cosmetics();
cos.price=150.00;
cos.name="lipstick";
cos.brand="dazzle";
cos.id=1577653;
System.out.println(cos.price+" "+cos.brand);
cos.makeover();
}}