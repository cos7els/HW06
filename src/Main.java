public class Main {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("2313 8573 0864 8254", 1000);
        CreditCard card2 = new CreditCard("8761 5879 6312 5879", 800);
        CreditCard card3 = new CreditCard("4813 4516 8793 4516", 600);
        card1.toAccount(200);
        card2.toAccount(400);
        card3.fromAccount(200);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println();

        Computer comp1 = new Computer(1500, "HP");
        Computer comp2 = new Computer(2500, "Dell", new RAM("Samsung", 16384),
                new HDD("Toshiba", 512, Type.INNER));
        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
        System.out.println();

        ATM atm = new ATM(10, 4, 10);
        System.out.println(atm.toString());
        atm.cashFromATM(1100);
        System.out.println(atm.toString());
        atm.toATM(10, 20, 30);
        System.out.println(atm.toString());
        System.out.println();

        /*Matrix m1 = new Matrix(4, 2);
        m1.init();
        Matrix m2 = new Matrix(2, 4);
        m2.init();
        m1.printMatrix();
        m2.printMatrix();
        Matrix m3 = m1.multiple(m2);
        m3.printMatrix();*/
    }
}