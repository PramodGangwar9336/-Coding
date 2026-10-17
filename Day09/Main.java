
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

class Main {
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;

            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;

            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
        }
    }
}
