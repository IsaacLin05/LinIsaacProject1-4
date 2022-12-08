public class Calculator {
    private double X;
    private double Y;

    private int e;

    public Calculator(String what, double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
        public double Result(String result) {
            String multiply="*";
            String divide="/";
            String add= "+";
            String subtract= "-";
            String remainder="%";
                if (result.contains(multiply)) {
                    return X * Y;
                } else if (result.contains(divide)) {
                    return X / Y;
                } else if (result.contains(add)) {
                    return X + Y;
                } else if (result.contains(subtract)) {
                    return X-Y;
                } else {
                    return X%Y;
                }

        }
    }

