package Java_Inflearn;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class WeekendException {
    public static void main(String[] args) {
        try {
            Set<LocalDate> exceptionDates = new HashSet<>();
            exceptionDates.add(LocalDate.of(2023, 6, 14)); // 예외 날짜 추가
            LocalDate currentDate = LocalDate.now();
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.FRIDAY || dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY|| exceptionDates.contains(currentDate)) {
                throw new WeekendException2("6/14일 및  주말및 금요일에는 출석을 할 수 없습니다.");
            }else{
                System.out.println("된다");
            }
        } catch (WeekendException2 e) {
            System.out.println(e.getMessage());
        }
    }
}

class WeekendException2 extends Exception {
    public WeekendException2(String message) {
        super(message);
    }
}