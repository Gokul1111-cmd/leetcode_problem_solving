class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int bot = numBottles;
        if(numBottles == 0 || numExchange == 0){
            return 0;
        }
        while(numBottles >= numExchange){
            bot = bot + ( numBottles / numExchange );
            numBottles = (numBottles / numExchange) + ( numBottles % numExchange );
        }
        return bot;
    }
}
