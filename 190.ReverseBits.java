/*
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
*/

public int reverseBits(int n){
        int res=0;
        
        for(int i=0; i<32; i++){
            int bitMask = 1;
            int lastBit = n&bitMask;
            n=n>>1;
            res|=lastBit<<31-i;
        }
        return res;
}
