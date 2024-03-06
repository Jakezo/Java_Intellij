package java_study;

public class ThreadSample extends Thread {

    int seq;

    /**
     * 시퀀스를 정의 하는 생성자 구성
     *
     * @param seq
     */
    public ThreadSample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(seq + "번째 스레드를 시작합니다.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(seq + "번째 스레드를 종료합니다.");

    }

    /**
     * Thread의 메인
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            ThreadSample sample = new ThreadSample(i);
            // 스레드를 시작합니다.
            sample.start();
        }
        System.out.println("메인 메서드가 종료되었습니다.");
    }
}
