package Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nantha Kishore S";
        char target = 'u';
        System.out.println(Searchstr(name,target));
    }
    static boolean Searchstr(String str,char target){
        if(str.length()==0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;


    }
}
