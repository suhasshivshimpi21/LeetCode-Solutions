class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice=0;
        int sumBob=0;

        for(int x: aliceSizes){
            sumAlice+=x;
        }
        for(int x: bobSizes){
            sumBob+=x;
        }
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                int newAlice= sumAlice-aliceSizes[i]+bobSizes[j];
                int newBob=sumBob-bobSizes[j]+aliceSizes[i];

                if(newAlice==newBob){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }return new int[0];

    }
}