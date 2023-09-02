class GenerateParenthesis{
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        check(res,0,0,"",n);
        return res;

    }
    public void check(List<String> res, int open, int close, String s, int n){
        if(open==close && open==n){
            res.add(s);
            return;
        }
        if(open<n){
            check(res,open+1,close,s+"(",n);
        }
        if(close<open){
            check(res,open,close+1,s+")",n);
        }
    }
}