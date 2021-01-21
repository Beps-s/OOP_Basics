public class Konto {
    public String omanik;
    public Double balance;

    public Konto(String omanikuNimi) {
        //this.looKonto(omanikuNimi, 0.0);
        this.omanik = omanikuNimi;
        this.balance = 0.0;
    }


    public Konto(String omanikuNimi, Double summa) {
        this.looKonto(omanikuNimi, summa);
    }

    public void looKonto(String omanikuNimi, Double summa) {
        this.omanik = omanikuNimi;
        this.balance = summa;
    }

    public boolean lisaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summa pole võimalik kontole lisada");
            return false;
        } else {
            this.balance = this.balance + summa;
            System.out.println("kontole lisatud summa " + summa);
            return true;
        }
    }

    public boolean votaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summat pole võimalik välja võtta");
            return false;
        } else {
            if (summa <= this.balance) {
                this.balance = this.balance - summa;
                System.out.println("Kontost võetud maha " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha, et raha välja võtta");
                return false;
            }
        }
    }

    public boolean teeYlekanne(Konto teineKonto, Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summat pole võimalik kanda üle");
            return false;
        } else {
            if (summa <= this.balance) {
                this.balance = this.balance - summa;
                teineKonto.balance = teineKonto.balance + summa;
                System.out.println("Kantud üle " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha, et ülekannet sooritada");
                return false;
            }
        }
    }
}