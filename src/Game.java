
public class Game {
    private int Correct;
    private int Questions;
    private String name;

    private int totalQ;


    public Game(int TimePerQuestion, int Questions, String name) {
        this.Correct = Correct;
        this.Questions = Questions;
        this.name = name;
    }
    public void Result() {
        System.out.println(Correct);
    }

    public void Result(int Continue) {
        System.out.println("The name of the User is: "+ name);
        System.out.println("The total amount of questions is: " + totalQ);
        System.out.println("The total amount of questions correct is: " + Correct);
   }


    public int Game(String answers) {
        double numAnswer = 0;
        String Answer = "";
        String Question = "";
        String word = "";
        String q = "";
        while (Questions >= 0) {
            if (Math.random() * 3 >= 3) {
                word += "Elephant";
            } else if (Math.random() * 3 == 2) {
                word += "Tree";
            } else if (Math.random() * 3 == 1) {
                word += "Pneumonoultramicroscopicsilicovolcanoconiosis";
            } else {
                word += "What";
            }
            if (Math.random() * 10 >= 10) {
                Question = "How many digits are there in pi?";
                Answer += "infinite";
                totalQ++;
                if (answers == Answer) {
                    Correct++;

                } else if (Math.random() * 10 == 9) {
                    Question = "What is 4 to the third power?";
                    numAnswer = Math.pow(4, 3);
                    q += numAnswer;
                    totalQ++;
                    if (answers == q) {
                        Correct++;

                    } else if (Math.random() * 10 == 8) {
                        Question = "How many words are in the word” + word + “?";
                        numAnswer = word.length();
                        q += numAnswer;
                        totalQ++;
                        if (answers == q) {
                            Correct++;

                        } else if (Math.random() * 10 == 7) {
                            Question = "What is the value of 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9?";
                            numAnswer = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9;
                            q += numAnswer;
                            totalQ++;
                            if (answers == q) {
                                Correct++;

                            } else if (Math.random() * 10 == 6) {
                            Question="What is 7 to the power of 4? GO!";
                            numAnswer=Math.pow(7,4);
                            q+=numAnswer;
                            totalQ++;
                            if (answers==q) {
                                Correct++;

                            } else if (Math.random() * 10 == 5) {
                                Question="What is the 4th root of 4096?";
                                numAnswer=((((4096/8)/8)/8)/8);
                                q+=numAnswer;
                                totalQ++;
                                if (answers==q) {
                                    Correct++;
                                }

                            } else if (Math.random() * 10 == 4) {
                                while (answers==q) {
                                Question="Time Loop! Repeated until you get this correct! (7+4*20/4)^2";
                                numAnswer=Math.pow(((20/4)*(7+4)),2);
                            }
                                totalQ++;
                                Correct++;
                            } else if (Math.random() * 10 == 3) {
                                while (answers==q) {
                                    Question = "Who is the teacher of our Computer Science A Class?";
                                    Answer = "Mr.Folwell";
                                }
                                    if (answers.contains(Answer))
                                        totalQ++;
                                        Correct++;
                                } else if (Math.random()*10==2) {
                                Question="What time is it if it is 40 minutes after 3:45?";
                                Answer= "4:25";
                                totalQ++;
                                    if (Answer==q) {
                                        Correct++;
                                    }
                            } else if (Math.random()*10==1) {
                                Question="You got a free question! No need to answer :D";
                                Correct++;
                            }
                            }


                        }
                    }

                }
            }
        }
        return Correct;
    }
}

