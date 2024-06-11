class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        int temp, k;
        for(int i = 0; i < row; i++) {
            k = col - 1;
            for(int j = 0; j < col / 2; j++) {
                temp = image[i][j] ^ 1;
                image[i][j] = image[i][k] ^ 1;
                image[i][k] = temp;
                k--;
            }
            
            if (col % 2 == 1) {
                image[i][col / 2] ^= 1;
            }
        }
        return image;

        
        
    }
}