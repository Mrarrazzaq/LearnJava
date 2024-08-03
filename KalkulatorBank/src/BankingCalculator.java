class BankingCalculator {
    // Menghitung bunga sederhana
    public static double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    // Menghitung jumlah akhir dengan bunga sederhana
    public static double calculateAmountWithSimpleInterest(double principal, double rate, int time) {
        return principal + calculateSimpleInterest(principal, rate, time);
    }

    // Menghitung bunga majemuk
    public static double calculateCompoundInterest(double principal, double rate, int time, int n) {
        return principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;
    }

    // Menghitung jumlah akhir dengan bunga majemuk
    public static double calculateAmountWithCompoundInterest(double principal, double rate, int time, int n) {
        return principal * Math.pow(1 + (rate / (n * 100)), n * time);
    }

    // Menghitung EMI (Equated Monthly Installment) untuk pinjaman
    public static double calculateEMI(double principal, double rate, int time) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }
}