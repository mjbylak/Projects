package tcscodevita;
import java.util.*;

public class TCSCODEVITA {

    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int T = scnr.nextInt();
        for (int i = 0; i < T; i++) {
          int N = scnr.nextInt();
          int [] ranks = new int [N];
          for (int j = 0; j < N; j++) {
                ranks [j] = scnr.nextInt();
          }
          int greatestGifts1 = 0;
          int greatestGifts2 = 0;
          for(int p = 0; p < N-1; p++) {
              if(ranks[p] > ranks[p+1]) 
                  greatestGifts1++;
              
              if(ranks[p] < ranks[p+1])
                  greatestGifts1--;
              
              if(ranks[p] > ranks[p+1]) 
                  greatestGifts2--;
              
              if(ranks[p] < ranks[p+1])
                  greatestGifts2++;
          }
          greatestGifts1++;
          if (greatestGifts1 == 1)
              greatestGifts1++;
          greatestGifts2++;
          if (greatestGifts2 == 1)
              greatestGifts2++;
          
          for(int p = 0; p < N-1; p++) {
              if(ranks[p] > ranks[p+1]) {
                  greatestGifts2--;
              }
              if(ranks[p] < ranks[p+1])
                  greatestGifts2++;
              
              
          }
          
        int max = greatestGifts1;
        if(greatestGifts1 < greatestGifts2)
            max = greatestGifts2;
        
        int total = 0;
        boolean nope = false;
        for(int m = 1; m <= max; m++) {
            nope = false;
            total = m;
            int currGift = m;
            for(int p =0; p<N-1; p++) {
                
                if(ranks[p]>ranks[p+1])
                    currGift--;
                if(ranks[p]<ranks[p+1])
                    currGift++;
                if(currGift ==0 || currGift > max) {
                    nope = true;
                    break;
                }
                total+=currGift;
            }
            if (nope == false)
                break;
        }
        System.out.println(total);
        
        
        
        }
        
    }
    
}
