package com.test.git;

public class GitTest {
    static class LuXF{
        public void ningXiZhi(){
            System.out.println("使用了灵犀指");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello GitHub!");
        System.out.println("HuaQ! the great firewall!");
        LuXF mor = new LuXF();
        mor.ningXiZhi();
        //测试git用文档
	    //我都觉得害怕
        int result = 1;
        for (int i = 1; i<=10; i++){
            result *=i;
        }
        System.out.println("10的阶乘 = " + result);
	//pull test
    }
}
