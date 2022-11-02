public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public String firstCoordinate() {
        String coordinate="(" + x1 +", " + y1 + ")";
        return coordinate;
    }
    public String secondCoordinate() {
        String coordinate2 = "(" + x2 + ", " + y2 + ")";
        return coordinate2;
    }


    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
this precondition is not violated)
public LinearEquation(int x1, int y1, int x2, int y2)


/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
the nearest hundredth */
    public double distance() {
        double distanceBetween = (double) (roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
        return distanceBetween;

    }
    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double intercept = (roundedToHundredth((double)y1-(slope())*x1));
        return intercept;

    }



    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double DeltaY = y2 - y1;
        double DeltaX = x2 - x1;
        double Slope = roundedToHundredth((double)DeltaY/DeltaX);
        return Slope;
    }



    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)

        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0   - 2.35       + 12.5      - 8.0     + 17.19

        Here are non-examples of "printable" y-intercepts:
           - -1.0  + -2.35    - -12.5    + -8.0      - -17.19  + 0    - 0

        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation() {
        String formula;
        double DeltaX=y2-y1;
        double DeltaY=x2-x1;
        int first= (int) DeltaX;
        int second = (int) DeltaY;
        if (DeltaX>1 && DeltaY>1) {
            if ((DeltaY/DeltaX) % slope() > 0) {
                formula = "y = " + first+"x" + "/"+second;
                if (yIntercept()<0) {
                    formula+= yIntercept();
                }
                else {
                    if(yIntercept()>0) {
                        formula+=" " + yIntercept(); }
                }
                return formula;
            }
            else {
                formula = "y = " + slope() + "x ";
                if (yIntercept() < 0) {
                    formula += yIntercept();
                } else {
                    formula += "+" + yIntercept();
                }
                return formula;
            }

        } else {
            String fail = "y = " + yIntercept();
            return fail;
        }

    }





    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
        double X = xValue;
        double Line =  (slope()*X) + yIntercept();
        String coordinateforX1 = "(" + xValue + ", " + Line + ")";
        return coordinateforX1;
    }





    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth

        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.0;
    }

public String returnX(int X) {
        double here = (slope()*X) + yIntercept();
        String give="(" + X + ", " + here + ")";
        return give;
}

   /* Returns a string that includes all information about the linear equation, each on
      separate lines:
        - The original points: (x1, y1) and (x2, y2)
        - The equation of the line in y = mx + b format (using equation() method)
        - The slope of the line, as a decimal (using slope() method)
        - The y-intercept of the line (using yIntercept() method)
        - The distance between the two points (using distance() method)

     This method should call all other appropriate methods to get the info it needs:
     equation(), slope(), yIntercept(), distance().

     */

    public String inputX(int X) {
        double y = roundedToHundredth((double)slope()*X)+yIntercept();
        String input= "(" + X + "," + y+")";
        return input;
    }

    public String lineInfo() {
        String info="";
        info+="The original points: " + firstCoordinate() + " and " + secondCoordinate();
        info+="\n" + "The equation of the line in y = mx + b is: " + equation()  ;
        info+="\n" + "The slope of the line, as a decimal is: " + slope();
        info+="\n" + "The y-intercept of the line is: " + yIntercept();
        info+="\n" + "The distance between the two lines is: " + distance();
        return info;
    }



}
