class ContainSubstr {
    public static int indexOf(String sentence , String text , int index ){
        int ans = -1;
        if(!sentence.contains(text)){
             return ans;
        }else{

            ans = sentence.indexOf(text);
        }
        return ans;
        
    }
}


