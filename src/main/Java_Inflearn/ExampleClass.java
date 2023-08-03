package Java_Inflearn;

    
 public class ExampleClass {
        private int value1;
        private int value2;
    
        // 기본 생성자
        public ExampleClass() {
            // 생성자 내부에 this(0, 0); 구문이 없음
        }
    
        // 인자가 두 개인 생성자
        public ExampleClass(int value1, int value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }