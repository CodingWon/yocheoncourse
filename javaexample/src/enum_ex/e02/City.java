package enum_ex.e02;

public enum City {
    SEOULE(0,100),BUSAN(1,-100),NEWYORK(2, 200);

    int cno;
    int accountMoney;

    City(int cno, int accountMoney){
        this.cno = cno;
        this.accountMoney = accountMoney;
    }

    public int getCno() {
        return cno;
    }

    public int getAccountMoney() {
        return accountMoney;
    }
}
