import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Calculate2 {
public float result = 0;
    public static void main(String[] args) throws IOException {
        int one = Integer.parseInt(args[0]);
        int two = Integer.parseInt(args[1]);
        System.out.println("Choose:\n" +
                "write + \n" +
                "write - \n" +
                "write * \n" +
                "write / \n" +
                "write ^ ");
        Calculate2 calc = new Calculate2();
        String doubleFormat = new DecimalFormat("#0.0").format(calc.getResult(one,two));
        System.out.print("Result: " + doubleFormat);
    }
    public double getResult(int first, int second) throws IOException {/*Вычисление в зависимости от выбранного знака*/
        switch (getCalculate()) {
            case ("+"):
                result = first + second;
                break;
            case ("-"):
                result = first - second;
                break;
            case ("*"):
                result = first * second;
                break;
            case ("/"):
                result = (float)first / second;
                break;
            case ("^"):
                result = (float)Math.pow(first, second);
                break;
            default: System.out.println("Посчитать не удалось");
        }
        return result;
    }
    public String getCalculate() throws IOException {/*Получение знака*/
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String choose = read.readLine();
        return choose;
    }


    }