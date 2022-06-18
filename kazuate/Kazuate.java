package hello.kazuate;

public class Kazuate {

    public void kazuate(){

        int answer=25;
        //int count=5;

        

        System.out.println("私が考えている2桁の正の整数をあててください！解答チャンスは５回までです。");
        
        KeyBoardInput kb=new KeyBoardInput();
        int num = kb.input();

        if(num==answer){
            System.out.println("当たり！");
        }else if(num<answer){
            System.out.println("残念！");
            System.out.println("ヒント："+num+"より大きい数");

            if(num+20<=answer){
                System.out.println("ヒント："+num+"とは20以上差があるよ！");
            }
        }else{
            System.out.println("残念！");
            System.out.println("ヒント："+num+"より小さい数");
            

            if(num-20>=answer){
                System.out.println("ヒント："+num+"とは20以上差があるよ！");
            }
        }

        // System.out.println(num);

        
    }
    
}
