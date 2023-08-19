package Recursion.Backtracking;

public class coinPermutation {
    public static void main(String[] args) {
        int[] coin = {2, 3, 4, 5, 6};
        int amount = 10;
        coinper(coin,amount,"");
    }

    public static void coinper(int coin[], int amount, String ans) {
        if(amount==0){
            System.out.println(ans);
            return ;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                coinper(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }
}
