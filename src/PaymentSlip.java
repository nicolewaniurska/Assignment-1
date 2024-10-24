
public class PaymentSlip {  

private String name;
private double hourlyRate;
private int hours;
private final double TAX_RATE = 0.30;
// Alla dessa lagrar, sista är en konstant därav final
public PaymentSlip() {
    
}

public PaymentSlip(String name, double hourlyRate, int hours) {
this.name = name;
this.hourlyRate = hourlyRate;
this.hours = hours;
} // Konstruktor för PaymentSlip-klassen, this tilldelar dessa värden

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getHourlyRate() {
    return hourlyRate;
}
public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
}
public int getHours() {
    return hours;
}
public void setHours(int hours) {
    this.hours = hours;
} // Hämta eller uppdatera värdena för name, hourlyRate och hours, getters: returnerar värdet, setters: uppdaterar fältet 
public double calculateSalary() {
    return hourlyRate * hours;
} // Beräknar bruttolönen
public double calculateNetSalary() {
    double grossSalary = calculateSalary();
    return grossSalary * (1 - TAX_RATE);
} // Anropar caluclateSalary för att beräkna bruttolön. sedan dra av skatten och returnera nettolönen
}
