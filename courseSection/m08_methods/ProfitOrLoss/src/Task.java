public class Task {
    public static void main(String[] args) {

        System.out.println(profit(1, 10));

    }

    public static String profit(int buyPrice, int sellPrice){

        if(buyPrice < sellPrice){return "profit";}
        else if(buyPrice > sellPrice){return "loss";}
        else{return "no loss";}
    }

}