package Easy;

public class MethodsReturn_Profit_loss_166 {
    public static void main(String[] args) {

        String str= c_profits(100,1500);
        System.out.println(str);

    }
    public static String c_profits(int buyPrice, int sellPrice){

       String result ="";

       result = (buyPrice<sellPrice)? "profit": (buyPrice>sellPrice)? "loss": "no loss";

        return result;

    }


}
/*
c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"

 */