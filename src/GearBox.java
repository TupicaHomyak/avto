public class GearBox {
    private int gear = 0;
    public static  final int MAX_GEAR = 6;
    public static  final int MIN_GEAR = 1;

    public void shiftUp() {   //метод повышающий скорость
       gear = gear < MAX_GEAR ? gear + 1: gear;
    }
    public void shiftDown() { //метод понижающий скорость
        gear = gear > MIN_GEAR ? gear - 1: gear;
    }
    public void switchRear() { //уход на заднюю скорость
        gear = gear > 1? gear: -1;
    }
    public void switchNeutral() { //уход на нейтральную скорость
        gear = 0;
    }
    public int getCurrentGear() { //значение текущей передачи
        return gear;
    }

}
