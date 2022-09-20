public class ATM {
    private int amount100;
    private int amount50;
    private int amount20;
    private int sum;

    public ATM(int amount100, int amount50, int amount20) {
        this.amount100 = amount100;
        this.amount50 = amount50;
        this.amount20 = amount20;
        this.currentSum();
    }

    private void currentSum() {
        this.sum = this.amount20 * 20 + this.amount50 * 50 + this.amount100 * 100;
    }

    public void toATM(int amount100, int amount50, int amount20) {
        this.amount100 += amount100;
        this.amount50 += amount50;
        this.amount20 += amount20;
        this.currentSum();
    }

    public boolean cashFromATM(int sum) {
        boolean result = false;
        if (this.sum >= sum && sum > 0 && ((sum % 20 == 0) || (sum >= 50 && sum % 10 == 0))) {
            int a100 = 0;
            if (sum >= 100) {
                a100 = sum % 100 == 0 || sum % 100 % 20 == 0 || sum % 100 % 50 == 0 || sum % 100 % 50 % 20 == 0 ?
                        sum / 100 : sum / 100 - 1;
                if (this.amount100 < a100) {
                    a100 = this.amount100;
                }
                sum -= a100 * 100;
            }
            int a50 = 0;
            if (sum >= 50) {
                a50 = sum % 50 == 0 ? sum / 50 : (sum % 50 % 20 == 0 ? sum / 50 : sum / 50 - 1);
                if (this.amount50 < a50) {
                    a50 = sum % (this.amount50 * 50) == 0 ? this.amount50 : (sum % (this.amount50 * 50) % 20 == 0 ?
                            this.amount50 : this.amount50 - 1);
                }
                sum -= a50 * 50;
            }
            int a20 = 0;
            if (sum >= 20) {
                a20 = sum / 20;
                sum -= a20 * 20;
            }
            if (this.amount100 < a100 || this.amount50 < a50 || this.amount20 < a20) {
                System.out.println("The ATM don't have enough banknotes.");
                return false;
            }
            this.amount100 -= a100;
            this.amount50 -= a50;
            this.amount20 -= a20;
            this.currentSum();
            System.out.printf("Out: %s %s %s sum = %d$.\n",
                    a100 > 0 ? "100$ - " + a100 + " pcs.," : "",
                    a50 > 0 ? "50$ - " + a50 + " pcs.," : "",
                    a20 > 0 ? "20$ - " + a20 + " pcs.," : "",
                    a100 * 100 + a50 * 50 + a20 * 20);
            result = true;
        } else if (this.sum < sum) {
            System.out.println("The ATM don't have enough banknotes.");
            result = false;
        } else {
            System.out.println("Incorrect value. Please, use values multiple to 20, 50 or 100.");
            result = false;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ATM: " + "banknotes 100$ - " + amount100 + " pcs., banknotes 50$ - " + amount50 +
                " pcs., banknotes 20$ - " + amount20 + " pcs., the sum of all banknotes = " + sum + "$.";
    }
}