package Java_Inflearn;


public class Study_factory {
    public class Car {
        //필드
        private int speed;
        private boolean stop;
        
        //생성자
        
        //메소드
        public int getSpeed() {  // Getter
            return speed;
        }
        
        public void setSpeed(int speed) {
            if(speed < 0) {
                this.speed = 0;
                return;
            } else {
                this.speed = speed;
            }
        }
        
        public boolean isStop() {
            return stop;
        }
        
        public void setStop(boolean stop) {
            this.stop = stop;
            this.speed = 0;
        }
    }
     

    public static void main(String[] args) {
        Study_factory sf = new Study_factory();
        Study_factory.Car myCar = sf.new Car();   // 이런식으로 접근 가능 또는 Car 에 static 붙이던가
        
        //잘못된 속도 변경
        myCar.setSpeed(50);
        
        System.out.println("현재 속도 : "+ myCar.getSpeed());  // 0 출력
        
        //올바른 속도 변경
        myCar.setSpeed(60);
        
        //멈춤
        if(!myCar.isStop()) {
            myCar.setStop(true);
        }
        
        System.out.println("현재 속도 : "+ myCar.getSpeed());  // 0 출력
    }
    
}
