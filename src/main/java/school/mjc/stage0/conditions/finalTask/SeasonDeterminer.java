package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        System.out.println((monthNumber < 1 || monthNumber > 12) ? "Wrong month number" :
                (monthNumber == 12 || monthNumber <= 2) ? "Winter" :
                        (monthNumber <= 5) ? "Spring" : (monthNumber <= 8) ? "Summer" : "Autumn");
    }
//    public void tellTheSeason(int monthNumber) {
//        String season = switch (monthNumber) {
//            case 1, 2, 12 -> "Winter";
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Fall";
//            default -> "Wrong month number";
//        };
//        System.out.println(season);
//    }
}
