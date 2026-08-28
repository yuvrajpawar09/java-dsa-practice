package array2;

public class besttimetobuyandsellstock {
    public static int buyandsellstock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++){
            if(buyprice<prices[i]){
                int profit = prices[i] - buyprice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args){
        int prices[]= {7,1,5,3,6,4};
        System.out.println("Maxprofit is = "+ buyandsellstock(prices));
    }
}
