package com.jiwon.c2_0304.lotto;
// 셔플
// nums  배열에 딱 한번만 대입하려면 어떻게 해야할까 ?
public class LottoNumber {
    
    private static int[] nums;  // 섞기는 숫자들
    final static int  MAX = 6; // 섞는 횟수
    static int cnt = 0; // 1번만 세팅

    // 한번 세팅을 위한 메소드
    public static void setNums(){
        if(cnt==1)
            return;

        nums = new int[45];
        for(int i =0; i< nums.length; i++)
            nums[i] = i + 1;

        cnt++;
    }

    public static int[] getNumber(){
        setNums();
        int [] result = new int[6];
        for(int i =0; i<MAX; i++){
            int ran = (int)(Math.random()*45+1);
            int tmp;

            tmp = nums[i];
            nums[i] = nums[ran];
            nums[ran] = tmp;

            result[i] = nums[i];
        }
        return result;
}

    public static int[] getNumber2(){
        int[] result = new int[6];

        for(int i = 0; i<result.length; i++){
            result[i] = (int)(Math.random()*45+1);
            for(int j = 0; j<i; j++){
                if(result[i] == result[j])
                    i--;
            }
        }

        return result;
    }
}
