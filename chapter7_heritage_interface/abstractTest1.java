abstract class Player{
    abstract void play(int pos){
        // 
    }
    abstract void stop(){
        // 
    }
}

class AudioPlayer extends Player{
    void play(int pos){
        // 부모 클래스가 abstract 라면 무조건 오버라이딩 해줘야 한다. 그렇지 않으면 인스턴스 생성 불가능
    }
    void stop(){
        // 부모클래스가 abstract일때 하나라도 오버라이딩 하지않으면 자손조차 abstract로 해주어야 한다
    }
}

abstract AbstractPlayer extends Player{
    abstract void play(int pos){
        // 
    }
}