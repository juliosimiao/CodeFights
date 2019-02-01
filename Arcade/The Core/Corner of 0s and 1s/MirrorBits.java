int mirrorBits(int a) {
    StringBuilder binaryNumber = new StringBuilder(Integer.toBinaryString(a));
    binaryNumber.reverse();
    
    return Integer.parseInt(binaryNumber.toString(),2);
}