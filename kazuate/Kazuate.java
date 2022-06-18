package hello.kazuate;

public class Kazuate {

    public void kazuate(){

        int answer=25;
        int count=5;

        
        System.out.println("私が考えている2桁の正の整数をあててください！解答チャンスは5回までです。");
        
        KeyBoardInput kb=new KeyBoardInput();

        while(count>0){

            System.out.println("チャンスはあと"+count+"回!");

            int num = 0;


            while(num < 10 || num > 99){
            
                System.out.print("●予想を入力してください：");
                num = kb.input();
                System.out.println("あなたの予想は"+num+"ですね。");
                
                if(num<10 || num>99){
                    System.out.println("私が考えているのは2桁の正の整数だよ！");
                    
                }

            }

            if(num==answer){
                System.out.println("当たり！");
                break;
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

            count=count-1;

        
        }

        System.out.println("答えは"+answer+"でした！");


    }
    
}
