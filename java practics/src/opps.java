

public class opps{
    public static void main(String [] args){

        vehicle vh = new vehicle();
        vh.Price = 900000;
        vh.price();
        vh.exshowroom=900000; 
        vh.rto=785489;
        vh.insurance=545215;
        vh.onrodeprice();
    }
}
class vehicle{
    int price;
    int TotalPrices;
    int rto;
    int exshowroom;
    int insurance;

  void onrodeprice(){
     TotalPrices = exshowroom + rto + insurance;
        System.out.println("Total Price of this Vechile = " +TotalPrices);
}
        int Price;
    void price(){
        System.out.println("This vichele Price is "+Price);
    }
}
