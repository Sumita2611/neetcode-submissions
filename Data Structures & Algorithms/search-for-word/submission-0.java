class Solution {
    public boolean fun(int i,int j,int n,int m,int k,char[][] board, String word){
        if(k == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= n || j >= m || board[i][j] != word.charAt(k)){
            return false;
        }
        char ch = board[i][j];
        board[i][j] = '#';
        boolean up = fun(i-1,j,n,m,k+1,board,word);
        boolean down = fun(i+1,j,n,m,k+1,board,word);
        boolean left = fun(i,j-1,n,m,k+1,board,word);
        boolean right = fun(i,j+1,n,m,k+1,board,word);
        board[i][j] = ch;
        return up || down || left || right;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length,m = board[0].length;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(board[i][j] == word.charAt(0)){
                    if(fun(i,j,n,m,0,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
