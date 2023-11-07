public class continueandbreak {
    public static void main(String[] args) {
        int is=10;
        for (int i= 1; i<=is; i++) {
            if(i%2==0) {
                System.out.print(i);
                continue; //biz continue ni sikda sakrab ketish uchun ishlatamiz , va buning do'sti break ni to'xtatish uchun
            }
        }
    }
}
