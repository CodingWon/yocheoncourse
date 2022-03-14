package enum_ex.e03;

public enum SampleDAO {
    //객체를 정해진 갯수만큼 만들 수 있다.
    I1(100);
    private int idx;
    SampleDAO(int value){
        this.idx = value;
    }
    public void test(){
        System.out.println("Test" + ++idx);
    }

}
