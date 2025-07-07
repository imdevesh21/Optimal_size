package EasyProblems;

public class buySellStocks {

  public static int maxReturn(int[] prices){\
    // Initialise the maxprofit to zero, which is the minimum profit that can be made
    int maxProfit = 0;
    // Assume the first price is the minimum buying price
    int minPrice = prices[0];

    for(int price : prices){
      // calculates the maximum profit by comparing the current 'maxProfit'
      // with the difference of the current price - minPrice;
      maxProfit = Math.max(maxProfit, price - minPrice);

      // update the min price if the lower price is found

      minPrice = Math.min(minPrice, price);
    }
    // returning the maximum profits that can be acheived
    return maxProfit;
  }
  public static void main(String[] args){
    int prices[] = {7, 1, 5, 3, 6, 4};
    int profitDay = maxReturn(prices);
    System.out.println("We get the maximum profit if we sell stocks on a day: " + profitDay);
  }
}
