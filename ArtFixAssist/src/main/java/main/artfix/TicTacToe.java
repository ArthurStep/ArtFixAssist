package main.artfix;

import java.util.Scanner;

public class TicTacToe {
    public static void startTic(){
        TicTacToe.gameRestart();
        TicTacToe.Table();
        while (true) {
            System.out.println(" ");
            System.out.print("Type Your number: ");
            Scanner scanForTicTacToeIn = new Scanner(System.in);
            String TicTacToeScan = scanForTicTacToeIn.nextLine();

            switch (TicTacToeScan) {
                case "1":
                    if (!Config.UsedBox1) {
                        Config.Box1 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox1 = true;
                    break;

                case "2":
                    if (!Config.UsedBox2) {
                        Config.Box2 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox2 = true;
                    break;

                case "3":
                    if (!Config.UsedBox3) {
                        Config.Box3 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox3 = true;
                    break;

                case "4":
                    if (!Config.UsedBox4) {
                        Config.Box4 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox4 = true;
                    break;

                case "5":
                    if (!Config.UsedBox5) {
                        Config.Box5 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox5 = true;
                    break;

                case "6":
                    if (!Config.UsedBox6) {
                        Config.Box6 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox6 = true;
                    break;

                case "7":
                    if (!Config.UsedBox7) {
                        Config.Box7 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox7 = true;
                    break;

                case "8":
                    if (!Config.UsedBox8) {
                        Config.Box8 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox8 = true;
                    break;

                case "9":
                    if (!Config.UsedBox9) {
                        Config.Box9 = "x";
                    } else {
                        System.out.println("Number already used.");
                        System.exit(0);
                    }
                    Config.UsedBox9 = true;
                    break;

            }

            if (Config.Box1.equals("x") && Config.Box2.equals("x") && Config.Box3.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }
            if (Config.Box4.equals("x") && Config.Box5.equals("x") && Config.Box6.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }
            if (Config.Box7.equals("x") && Config.Box8.equals("x") && Config.Box9.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }


            if (Config.Box1.equals("x") && Config.Box4.equals("x") && Config.Box7.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }
            if (Config.Box2.equals("x") && Config.Box5.equals("x") && Config.Box8.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }
            if (Config.Box3.equals("x") && Config.Box6.equals("x") && Config.Box9.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }


            if (Config.Box1.equals("x") && Config.Box5.equals("x") && Config.Box9.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }
            if (Config.Box7.equals("x") && Config.Box5.equals("x") && Config.Box3.equals("x")) {
                TicTacToe.Table();
                System.out.println("You win.");
                Application.start();
            }


            if (Config.Box1.equals("o") && Config.Box2.equals("o") && Config.Box3.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }
            if (Config.Box4.equals("o") && Config.Box5.equals("o") && Config.Box6.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }
            if (Config.Box7.equals("o") && Config.Box8.equals("o") && Config.Box9.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }


            if (Config.Box1.equals("o") && Config.Box4.equals("o") && Config.Box7.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }
            if (Config.Box2.equals("o") && Config.Box5.equals("o") && Config.Box8.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }
            if (Config.Box3.equals("o") && Config.Box6.equals("o") && Config.Box9.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }


            if (Config.Box1.equals("o") && Config.Box5.equals("o") && Config.Box9.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }
            if (Config.Box7.equals("o") && Config.Box5.equals("o") && Config.Box3.equals("o")) {
                TicTacToe.Table();
                System.out.println("You lose.");
                Application.start();
            }

            if (!Config.Box1.equals("-") && !Config.Box2.equals("-") && !Config.Box3.equals("-")
                    && !Config.Box4.equals("-") && !Config.Box5.equals("-") && !Config.Box6.equals
                    ("-") && !Config.Box7.equals("-") && !Config.Box8.equals("-") && !Config.Box9.equals("-")) {
                TicTacToe.Table();
                System.out.println("It's Tie.");
            }


            RandomNumForToe.getNum();
            if (RandomNumForToe.randomNumGet.equals("1")) {
                if (Config.UsedBox1) {
                    RandomNumForToe.getNum();
                }
            }

            if (RandomNumForToe.randomNumGet.equals("2")) {
                if (Config.UsedBox2) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("1")) {
                        if (Config.UsedBox1) {
                            RandomNumForToe.getNum();
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("3")) {
                if (Config.UsedBox3) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("2")) {
                        if (Config.UsedBox2) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("1")) {
                                if (Config.UsedBox1) {
                                    RandomNumForToe.getNum();
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("4")) {
                if (Config.UsedBox4) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("3")) {
                        if (Config.UsedBox3) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("2")) {
                                if (Config.UsedBox2) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("1")) {
                                        if (Config.UsedBox1) {
                                            RandomNumForToe.getNum();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("5")) {
                if (Config.UsedBox5) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("4")) {
                        if (Config.UsedBox4) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("3")) {
                                if (Config.UsedBox3) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("2")) {
                                        if (Config.UsedBox2) {
                                            RandomNumForToe.getNum();
                                            if (RandomNumForToe.randomNumGet.equals("1")) {
                                                if (Config.UsedBox1) {
                                                    RandomNumForToe.getNum();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("6")) {
                if (Config.UsedBox6) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("5")) {
                        if (Config.UsedBox5) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("4")) {
                                if (Config.UsedBox4) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("3")) {
                                        if (Config.UsedBox3) {
                                            RandomNumForToe.getNum();
                                            if (RandomNumForToe.randomNumGet.equals("2")) {
                                                if (Config.UsedBox2) {
                                                    RandomNumForToe.getNum();
                                                    if (RandomNumForToe.randomNumGet.equals("1")) {
                                                        if (Config.UsedBox1) {
                                                            RandomNumForToe.getNum();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("7")) {
                if (Config.UsedBox7) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("6")) {
                        if (Config.UsedBox6) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("5")) {
                                if (Config.UsedBox5) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("4")) {
                                        if (Config.UsedBox4) {
                                            RandomNumForToe.getNum();
                                            if (RandomNumForToe.randomNumGet.equals("3")) {
                                                if (Config.UsedBox3) {
                                                    RandomNumForToe.getNum();
                                                    if (RandomNumForToe.randomNumGet.equals("2")) {
                                                        if (Config.UsedBox2) {
                                                            RandomNumForToe.getNum();
                                                            if (RandomNumForToe.randomNumGet.equals("1")) {
                                                                if (Config.UsedBox1) {
                                                                    RandomNumForToe.getNum();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("8")) {
                if (Config.UsedBox8) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("7")) {
                        if (Config.UsedBox7) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("6")) {
                                if (Config.UsedBox6) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("5")) {
                                        if (Config.UsedBox5) {
                                            RandomNumForToe.getNum();
                                            if (RandomNumForToe.randomNumGet.equals("4")) {
                                                if (Config.UsedBox4) {
                                                    RandomNumForToe.getNum();
                                                    if (RandomNumForToe.randomNumGet.equals("3")) {
                                                        if (Config.UsedBox3) {
                                                            RandomNumForToe.getNum();
                                                            if (RandomNumForToe.randomNumGet.equals("2")) {
                                                                if (Config.UsedBox2) {
                                                                    RandomNumForToe.getNum();
                                                                    if (RandomNumForToe.randomNumGet.equals("1")) {
                                                                        if (Config.UsedBox1) {
                                                                            RandomNumForToe.getNum();
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (RandomNumForToe.randomNumGet.equals("9")) {
                if (Config.UsedBox9) {
                    RandomNumForToe.getNum();
                    if (RandomNumForToe.randomNumGet.equals("8")) {
                        if (Config.UsedBox8) {
                            RandomNumForToe.getNum();
                            if (RandomNumForToe.randomNumGet.equals("7")) {
                                if (Config.UsedBox7) {
                                    RandomNumForToe.getNum();
                                    if (RandomNumForToe.randomNumGet.equals("6")) {
                                        if (Config.UsedBox6) {
                                            RandomNumForToe.getNum();
                                            if (RandomNumForToe.randomNumGet.equals("5")) {
                                                if (Config.UsedBox5) {
                                                    RandomNumForToe.getNum();
                                                    if (RandomNumForToe.randomNumGet.equals("4")) {
                                                        if (Config.UsedBox4) {
                                                            RandomNumForToe.getNum();
                                                            if (RandomNumForToe.randomNumGet.equals("3")) {
                                                                if (Config.UsedBox3) {
                                                                    RandomNumForToe.getNum();
                                                                    if (RandomNumForToe.randomNumGet.equals("2")) {
                                                                        if (Config.UsedBox2) {
                                                                            RandomNumForToe.getNum();
                                                                            if (RandomNumForToe.randomNumGet.equals("1")) {
                                                                                if (Config.UsedBox1) {
                                                                                    RandomNumForToe.getNum();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("I select: " + RandomNumForToe.randomNumGet + ".");

            switch (RandomNumForToe.randomNumGet) {
                case "1":
                    if (Config.Box1.equals("-")) {
                        Config.Box1 = "o";
                        TicTacToe.Table();
                        Config.UsedBox1 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "2":
                    if (Config.Box2.equals("-")) {
                        Config.Box2 = "o";
                        TicTacToe.Table();
                        Config.UsedBox2 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "3":
                    if (Config.Box3.equals("-")) {
                        Config.Box3 = "o";
                        TicTacToe.Table();
                        Config.UsedBox3 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "4":
                    if (Config.Box4.equals("-")) {
                        Config.Box4 = "o";
                        TicTacToe.Table();
                        Config.UsedBox4 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "5":
                    if (Config.Box5.equals("-")) {
                        Config.Box5 = "o";
                        TicTacToe.Table();
                        Config.UsedBox5 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "6":
                    if (Config.Box6.equals("-")) {
                        Config.Box6 = "o";
                        TicTacToe.Table();
                        Config.UsedBox6 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "7":
                    if (Config.Box7.equals("-")) {
                        Config.Box7 = "o";
                        TicTacToe.Table();
                        Config.UsedBox7 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "8":
                    if (Config.Box8.equals("-")) {
                        Config.Box8 = "o";
                        TicTacToe.Table();
                        Config.UsedBox8 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;

                case "9":
                    if (Config.Box9.equals("-")) {
                        Config.Box9 = "o";
                        TicTacToe.Table();
                        Config.UsedBox9 = true;
                    } else {
                        System.out.println("Err.");
                        System.exit(0);
                    }
                    break;


                default:
                    System.out.println("System Err.");
                    Application.start();
                    break;
            }

        }
    }

    public static void Table() {
        System.out.println(" ");
        System.out.println("          -------------");
        System.out.println("          | " + Config.Box1 + " | " + Config.Box2 + " | " + Config.Box3 + " |");
        System.out.println("          -------------");
        System.out.println("          | " + Config.Box4 + " | " + Config.Box5 + " | " + Config.Box6 + " |");
        System.out.println("          -------------");
        System.out.println("          | " + Config.Box7 + " | " + Config.Box8 + " | " + Config.Box9 + " |");
        System.out.println("          -------------");
        System.out.println(" ");
    }

    public static void gameRestart(){
        Config.Box1 = "-";
        Config.Box2 = "-";
        Config.Box3 = "-";
        Config.Box4 = "-";
        Config.Box5 = "-";
        Config.Box6 = "-";
        Config.Box7 = "-";
        Config.Box8 = "-";
        Config.Box9 = "-";

        Config.UsedBox1 = false;
        Config.UsedBox2 = false;
        Config.UsedBox3 = false;
        Config.UsedBox4 = false;
        Config.UsedBox5 = false;
        Config.UsedBox6 = false;
        Config.UsedBox7 = false;
        Config.UsedBox8 = false;
        Config.UsedBox9 = false;
    }
}
