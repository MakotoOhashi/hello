package hello.kazuate;

/* 
プログラマがプログラム内で設定した数を，ユーザが予想して入力する．
当たったら”当たり”と表示し，外れた場合は設定された数より大きいか小さいかを表示する．
20以上差があるとその旨を表示する．
ユーザは数を5回まで入力できるものとする．
このときの数は2桁の正の整数である．
*/

public class Main {
    public static void main(String[] args){

        Kazuate game=new Kazuate();
        game.kazuate();

        
    }
}
