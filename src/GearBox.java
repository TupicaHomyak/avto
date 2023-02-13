public class GearBox {
    private int gear = 0;
    private int maxGear = 6;
    private int minGear = 1;

    public void shiftUp() {   //метод повышающий скорость
       gear = gear < maxGear? gear + 1: gear;
    }
    public void shiftDown() { //метод понижающий скорость
        gear = gear > minGear? gear - 1: gear;
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
