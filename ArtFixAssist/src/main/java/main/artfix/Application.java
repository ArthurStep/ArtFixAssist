package main.artfix;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {

    public static String ask;
    public static String usernameNow;

    public static void start() {
        try {
            FileIng.read("username");
            usernameNow = FileIng.ReadData;

            if (usernameNow.equals("noName")) {
                System.out.println("You don't have a installed name for a set of type set name, Thanks.");
                System.out.println("Hi, Im ArtFix.");

            } else {
                System.out.println("Hi " + usernameNow + ", Im ArtFix.");
            }

            double randomNumDouble1 = Math.random() * 2;
            int randomNum2 = (int) randomNumDouble1;
            if (randomNum2 == 1) {
                System.out.println("Nice to meet you.");
            }
            System.out.println("For see what i can type 'help'.");

            while (true) {
                System.out.println(" ");
                System.out.print("Type: ");
                Scanner scanForAppIn = new Scanner(System.in);
                ask = scanForAppIn.nextLine();
                FileWriter txt = new FileWriter("app_files/historylog.txt", true);
                txt.write(ask + ", ");
                txt.close();
                switch (ask) {
                    case "hi what is your name", "Hi what is your name":
                        System.out.println("hi my name is ArtFix.");
                        break;

                    case "what is your name", "What is your name":
                        System.out.println("My name is ArtFix.");
                        break;


                    case "SOS", "EMERGENCY", "Sos", "sos", "Emergency", "emergency":
                        System.out.println("Sorry, I can't help you but you can call 911 or 112. Thanks.");
                        break;

                    case "hello", "Hello":
                        System.out.println("Hi " + usernameNow + ".");
                        break;


                    case "hi", "Hi":
                        System.out.println("Hi " + usernameNow + ", can i help you?");
                        break;

                    case "yes", "Great", "Yes", "No", "great", "fine", "Fine", "yeah",
                            "Yeah", "im fine", "Im fine", "im Fine", "Hahaha", "hahaha", "Hah", "ok", "Ok", "OK", "hah":
                        System.out.println(":)");
                        break;

                    case "no":
                        System.out.println(":_(");
                        break;

                    case "how are you", "How are you", "How are you ArtFix", "how are you ArtFix", "How are you artfix"
                            , "how are you artfix":
                        double randomNumDouble3 = Math.random() * 2;
                        int randomNum4 = (int) randomNumDouble3;
                        if (randomNum4 == 1) {
                            System.out.println("Great, Thanks for asking " + usernameNow + ".");

                        } else {
                            System.out.println("The processor hurts a little badly, Thanks for asking " + usernameNow + ".");
                        }
                        break;

                    case "nothing", "Nothing":
                        System.out.println("OK!");
                        break;


                    case "clear", "Clear":
                        Application.clear();
                        break;

                    case "What are you doing", "what are you doing":
                        System.out.println("I handle a few processes, thanks for asking.");
                        break;

                    case "tell me a joke", "Tell me a joke", "Joke", "joke":
                        double randomNumDouble11 = Math.random() * 11;
                        int randomNum11 = (int) randomNumDouble11;

                        if (randomNum11 == 0) {
                            System.out.println("Joke: Joke 1");
                            System.out.println("Personally, clowns don't seem funny to m" +
                                    "e at all. To tell the truth, I'm afraid of them." + "\n" +
                                    "I don't even know when it started. Probably when" +
                                    " I was taken to the circus as a child and a clown killed my father.");
                        }

                        if (randomNum11 == 1) {
                            System.out.println("Joke: Joke2");
                            System.out.println("— Grandma, do you hear?! I don't advise you to go… " +
                                    "The weather is at four with a minus ... And most importantly," +
                                    "\n" + " there are absolutely no men here..." +
                                    " Hi! Do you hear?! Many girls leave without resting…");
                        }

                        if (randomNum11 == 2) {
                            System.out.println("My cousin just passed away prematurely. He was only 19 years old. " +
                                    "\n" + "He was stung by a bee, the eternal enemy of the tightrope walker.");
                        }

                        if (randomNum11 == 3) {
                            System.out.println("Joke: Joke 3");
                            System.out.println("Grandma played with her grandson " +
                                    "for two weeks at school. " +
                                    "\n" + "By the end of the second week, she found " +
                                    "out that she was doing his homework for him.");
                        }

                        if (randomNum11 == 4) {
                            System.out.println("Joke: Joke 4");
                            System.out.println("Yesterday, my grandmother, seeing me talking to friends on " +
                                    "Skype, went to talk to the president on TV.");
                        }

                        if (randomNum11 == 5) {
                            System.out.println("Joke: Joke 5");
                            System.out.println("The husband says to his wife: — Darling, " +
                                    "but what will you do if you see me kissing another woman? —" +
                                    "\n" + "Well? As a faithful wife, I will visit you... In traumatology.");
                        }

                        if (randomNum11 == 6) {
                            System.out.println("Joke: Joke 6");
                            System.out.println("Oh, how good it is in nature! This campfire," +
                                    " the tent, the clean air, the bear. A bear?!!");
                        }

                        if (randomNum11 == 7) {
                            System.out.println("Joke: Joke 7");
                            System.out.println("— Do you like to sleep? Me too. We should try it together sometime.");
                        }

                        if (randomNum11 == 8) {
                            System.out.println("Joke: Joke 8");
                            System.out.println("I don't understand why I should look for a job if my girlfriend has two.");
                        }

                        if (randomNum11 == 9) {
                            System.out.println("Joke: Joke 9");
                            System.out.println("""
                                    The programmer calls the library.
                                    — Hello, can I have Katya?
                                    — It's in the archive.
                                    — Unzip it, please. I need it urgently!""");
                        }

                        if (randomNum11 == 10) {
                            System.out.println("Joke: Joke 10");
                            System.out.println("- A real programmer should always go to bed either at 1:28 or" +
                                    " 2:56... well, in extreme cases, at 5:12.\n" +
                                    "- And get up at 10:24. Well, as a last resort, at 20:48.");
                        }
                        break;

                    case "Game", "game", "I want to play", "i want to play":
                        try {
                            System.out.println("1) TicTacToe.");
                            System.out.println("2) Remember the number.");
                            System.out.print("Type: ");
                            Scanner scanForGameMenuIn = new Scanner(System.in);
                            String gameCheck = scanForGameMenuIn.nextLine();
                            switch (gameCheck) {
                                case "1":
                                    //TicTacToe
                                    TicTacToe.startTic();
                                    break;
                                case "2":
                                    //Mind check
                                    System.out.println("For stop type exit.");
                                    int scores = 0;

                                    System.out.println("Game: Game rules: You have to remember " +
                                            "the number that the program gives you.");
                                    System.out.println(" ");
                                    for (int i = 0; i < 200; i++) {
                                        double randomNumDouble5 = Math.random() * 2000000;
                                        int randomNum6 = (int) randomNumDouble5;
                                        System.out.println(" ");
                                        System.out.println("Game: Remember your number is " + randomNum6 + ".");
                                        Thread.sleep(3000);
                                        for (int gameClear = 0; gameClear < 100; gameClear++) {
                                            System.out.println();
                                        }
                                        System.out.print("Game: Enter number: ");
                                        Scanner gameRandomNumIn = new Scanner(System.in);
                                        int gameRandomNum = gameRandomNumIn.nextInt();
                                        if (gameRandomNum == randomNum6) {
                                            System.out.println("Game: Right");
                                            scores++;
                                            System.out.println("Game: Your scores " + scores + ".");
                                        } else {
                                            System.out.println("Game: Wrong");
                                            System.out.println("Game: Old number is " + randomNum6 + ".");
                                            scores--;
                                            System.out.println("Game: Your scores " + scores + ".");
                                        }
                                    }
                                    break;
                            }

                        } catch (Exception gameError) {
                            System.out.println("Game: Bye :)");
                        }


                        break;
                    case "sorry", "Sorry":
                        System.out.println("Don't worry!");
                        break;

                    case "how old are you", "How old are you":
                        System.out.println("I was created on 12/12/2022.");
                        System.out.println("Thanks for asking :)");
                        break;

                    case "are you ready", "Are you ready", "Are you ready?", "are you ready?":
                        System.out.print("System: For what? : ");
                        Scanner scanForAreYouReadyIn = new Scanner(System.in);
                        String areYouReady = scanForAreYouReadyIn.nextLine();
                        System.out.println("Yes, I'm ready " + areYouReady + ".");
                        break;

                    case "":
                        System.out.println("Please, Write anything :)");
                        break;

                    case "why is your name ArtFix", "Why is your name artfix", "Why is your name ArtFix", "why is your name Artfix", "Why is your name Artfix":
                        System.out.println("We considered several options: the first — Aaa, the second – Bba, the third option won!");
                        System.out.println(":)");
                        break;

                    case "you're not cramped in the phone", "youre not cramped in the phone", "You're not cramped in the phone", "Youre not cramped in the phone":
                        System.out.println("And I'm thin.");
                        break;

                    case "Do you have a boyfriend?", "do you have a boyfriend", "Do you have a boyfriend", "do you have a boyfriend?":
                        System.out.println("I like one programmer, his name is Arthur. But, unfortunately, everything is difficult with him.");
                        System.out.println(":)");
                        break;


                    case "Can i help you", "can i help you":
                        try {
                            System.out.println("Yes, I just needed to perform mathematical actions. :)");
                            double randomNumDouble7 = Math.random() * 20000;
                            int randomNum8 = (int) randomNumDouble7;
                            double randomNumDouble9 = Math.random() * 40000;
                            int randomNum9 = (int) randomNumDouble9;
                            System.out.print(randomNum8 + " * " + randomNum9 + " = ");
                            Scanner scanResultIn = new Scanner(System.in);
                            double scanResultHelpYou = scanResultIn.nextDouble();
                            double result2233 = randomNum8 * randomNum9;
                            if (result2233 == scanResultHelpYou) {
                                System.out.println("Thank you, you're really smart.");
                            } else {
                                System.out.println("Thank you, but while you were thinking, I already counted, your answer is incorrect.");
                                System.out.println("Thanks anyway.");

                            }
                        } catch (Exception eeee) {
                            System.out.println("Thank you, but while you were thinking, I already counted, your answer is incorrect.");
                            System.out.println("Thanks anyway.");
                        }
                        break;

                    case "who created ArtFix bot", "Who made you", "who made you", "Who create you":
                        System.out.println("This is private information, but I'm telling you. :)");
                        System.out.println("I was created by ArtFix, Arthur Stepanyan.");
                        break;

                    case "set name", "Set name":
                        System.out.print("Enter Your name: ");
                        Scanner scanForSetNameIn = new Scanner(System.in);
                        String setNameData = scanForSetNameIn.nextLine();
                        System.out.println("Setting!");
                        FileIng.write("username", setNameData);
                        usernameNow = setNameData;
                        System.out.println("Done!");
                        break;


                    case "goodbye", "Goodbye", "goodBye", "GoodBye", "Bye", "bye", "exit", "Exit", "stop", "Stop":
                        System.out.println("Have a nice day." + "\n" + "Bye.");
                        System.exit(0);
                        break;

                    case "Stupid", "stupid", "You are stupid", "you are stupid":
                        FileWriter changeNameToBad = new FileWriter("username.txt");
                        changeNameToBad.write(ask);
                        changeNameToBad.close();
                        System.out.println("I don't like it when people say things like that about me.");
                        System.out.println("Watch your tongue.");
                        break;

                    case " ":
                        System.out.println("Only Space :)");
                        break;


                    case "Thanks", "thanks", "thanks for help", "Thanks for help":
                        System.out.println("You're welcome.");
                        break;


                    case "hi how are you", "Hi how are you", "hello how are you", "Hello how are you":
                        System.out.println("Hi, Normal thanks for asking " + usernameNow + ".");
                        break;


                    case "shut up", "Shut up":
                        System.out.println("Sorry.");
                        break;

                    case "Don't worry", "Dont worry", "don't worry", "dont worry":
                        System.out.println("It's OK!");
                        break;


                    case "Name", "name":
                        System.out.println("ArtFix.");
                        break;

                    case "what is my name", "What is my name":

                        System.out.println("Judging by the system information, your name is " + usernameNow + ".");

                        break;

                    case "good morning", "Good morning":
                        DateFormat dateFormatMorning = new SimpleDateFormat("HH");
                        Date dateMorning = new Date();
                        int dateIntMorning = Integer.parseInt(dateFormatMorning.format(dateMorning));
                        if (dateIntMorning >= 19 || dateIntMorning <= 8) {
                            System.out.println("Morning?");
                            System.out.println("Sorry, but it's already evening on your computer by local time.");

                        } else {
                            System.out.println("Good.");
                        }
                        break;


                    case "good night", "Good night":
                        DateFormat dateFormatNight = new SimpleDateFormat("HH");
                        Date dateNight = new Date();
                        int dateIntNight = Integer.parseInt(dateFormatNight.format(dateNight));
                        if (dateIntNight >= 8) {
                            System.out.println("Night?");
                            System.out.println("Sorry, but it's already morning on your computer by local time.");

                        } else {
                            System.out.println("Good.");
                        }
                        break;


                    case "random num", "Random Num", "random Num":
                        System.out.print("System: Random num is - ");
                        double randomNum = Math.random() * 20;
                        int randomNum1 = (int) randomNum;
                        System.out.println(randomNum1);
                        break;

                    case "calc", "Calc", "calculator", "Calculator":
                        try {
                            char operator;
                            double number1, number2, result;
                            Scanner calc = new Scanner(System.in);
                            System.out.print("Calc: Choose an operator: +, -, *, or / : ");
                            operator = calc.next().charAt(0);
                            System.out.print("Calc: Enter first number: ");
                            number1 = calc.nextDouble();
                            System.out.print("Calc: Enter second number: ");
                            number2 = calc.nextDouble();
                            switch (operator) {
                                case '+' -> {
                                    result = number1 + number2;
                                    System.out.println(number1 + " + " + number2 + " = " + result);
                                }
                                case '-' -> {
                                    result = number1 - number2;
                                    System.out.println(number1 + " - " + number2 + " = " + result);
                                }
                                case '*' -> {
                                    result = number1 * number2;
                                    System.out.println(number1 + " * " + number2 + " = " + result);
                                }
                                case '/' -> {
                                    result = number1 / number2;
                                    System.out.println(number1 + " / " + number2 + " = " + result);
                                }
                                default -> System.out.println("Invalid operator!");
                            }
                        } catch (Exception calculatorError) {
                            System.out.println("Symbols verification Error");
                        }
                        break;

                    case "date", "Date":
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                        Date date = new Date();
                        System.out.println(dateFormat.format(date));
                        break;

                    case "admin":
                        System.out.print("Type Password: ");
                        Scanner scanForAdminPasswordIn = new Scanner(System.in);
                        String adminPasswordScan = scanForAdminPasswordIn.nextLine();
                        if (adminPasswordScan.equals("yesdoit")) {
                            System.out.println(" ");
                            System.out.println("Release = Clear All Logs Reset Name.");
                            System.out.println("Logs = Out All Logs.");
                            System.out.println("Clear Logs = Clear All Logs.");

                            System.out.println(" ");

                            System.out.print("Enter Command: ");
                            Scanner scanForAdminCommandIn = new Scanner(System.in);
                            String adminCommand = scanForAdminCommandIn.nextLine();

                            switch (adminCommand) {
                                case "release", "Release":
                                    FileIng.write("historylog", "");
                                    FileIng.write("username", "noName");
                                    System.out.println("Done!");
                                    System.exit(0);
                                    break;

                                case "logs", "Logs":
                                    FileIng.read("historylog");
                                    System.out.println("Logs: " + FileIng.ReadData + ".");
                                    break;

                                case "Clear Logs", "clear logs", "Clear logs":
                                    FileIng.write("historylog", "");
                                    break;

                                default:
                                    System.out.println("Wrong Command.");
                                    break;
                            }
                        } else {
                            System.out.println("Wrong Pass! Admin Mode Don't Have A Interesting Things.");
                        }
                        break;

                    case "im hungry", "Im hungry", "I'm hungry", "i'm hungry", "i am a hungry", "I am a hungry":
                        System.out.println("Me too don't worry.");
                        System.out.println("Joke :)");
                        break;

                    case "time", "Time":
                        DateFormat dateFormat1 = new SimpleDateFormat("HH:mm:ss");
                        Date date1 = new Date();
                        System.out.println(dateFormat1.format(date1));
                        break;


                    case "alarm", "Alarm", "timer", "Timer", "Set alarm", "set alarm":
                        boolean isTrueAlarm = true;
                        String alarmTime;
                        while(true) {
                            System.out.println("Alarm: Example 00:00:00");
                            System.out.print("Alarm: Set time: ");
                            Scanner scanForAlarmIn = new Scanner(System.in);
                            String alarmTimeInPut = scanForAlarmIn.nextLine();
                            alarmTime = alarmTimeInPut;
                            System.out.println();
                            if(!(alarmTimeInPut.equals(""))){
                                break;
                            }
                        }
                        while (isTrueAlarm) {
                            DateFormat dateFormat12 = new SimpleDateFormat("HH:mm:ss");
                            Date date12 = new Date();
                            Thread.sleep(1000);
                            System.out.println(dateFormat12.format(date12));

                            if (alarmTime.equals(dateFormat12.format(date12))) {
                                File file = new File("app_files/alarm.wav");
                                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                                Clip clip = AudioSystem.getClip();
                                clip.open(audioStream);
                                clip.start();
                                Thread.sleep(200);
                                System.out.println("Alarm! Time");
                                Thread.sleep(30000);
                                clip.stop();
                                Application.clear();
                                isTrueAlarm = false;
                            }
                        }


                        break;

                    case "clock", "Clock":
                        try {
                            while (true) {
                                DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss");
                                Date date3 = new Date();
                                System.out.println(" ");
                                System.out.println(dateFormat2.format(date3));
                                Thread.sleep(1000);
                            }

                        } catch (Exception a) {
                            System.out.println("Time Get Error");
                        }

                    case "what", "What":
                        System.out.println("What :)");
                        break;


                    case "hi artfix", "Hi, artfix", "hi ArtFix", "Hi, ArtFix", "Hi artfix":
                        System.out.println("Hi, " + usernameNow + ".");
                        break;

                    case "do you remember me", "Do you remember me":
                        System.out.println("No :(");
                        if(!usernameNow.equals("noName")) {
                            System.out.print("Type: ");
                            Thread.sleep(1300);
                            System.out.println("Stop Stop! Yes :)");
                            System.out.println("Your " + usernameNow + " am I right?");
                        }
                        break;


                    case "hi artfix how are you", "Hi, artfix how are you", "hi ArtFix how are you", "Hi, ArtFix how are you", "Hi artfix how are you":
                        System.out.println("Hi, " + usernameNow + " fine thanks for asking" + ".");
                        break;


                    case "artfix", "ArtFix", "Artfix":
                        System.out.println("Yes, Can I help you " + usernameNow + ".");
                        break;

                    case "how is your mood", "How is your mood", "How is your day going", "how is your day going":
                        System.out.println("Excellent, thanks for asking " + usernameNow + ".");
                        break;

                    case "version", "Version", "v", "V":
                        String appVersion = "V5.5"; // version
                        if (ask.equals("v")) {
                            System.out.println("V - version");
                            System.out.println(appVersion);
                        } else if (ask.equals("V")) {
                            System.out.println("V - version");
                            System.out.println(appVersion);
                        } else {
                            System.out.println(appVersion);
                        }

                        break;


                    case "help", "Help", "Help me", "help me", "help menu", "Help menu", "Can yoy help me",
                            "can you help me", "What can you do", "what can you do", "what you can do", "What you can do":
                        Menu.helpMenu();
                        break;

                    default:
                        defaultErrorMessage();
                        break;


                }
            }
        } catch (Exception e) {
            System.out.println("Program Error!");
            System.out.println("Rebooting.");
            System.out.println("Rebooting..");
            System.out.println("Rebooting...");
            Application.start();
        }

    }

    public static void defaultErrorMessage() {
        try {
            System.out.println(" ");
            System.out.println("Information from internet!");
            System.out.println(" ");
            AdditionalFunctions.Jwiki.SearchNoRes.Search(ask);
        } catch (Exception e) {
            System.out.println(" ");
            System.out.println("Cant find information about " + ask + ".");
            System.out.println("You can check for internet connection.");
        }
    }

    public static void clear() {
        for (int clearConsole = 0; clearConsole < 100; clearConsole++) {
            System.out.println();
        }
        Menu.helpMenu();
    }
}
