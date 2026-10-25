# Electricity Bill Estimator

A simple, beginner-friendly Java console application that calculates an estimated electricity bill based on the number of units consumed. The project uses slab-based electricity rates and a fixed service charge to calculate the final bill.

## Project Overview

The Electricity Bill Estimator is a console-based Java project developed to practice fundamental programming concepts. It accepts customer details and electricity consumption as input, calculates the energy charges, and displays an itemized bill.

## Features

- Accepts the customer's name.
- Takes electricity consumption in units as input.
- Calculates charges using slab-based rates.
- Adds a fixed service charge.
- Displays an itemized electricity bill.
- Validates negative unit values.
- Formats the final bill amount to two decimal places.

## Technologies Used

- **Programming Language:** Java
- **Input:** Java Scanner class
- **Interface:** Command-line / Console
- **Requirements:** Java Development Kit (JDK)

## Sample Tariff Rates

The project uses the following sample rates for demonstration purposes:

| Electricity Consumption | Rate per Unit |
|-------------------------|---------------|
| First 100 units         | ₹1.50         |
| Next 100 units          | ₹2.50         |
| Above 200 units         | ₹4.00         |
| Fixed Service Charge    | ₹50.00        |

**Note:** These are sample rates for educational purposes and do not represent official electricity tariffs.

## How to Run the Project

### Prerequisites

Install the Java Development Kit (JDK) on your computer.

Verify the installation by running:

```bash
java -version
javac -version
```

### Steps

1. Clone or download this repository.
2. Open a terminal in the project directory.
3. Compile the Java source file:

   ```bash
   javac ElectricityBillEstimator.java
   ```

4. Run the application:

   ```bash
   java ElectricityBillEstimator
   ```

5. Enter the customer name and electricity units when prompted.
6. View the calculated electricity bill in the console.

## Sample Output

```text
================================
    ELECTRICITY BILL ESTIMATOR
================================
Enter customer name: Rahul
Enter units consumed: 250

================================
       ELECTRICITY BILL
================================
Customer Name : Rahul
Units Consumed: 250.0
Energy Charges: Rs. 600.00
Service Charge: Rs. 50.00
--------------------------------
Total Bill    : Rs. 650.00
================================
```

## Concepts Learned

- Java variables and data types
- User input using the Scanner class
- Conditional statements (`if-else`)
- Arithmetic operations
- Input validation
- Formatted console output
- Basic program structure and execution

## Project Structure

```text
Electricity-Bill-Estimator/
├── ElectricityBillEstimator.java
└── README.md
```

## Future Enhancements

- Support multiple bill calculations in one session.
- Add a menu to display the available tariff rates.
- Include a billing date and billing period.
- Generate a monthly electricity consumption summary.

## Author

Created as a beginner-level Java mini-project to practice core Java programming concepts.

## License

This project is available for educational and learning purposes.
